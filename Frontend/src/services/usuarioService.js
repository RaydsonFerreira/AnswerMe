import ApiService from '@/services/api/apiService.js'

const UsuarioService = {
//   buscarPorId: filme => ApiService.get('/processo/desfavoritar', id),
  addUsuario: (resource, params) => ApiService.post(resource, params)
}
export default UsuarioService