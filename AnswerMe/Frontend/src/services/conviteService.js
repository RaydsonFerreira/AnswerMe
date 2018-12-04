import ApiService from '@/services/api/apiService.js'

const ConviteService = {
  convidar: (resource, params) => ApiService.get(resource, params),
  verificarStatus: (resource) => ApiService.get(resource),
  getConvites: (resource, params) => ApiService.get(resource, params)
}
export default ConviteService
