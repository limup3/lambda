<template>
    <div>
        <div id="top">
            <a href="https://www.google.com/intl/ko/gmail/about/#">Gmail</a>
            <a href="https://www.google.co.kr/imghp?hl=ko&tab=wi&ei=s4dDWb7SFsmw0gTlr6eQBA&ved=0EKouCBUoAQ">이미지</a>
            <a href="#"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAeFBMVEX///8AAACenp7Pz89hYWE+Pj59fX3z8/PJycnb29v39/cPDw+9vb37+/uysrJtbW3m5uZKSkrf399ISEirq6snJyeNjY0dHR13d3fV1dVnZ2dYWFjs7OwsLCzOzs4SEhKCgoJAQECWlpa4uLgzMzNTU1MqKioaGhrvVL5HAAAE00lEQVR4nO2dbXeiMBBGg7UrIoqvULVbrbXb//8Pt9TakhFyNEaSZ5z7zZ6cw9wSQgiTQSmdXppPikEEyscsf+spE/HKd4wO6MbNfhPfwTliVu+YZL4Dc0iWnAouN76jcspgSQVHvkNyzkgXnPuO5wbMeZ/BkspZXPqO5Ub8XIsJr0Hml8FxROV0m9DJvm/0vuO4IYdbP5eZTB0z7qfwcBLpZDtLx8PGqWvYDMcpHVNWn49L+l8Wfd9hXkl/oQv1VKr/AV3wU1EXSlWud1Hf8TlA76g5GUlT3+E5QO+VE1Vov8e+w3PAWDMqlL4mgzqKVhnqF6IiPzkghviIIT5iiI8Y4iOG+IghPmKIjxjiI4b4iCE+YoiPGOIjhviIoYnxKFuvu/lDK4FaY2/YXx+bFXNjQ8/YGiZP1YaLgM+jpeH0r94y6rQX8oXYGZL3/yXb1kK+ECvD6algmQQQJjaGCUlS+WbU0NwzNoZPUT3PpF1n3W2VJ1eGjRm2K9LwT1PDG7F3ZdicvTj1a/joyFBPUNHY8jA0JPKTboJq2DUcQ++mqIavhmPoW1NQDR8Nx+BhODMcQ89HRTU0xD14PrflTXBlSNKIq0zO/l/cBFeGpE0VMjOFNdQzpQ3tYQ1JTuov9OGiaYZ+K/66Mmy6Et9pu+nLQ5u8nGwUtTZU2zrBDX14CgQrw5OdNSXTxtZ+sTOs2cIXqqD1amJHb/keaBdVV6wIT6sPwiEvCVsbKvWwOuzOeAzZ78o3M8NlHL+E2z8PXGUIgRjiI4b4iCE+YoiPGOIjhviIIT5iiI8Y4iOGRqbz3a4T15TODAl7w15n/90sq38lEgjWhqOPSsPMXK7XK5aGQ5pV89JeyBdiZ9j7F1HeWgz6IqwMk310SqiKVobrqI5Axxsbw12tYFTQwllpp13q3xBZGDamX9JM77YzFZxl0DaXcCX3DNRsE1I8sgrZdIFqaKgUTQ6BamiqM6yXIUQ1NGVf8sgvve8MWh6G/K9D/mMp//uhYTLGZE5zB/NSmrV3pKDtYJ8t7uD58A6e8VVCt3KHKyhrbc1wXy9Vd7DmXcL8vQUKYoiPGOIjhviIIT5iiI8Y4iOG+IghPmKIjxga+drLHfpHEq8wPO7H34dbu7TE2rBffZ8fcs0BW0Pyhm0Sbt0BS0P2tU3q6tOE+u1gK8NtjSAt1hYMNobs60Txr/XFv15b8yHIbRHVkH/dRP61L/nXL+WfQftqOAYPQ/61oPnX8+Zfk51/Xf07+DYC/+9bqOR0j2xJoPmXNob8vzNTqxiqoO1KFPvvPX1ei9pAuQg4w9TWUKn+z/RtEfKC8FXvLQ7fztsF/M21kmsMMRBDfMQQHzHERwzxEUN8xBAfMcRHDPERQ3zEEB8xxEcM8RFDfO7ckJbNRYTk+6oP7Wfo22HOQU//KUjiYeo7PAfo6bATkuGc+Q7PAfrOkFy96b021D0U59PXhVJa9nGBrthf6EK909zKLB2jjqjDcUo3L5V5aXHEmbg0N6VxozP7OrecT2J86L6mOsHYHG9+ycB3JDdi81M6rzFDFpxKZpqh2jMw2s46Qzo+LCT3jt9ZpHsj1ZLXcLOpyQ5NON00svoCpDGX2c0sbpy6xnWb0tFYNfuV9NJ8UviO0Zpikqe0wPF/RiRrIcJWTC4AAAAASUVORK5CYII=" title="Google 앱"></a>
            <input id="login" type="button" value="로그인" onclick="location.href='https://accounts.google.com/signin/v2/identifier?hl=ko&passive=true&continue=https%3A%2F%2Fwww.google.co.kr%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin'">
        </div>

        <br>

        <div>
            <img id="google" src="https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png" title="Google">
        </div>

        <div>
            <input id="search" v-model="searchWord" type="text" style="background:url(5.png), url(6.png); background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;" title="검색">

        </div>

        <div id="box">
            <input id="google_search" type="button"  value="검색" @click="search">
        </div>
        <div>
            <li v-for="item in items" :key="item.searchWord">
                {{ item.searchWord }}
            </li>
        </div>


        <div id="bottom">

            <div id="bottom_left">
                <a href="https://www.google.co.kr/intl/ko/ads/?fg=1">광고</a>
                <a href="https://www.google.co.kr/services/?fg=1#?modal_active=none">비즈니스</a>
                <a href="https://www.google.co.kr/intl/ko/about/">Google 정보</a>
            </div>

            <div id="bottom_right">
                <a href="https://www.google.co.kr/intl/ko/policies/privacy/?fg=1">개인정보처리방침</a>
                <a href="https://www.google.co.kr/intl/ko/policies/terms/regional.html">약관</a>
                <a href="#">설정</a>
            </div>
        </div>
    </div>
