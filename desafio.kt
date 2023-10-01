// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val nome:String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)
    }
}

fun main() {
    val conteudoEducacional= ConteudoEducacional("Kotlin")
	val rebeca = Usuario ("Rebeca")
	val joao = Usuario ("Joao")

	val formacao = Formacao ("POO", Nivel.BASICO, listOf(conteudoEducacional))
	formacao.apply{
        matricular(rebeca,joao)
    	inscritos.forEach{
            println(it.nome)
        }
	}
}