import ApiService from '@/services/api/apiService.js'

const UsuarioService = {
  addUsuario: (resource, params) => ApiService.post(resource, params),
  getUsuarios: (resource) => ApiService.get(resource)
}
export default UsuarioService