</template>

<script>
    import {mapState} from 'vuex'

    export default {
        name: "Crawler",
        components:{},
        data(){
            return {
                searchWord : '',
                item: [

                ]
            }
        },
        computed : {
            ...mapState({
                bugsmusic : (state)=>state.crawling.bugsmusic,
               //state.index의 크롤링을 실행하고 크롤링 안에있는 벅스뮤직실행
            })
        },
        methods: {
            search(){
                alert(this.searchWord)
                this.$store.dispatch('crawling/search',this.searchWord)
            }
        }

        // data : ()=>{
        //     return {
        //         posts: []
        //     }
        // },
        // computed: {
        //
        // },
        //
        // methods: {
        //     search(){
        //         // const baseURI = 'http://localhost:8080/proxy';
        //         alert('z')
        //         this.$store.dispatch('crawler/bugsmusic')
        //         //     this.$http.get(`${baseURI}/posts`)
        //         .then((result => {
        //             console.log(result)
        //             this.posts = result.data
        //
        //         }))
        //
        //     }
        // }
    }

</script>

<style scoped>

    body{
        margin: 0px;                    /* margin 여백: 0px */
        min-width: 1050px;              /* 최소 너비: 1050px */
        min-height: 550px;              /* 최소 높이: 550px */
    }

    #top{
        margin: 5px 5px;
        float: right;                   /* 오른쪽 정렬 */
    }

    a{
        text-decoration: none;
        font-size: 10.5pt;
        margin: 0px 10px;
        color: grey;                    /* 텍스트 색: 회색 */
    }

    a:hover{
        text-decoration: underline;     /* 마우스 오버시(hover) 텍스트 밑줄*/
    }

    img{
        margin: 10px 7px;
        width: 20px;                    /* 이미지 너비: 20px */
        vertical-align: middle;              /* 세로정렬: 가운데 */
    }

    #login{
        background-color: #4485F3;      /* 배경색: #4485F3 */
        color: #FFFFFF;                      /* 글자색: #FFFFFF */
        width: 70px;
        height: 30px;
        border: none;                   /* 테두리: 없음 */
        vertical-align: middle;
        margin: 10px 12px 10px 7px;
        font-weight: bold;              /* 글씨 굵게 */
        font-size: 10pt;
        border-radius: 2px;                  /* 테두리 각을 둥그렇게 */
    }

    #google{
        display: block;                      /* 블록지정 */
        width: 290px;
        height: 100px;
        margin: 180px auto 20px;        /* margin 여백: 상(180px) 우(auto) 하(20px) 좌(auto) */
    }

    #search{
        display: block;
        margin: 0 auto;
        width: 550px;
        height: 50px;
        font-size: 15pt;
        box-shadow: 3px 3px 5px #C3C3C3;/* 박스 테두리 그림자: (오른쪽 위치) (아래 위치) (블러) (색상) */
        border: 1px solid #EAEAEA;           /* border: (선 굵기) (선 모양) (선 색) */
    }

    #box{
        text-align: center;                       /* 중앙 정렬 */
    }

    #google_search{
        width: 135px;
        height: 40px;
        margin: 30px 3px;
        border: none;
        background-color: #F4F4F4;
        font-weight: bold;
        color: grey;
    }

    #Feeling_Lucky{
        width: 180px;
        height: 40px;
        margin: 30px 3px;
        border: none;
        background-color: #F4F4F4;
        font-weight: bold;
        color: grey;
    }

    #google_search:hover, #Feeling_Lucky:hover{
        border: 1px solid #C6C6C6;
        color: black;
    }

    #bottom{
        border:1px solid #E4E4E4;

        /* 테두리 오른쪽 왼쪽 선 때문에 전체화면에서 y축 스크롤이 생김 --> 테두리 왼쪽 오른쪽 박스선 제거 */
        border-right: none;
        border-left: none;

        /* 위치 맨 아래로 지정 */
        position:absolute;
        bottom: 0px;

        background-color: #F2F2F2;
        height: 50px;
        width: 100%;
        min-width: 1050px;
    }

    #bottom_left{
        float: left;                    /* 왼쪽 정렬 */
        padding: 15px;                       /* padding 여백: 15px */
    }

    #bottom_right{
        float: right;
        padding: 15px;
    }

</style>