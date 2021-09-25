package br.com.unipac.uniprotocolo.model.domain

data class Aluno (var id : Long = 0,
                  var nome : String = "",
                  var matricula : Int = 0
                  )

//private -> atributos -> open
//todo atributo tem get set -> proprieties
//hash code e equals
//toString

/*fun main(){
    var aluno = Aluno()


    aluno.id = 1
    aluno.nome = "Carlos"
    aluno.matricula = 1234

    println("Dados do Alino ${aluno.toString()}")

} */