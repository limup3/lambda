<template>
    <div>
        <h3>넘버 : {{item.no}}</h3>
        <h3>순위 : {{item.seq}}</h3>
        <h3>제목 : {{item.title}}</h3>
        <h3>날짜 : {{item.rankDate}}</h3>




    </div>
</template>

<script>
    import {mapState} from 'vuex';
    export default {
        name: "MovieDetail",
        computed: {
            ...mapState({
                item: state => state.search.item
                     })

        }
    }
</script>

<style scoped>

</style>