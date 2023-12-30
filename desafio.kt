enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }
class Usuario
data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>){

    val inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
    }
}
fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val cursoKotlinBasico = ConteudoEducacional("Curso de Kotlin Básico", nivel = Nivel.BASICO)
    val cursoKotlinIntermediario = ConteudoEducacional("Curso de Kotlin Intermediário", nivel = Nivel.INTERMEDIARIO)
    val cursoKotlinAvancado = ConteudoEducacional("Curso de Kotlin Avançado", nivel = Nivel.DIFICIL)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(cursoKotlinBasico, cursoKotlinIntermediario, cursoKotlinAvancado))

    formacaoKotlin.matricular(usuario1)
}
