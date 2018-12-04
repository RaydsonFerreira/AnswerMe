import ApiService from '@/services/api/apiService.js'

const AmigoService = {
  getAmigos: (resource, id) => ApiService.get(resource, id),
  addAmigo: (resource) => ApiService.get(resource)
}
export default AmigoService