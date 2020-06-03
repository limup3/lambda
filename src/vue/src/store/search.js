import axios from 'axios'
import router from "@/router";

const state = {
    context : "http://localhost:5000/",
    searchWord :'null',
    pageNumber:'0',
    list : [],
    pages : [],
    pager: {}
}

const actions ={
    async find({commit},searchWord){
        alert('>>> '+searchWord)
        commit("SEARCHWORD",searchWord)
        switch (searchWord) {
            case '영화': router.push("/movie")
                break
            case '벅스': router.push("/Music")
                break
            case '축구': router.push("/Soccer")
                break
        }


    },
    async transferPage({commit},payload){

        axios
            .get(`${state.context}${payload.cate}/${payload.searchWord}/${payload.pageNumber}`)
            .then(({data})=>{
                commit("TRANSFER",data)
            })
            .catch()
        console.log(payload.searchWord)
        console.log(payload.pageNumber)
    },

    async nextBlock({commit},payload){
        axios
            .get(`${state.context}${payload.cate}`)
            .then(({data})=>{
                commit("BLOCK",data)
            })
            .catch()
    }


}

const mutations = {
    // MOVIE(state, data){
    //     alert("영화 뮤테이션에서 결과 수 : " + data.count)
    //     state.movies = []
    //     state.pager = data.pager;
    //     data.list.forEach(item => {
    //         state.movies.push({
    //             movieSeq: item.movieSeq,
    //             rank: item.rank,
    //             title: item.title,
    //             rankDate: item.rankDate
    //         });
    //     });
    // },
    SEARCHWORD(state, data){
        alert(`뮤테이션:: ${data}`)
        state.searchWord = data
    },
    TRANSFER(state,data){
        state.pager = data.pager
        state.list = data.list
    },
    BLOCK(){

    }
}

const getters = {

}

export default {
    name: 'search',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}