import ApiService from '@/services/api/apiService.js'

const FilmesService = {
//   buscarPorId: filme => ApiService.get('/processo/desfavoritar', id),
  buscarPorNome: nomeFilme => ApiService.get(nomeFilme)
}
export default FilmesService
