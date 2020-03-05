import Vue from 'vue'
import Router from 'vue-router'
import IHMUtilisateur from '@/components/IHMUtilisateur'
import IHMExpert from '@/components/IHMExpert'
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.use(BootstrapVue)
Vue.use(BootstrapVueIcons)
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/IHMUtilisateur',
      name: 'IHMUtilisateur',
      component: IHMUtilisateur
    },
    {
      path: '/IHMExpert',
      name: 'IHMExpert',
      component: IHMExpert
    }
  ]
})
