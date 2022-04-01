package br.com.projeto.list

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Clean Code",
        autor = "Robert C. Martin",
        anoPublicacao = 2008
    ),
    Livro(
        titulo = "Programando com Kotlin",
        autor = "Stephen Samuel/Stefan Bocutiu",
        anoPublicacao = 2017,
        editora = "Novatec"
    ),
    Livro(
        titulo = "Clean Architecture",
        autor = "Robert C. Martin",
        anoPublicacao = 2017,
    ),
    Livro(
        titulo = "Como Fazer Amigos e Influenciar Pessoas",
        autor = "Dale Carnegie",
        anoPublicacao = 1936,
        editora = "Sextante"
    ),
    Livro(
        titulo = "Kotlin",
        autor = "Sergio",
        anoPublicacao = 2022
    ),
    Livro(
        titulo = "Kotlin 2",
        autor = "Alura",
        anoPublicacao = 2021,
        editora = "Novatec"
    )

)
val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Clean Code",
        autor = "Robert C. Martin",
        anoPublicacao = 2008
    ),
    null,
    Livro(
        titulo = "Programando com Kotlin",
        autor = "Stephen Samuel/Stefan Bocutiu",
        anoPublicacao = 2017,
        editora = "Novatec"
    ),
    Livro(
        titulo = "Clean Architecture",
        autor = "Robert C. Martin",
        anoPublicacao = 2017,
    ),
    Livro(
        titulo = "Como Fazer Amigos e Influenciar Pessoas",
        autor = "Dale Carnegie",
        anoPublicacao = 1936,
        editora = "Sextante"
    ),
    Livro(
        titulo = "Kotlin",
        autor = "Sergio",
        anoPublicacao = 2022
    )
)