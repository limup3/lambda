import Vue from 'vue'
import VueRouter from 'vue-router'
import Music from "../components/Music";
import Movie from "../components/Movie";
import Home from "../components/Home";
import Soccer from "../components/Soccer";

Vue.use(VueRouter)
export default new VueRouter({
    mode:'history',
    routes : [
        {path: '/soccer', component: Soccer},
        {path: '/', component: Home},
        { path: "/music", component: Music },
        { path: "/movie", component: Movie }
    ]



})