import axios from 'axios'
import router from "@/router";
//
const state ={
    movie: [],
    context : 'http://localhost:5000/'
}

const actions = {
    //'search':()=>{}
    async search({commit},searchWord){
        alert('영화 액션에 들어옴')
    axios.get(state.context+'/movie/'+searchWord)
        .then(({data})=>{

            commit("SEARCH",data);
            router.push("/movie");
        })
        .catch(()=>{
                alert('영화 통신 실패!')
        })
    }
}

const mutations = {
    SEARCH(state,data) {
        alert('영화 뮤테이션에 들어옴'+ data.count)
        state.movie = [];
        state.count = data.count;
        data.list.forEach(item => {
            state.movie.push({
                seq: item.seq,
                title: item.title
            });
        });
    }
};

const getters = {
    movie : state => state.movie
}

export default {
    name: 'movie',
    namespaced : true,
    state,
    actions,
    mutations,
    getters
}