import axios from 'axios'

const state = {
    crawler : {},
    fail : false,
    auth : false,
    context : 'http://localhost:5000/'
}

const mutations ={
    LIST_COMMIT(state, data){
        state.auth = true
        state.crawler = data.crawler
    }

}

const actions = {

    async search({commit}, searchWord){
        axios.post('','',{})
            .then(()=>{})
            .catch(()=>{})
    }
    // async bugsmusic({commit}){
    //     const url = state.context+`proxy/`
    //     const headers = {
    //         authorization: 'JWT fefege..',
    //         Accept : 'application/json',
    //         'Content-Type': 'application/json'
    //     }
    //     axios.get(url,headers)
    //         .then(res => {
    //             console.log(`status code: ${res.status}`);
    //             console.log(`headers: ${res.headers}`);
    //             console.log(`data: ${res.data}`);
    //             commit('LIST_COMMIT',`${res.data}`)
    //         })
    //         .catch(()=>{
    //             alert('서버전송 실패')
    //         })
    // }

}

const getters = {

}

export default  {
    name : 'crawler',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}