import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import router from './router'
import {store} from './store'
import vuex from 'vuex'
import axios from 'axios'

Vue.use(vuex)

Vue.config.productionTip = false

new Vue({
  router,
  vuetify,
  vuex,
  store,
  axios,
  render: h => h(App)
}).$mount('#app')
