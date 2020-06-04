import axios from 'axios'
import router from "@/router";

const state = {
    context : "http://localhost:5000/",
    searchWord :'null',
    pageNumber:'0',
    list : [],
    pages : [],
    item : {},
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
    },

    async retrieveOne({commit},payload){

        axios
            .get(`${state.context}${payload.cate}/${payload.searchWord}`)
            .then(({data})=>{
                commit("DETAIL",data)
                router.push('/MovieDetail')
            })
            .catch()
    }


}

const mutations = {

    SEARCHWORD(state, data){
        alert(`뮤테이션:: ${data}`)
        state.searchWord = data
    },
    TRANSFER(state,data){
        state.pager = data.pager
        state.list = data.list
    },
    DETAIL(state,data){
        state.item = data
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