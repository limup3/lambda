import Vue from 'vue'
import VueRouter from 'vue-router'
import Crawler from "../components/Crawler";
import Retriever from "../components/Retriever";
import Movie from "../components/Movie";
import Home from "../components/Home"

Vue.use(VueRouter)
export default new VueRouter({
    mode:'history',
    routes : [
        {path: '/crawler', component: Crawler},
        {path: '/', component: Home},
        { path: "/retriever", component: Retriever },
        { path: "/movie", component: Movie }
    ]



})