<template>
    <div>
        <div class="top">
            <div>
                <table height="50">
                    <tr>
                        <td>
                            <router-link to="/"><img class="logo"
                                                     src="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                                                     height="30" width="92"></router-link>
                        </td>
                        <td>
                            <input type="text" style="background-repeat: no-repeat;"
                                   title="검색">
                        </td>
                        <td>
                            <button type="submit" tabindex="3" class="btn_submit">
                                <img src="https://images-na.ssl-images-amazon.com/images/I/41HeL2cy9LL.png" height="30"
                                     width="30">
                                <span class="ico_search_submit"></span>
                            </button>
                        </td>
                        <td width="999" style="text-align: right; float: right">
                            <a>Gmail</a>
                            <a>이미지</a>
                            <input id="login" type="button" value="로그인">
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        <div style="height: 100px;">
        </div>
        <table style="margin: 0 auto; width: 850px; height: 500px">
            <tr>
                <td rowspan="3" width="45%">
                    <img src="https://upload.wikimedia.org/wikipedia/ko/2/26/%EB%A7%A4%ED%8A%B8%EB%A6%AD%EC%8A%A4_%ED%8F%AC%EC%8A%A4%ED%84%B0.jpg"
                         height="500px" width="100%">
                </td>
                <td style="padding-left: 20px; font-size: 45px; font-weight: bold; vertical-align: top" height="45px">
                    {{item.title}}
                </td>
            </tr>
            <tr>
                <td style="padding-left: 20px; font-size: 18px" height="18px">
                    <span style="padding-right: 10px; border-right : 1px solid #E4e4e4">예매 : <span
                            style="color:#FF382E"><img :src="item.seq"/></span>위</span>
                    <span style="padding-left : 10px">기준일 : {{item.rankDate}}</span>
                </td>
            </tr>
            <tr>
                <td height="437px">
                </td>
            </tr>
        </table>
    </div>


</template>

<script>

    import {mapState} from 'vuex';

    export default {
        created() {
            // const table = document.getElementById('table')
            // table.className += border_black
        },
        name: "MovieDetail",
        computed: {
            ...mapState({
                item: state => state.search.item
            })

        }
    }
</script>

<style scoped>
    .top {
        margin-top: 28px;
        margin-bottom: 28px;
    }

    .logo {
        vertical-align: middle;
        margin-left: 24px;
        margin-right: 24px;
    }

    #search {
        display: block;
        width: 550px;
        height: 50px;
        font-size: 15pt;
        border: 1px solid #EAEAEA;
    }

    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }

    button {
        font-size: 12px;
        line-height: 16px;
        color: #000;
    }

    button {
        margin: 0;
        padding: 0;
    }

    button {
        -webkit-appearance: button;
        -webkit-writing-mode: horizontal-tb !important;
        text-rendering: auto;
        letter-spacing: normal;
        word-spacing: normal;
        text-transform: none;
        display: inline-block;
        text-align: center;
        align-items: flex-start;
        cursor: default;
        background-color: buttonface;
        box-sizing: border-box;
        margin: 0em;
        font: 400 13.3333px Arial;
        padding: 1px 6px;
        border: 1px solid #EAEAEA;
    }

    a {
        text-decoration: none;
        font-size: 10.5pt;
        margin: 0px 10px;
        color: grey;
    }

    a:hover {
        text-decoration: underline;
    }

    .btn_submit {
        width: 50px;
        height: 50px;
        background-color: #fff;
    }

    #login {
        background-color: #4485F3;
        color: #FFFFFF;
        width: 70px;
        height: 30px;
        border: none;
        vertical-align: middle;
        margin: 10px 12px 10px 7px;
        font-weight: bold;
        font-size: 10pt;
        border-radius: 2px;
    }
</style>