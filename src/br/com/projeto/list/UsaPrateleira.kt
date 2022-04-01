package br.com.projeto.list

fun main(){
    val prateleira = Prateleira(genero = "Livros do tipo A", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}