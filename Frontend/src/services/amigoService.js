import ApiService from '@/services/api/apiService.js'

const AmigoService = {
//   buscarPorId: filme => ApiService.get('/processo/desfavoritar', id),
  getAmigos: (resource, id) => ApiService.get(resource, id)
}
export default AmigoService