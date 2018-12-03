import ApiService from '@/services/api/apiService.js'

const ConviteService = {
//   buscarPorId: filme => ApiService.get('/processo/desfavoritar', id),
  convidar: (resource, params) => ApiService.get(resource, params),
  verificarStatus: (resource, params) => ApiService.get(resource, params)
}
export default ConviteService
