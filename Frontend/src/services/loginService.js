import ApiService from '@/services/api/apiService.js'

const LoginService = {
//   buscarPorId: filme => ApiService.get('/processo/desfavoritar', id),
  login: (resource, params) => ApiService.post(resource, params)
}
export default LoginService
