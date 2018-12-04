import ApiService from '@/services/api/apiService.js'

const JogoService = {
  novoJogo: (resource, params) => ApiService.get(resource, params),
  getJogo: (resource, params) => ApiService.get(resource, params),
  responder: (resource, params) => ApiService.get(resource, params),
  // finalizarJogo: (resource, params) => ApiService.get(resource, params)
}
export default JogoService
