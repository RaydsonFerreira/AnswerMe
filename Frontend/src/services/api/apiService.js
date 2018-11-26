import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'

import { HttpException } from '../../utils/exceptions/http-exception'


const ApiService = {
	init () {
		Vue.use(VueAxios, axios)
		axios.defaults.baseURL = `http://www.omdbapi.com/?apikey=5b5be94f&r&s=`
		// this.setHeader()
	},

	async get (resource) {
		try {
			var params = encodeURI(resource)
			return await Vue.axios.get(`${params}`)
		} catch (error) {
			return Promise.reject(new HttpException(error))
		}
	},
}

export default ApiService
	