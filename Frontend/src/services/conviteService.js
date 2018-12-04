import ApiService from '@/services/api/apiService.js'

const ConviteService = {
  convidar: (resource, params) => ApiService.get(resource, params),
  verificarStatus: (resource, params) => ApiService.get(resource, params),
  getConvites: (resource, params) => ApiService.get(resource, params),
  aceitar: (resource, params) => ApiService.get(resource, params),
}
export default ConviteService
