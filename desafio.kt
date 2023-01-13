enum class Nivel { INICIANTE, INTERMEDIARIO, AVANCADO }

data class ConteudoEducacional(val nome: String, val nivel: Nivel ,val duracao: Int = 60){
    
}

class Usuario(val nome: String){
    
    val conteudos = mutableListOf<ConteudoEducacional>()
    
    fun concluido(conteudo:ConteudoEducacional){
       this.conteudos.add(conteudo)
    }
}



data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        this.inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    
    var bootcamp = Formacao("WEB", Nivel.INTERMEDIARIO, listOf(ConteudoEducacional("javascript",Nivel.INTERMEDIARIO),ConteudoEducacional("HTML",Nivel.INICIANTE)))
    
	bootcamp.matricular(Usuario("Cleuton Ribeiro"))
    bootcamp.matricular(Usuario("Cilene Ribeiro"))
    
}
