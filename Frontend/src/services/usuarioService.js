import ApiService from '@/services/api/apiService.js'

const UsuarioService = {
  addUsuario: (resource) => ApiService.get(resource),
  getUsuarios: (resource) => ApiService.get(resource)
}
export default UsuarioService