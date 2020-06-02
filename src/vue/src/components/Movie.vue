<template>
    <div>
        <h3>검색결과 : {{count}}</h3>
        <h3>전체개수 : {{allcount}}</h3>
        <v-simple-table>
            <template v-slot:default>
                <thead>
                <tr>
                    <th class="text-left">순위</th>
                    <th class="text-left">영화명</th>
                    <th class="text-left">날짜</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="item of movie" :key="item.seq">
                    <td><img :src="item.seq"></td>
                    <td>{{ item.title }}</td>
                    <td>{{item.rankDate}}</td>
                </tr>
                </tbody>
            </template>
        </v-simple-table>
        <div class="text-center">
            <span style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px" v-if="existPrev">이전</span>

            <span style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px"
                  v-for="i of 5" :key="i">
                {{i+5}}
            </span>
            <span style="width: 50px; height: 50px; border: 1px solid black;margin-right: 5px" v-if="existNext">다음</span>
<!--            <v-pagination v-model="page" :length="5" :total-visible="5"></v-pagination>-->
        </div>
    </div>


</template>

<script>
    import { mapState } from "vuex";

    export default {
        data () {
            return {
                page: 1,
                existPrev: false,
                existNext: true,
                num:5

            }
        },
        created() {
            alert('무비에서 크리티드 실행됨')
        },
        computed: {
            ...mapState({
                count : state => state.movie.count,
                movie: state => state.movie.movie,
                rankDate: state => state.movie.rankDate,
                allcount: state => state.movie.allcount
            })
        }
    };
</script>