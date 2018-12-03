import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'
import Cors from 'cors'

import { HttpException } from '../../utils/exceptions/http-exception'


const ApiService = {
	init () {
		Vue.use(VueAxios, axios)
		Vue.use(Cors)
		const proxyurl = ""
		axios.defaults.baseURL = proxyurl + `http://localhost:9000/`
		// this.setHeader()
	},

	async get (resource, slug = '') {
		try {
			if (slug === '') {
				return await Vue.axios.get(`${resource}`)
			} else {
				return await Vue.axios.get(`${resource}/${slug}`)
			}
		} catch (error) {
			return Promise.reject(new HttpException(error))
		}
	},

	async post (resource, params) {
		try {
			return await Vue.axios.post(`${resource}`, params)
		} catch (error) {
			return Promise.reject(new HttpException(error))
		}
	}	
}

export default ApiService
	