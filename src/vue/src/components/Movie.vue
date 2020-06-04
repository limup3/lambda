<template>
    <div>
        <h3>검색결과 : {{pager.rowCount}}</h3>
        <span style="float: right; margin-right: 200px"><input id="searchWord"  type="text" style="border: 1px solid black">
            <button @click="retrieve">검색</button></span>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">No.</th>
                    <th class="text-left">순위</th>
                    <th class="text-left">영화제목</th>
                    <th class="text-left">집계일</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of list" :key="item.seq">
                    <td>{{ item.no }}</td>
                    <td><img :src="item.seq"/></td>
                    <td id="title"><a @click="retrieveOne(item.no)" href="#">{{ item.title }}</a></td>
                    <td>{{ item.rankDate }}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center" >
            <div style="margin: 0 auto; width: 500px; height: 100px">
                <span @click="transferPage(pager.prevBlock)" v-if ='pager.existPrev' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">이전</span>
                <span id="page" @click="transferPage(i-1)" v-for='i of pages' :key="i" style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">{{i}}</span>
                <span @click="transferPage(pager.nextBlock)" v-if ='pager.existNext' style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px">다음</span>
            </div>

            <!--<v-pagination v-model="page" :length="5" :total-visible="5"></v-pagination>-->
        </div>
    </div>


</template>

<script>
    import { mapState } from "vuex";
    import {proxy} from "./mixins/proxy"
    // import axios from "axios";
    export default {
        mixins: [proxy],
        created() {

            let json = proxy.methods.paging(`${this.$store.state.search.context}movies/null/0`)
            this.$store.state.search.list = json.movies
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp

        },
        computed: {
            ...mapState({
                list: state => state.search.list,
                pages: state => state.search.pages,
                pager: state => state.search.pager,
            })

        },
        methods: {
            transferPage(d) {
                alert(`이동페이지 : ${d}`)
                this.$store.dispatch('search/transferPage', {cate: 'movies', searchWord: null, pageNumber: d})
            },
            retrieve(){
                let searchWord = document.getElementById('searchWord').value
                if(searchWord === '')searchWord = 'null'

                this.$store.dispatch('search/transferPage',
                    {cate: 'movies', searchWord: searchWord, pageNumber: 0})
            },
            retrieveOne(no){
                alert(no)
                    this.$store.dispatch('search/retrieveOne',
                    {cate: 'movies', searchWord: no})
            }
            // transferNext() {
            //     alert('다음')
            //     this.$store.dispatch('search/nextBlock',{cate: 'movies'})
            //
            // },
            // transferPrev() {
            //
            // }
        }
    }


</script>