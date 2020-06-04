import axios from "axios";

export const proxy={



    methods: {
        tester(d){
            alert(d)
        },
        paging(url) {
    console.log("함수에서 실행")
    const movies = []
    const pages = []
    let temp = {}
    axios
        .get(url)
        .then(({data})=>{
            data.list.forEach(elem => {movies.push(elem)})
            let pager = data.pager
            alert('>>'+pager.rowCount)
            let i = pager.pageStart +1
            console.log(`페이지 끝: ${pager.pageEnd}`)

            for(; i <= pager.pageEnd + 1;i++){
                pages.push(i)

            }
            temp.prevBlock = pager.prevBlock
            temp.nextBlock = pager.nextBlock
            temp.rowCount = pager.rowCount
            temp.existPrev = pager.existPrev
            temp.existNext = pager.existNext
            temp.nowPage = pager.nowPage
        })
        .catch(err=>{
            alert(`영화 통신 실패 ${err}`)
        })
    return {movies, pages, temp}
}
    }
}