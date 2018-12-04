import ApiService from '@/services/api/apiService.js'

const LoginService = {
  login: (resource, params) => ApiService.post(resource, params)
}
export default LoginService
