package br.com.projeto.list

fun ListaDeLivros() {
    val livro1 = Livro(
        titulo = "Clean Code",
        autor = "Robert C. Martin",
        anoPublicacao = 2008
    )

    val livro2 = Livro(
        titulo = "Programando com Kotlin",
        autor = "Stephen Samuel/Stefan Bocutiu",
        anoPublicacao = 2017,
        editora = "Novatec"
    )

    val livro3 = Livro(
        titulo = "Clean Architecture",
        autor = "Robert C. Martin",
        anoPublicacao = 2017,
    )

    val livro4 = Livro(
        titulo = "Como Fazer Amigos e Influenciar Pessoas",
        autor = "Dale Carnegie",
        anoPublicacao = 1936,
        editora = "Sextante"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Kotlin",
            autor = "Sergio",
            anoPublicacao = 2022
        )
    )
    livros.imprimeComMarcadores()

    println()
    println("Ordenado por ano de publicação")
    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    println()
    println("Ordenado por titulo")
    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    println()
    println("Ordenado por autor")
    livros.sortedBy { it.autor }.imprimeComMarcadores()

    println()
    println("Filtrado por autor e data de publicação")

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("Robert") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        "- ${it.titulo} de ${it.autor}"
    }
    println(" --- Lista de Livros --- \n$textoFormatado")
}