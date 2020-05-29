import axios from 'axios'
// import router from "@/router";

const state = {
    soccer: [],
    context : 'http://localhost:5000/'
}

const actions = {
    async search({commit},searchWord){
        alert('액션에 들어옴')
    axios.get(state.context+`/soccer/`+searchWord)
        .then(({data})=>{

            commit("SEARCH",data);

        })
        .catch(()=>{
            alert('통신 실패!')
        })

    },

}

const mutations = {
    SEARCH() {
        alert('뮤테이션에 들어옴')
    }
}

const getters = {

}

export default {
    name: 'soccer',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}