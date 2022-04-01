package br.com.projeto

fun main() {
    val idades = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades = idades.average()
    println("Media das idades: $mediaIdades")

    val todosMaiores = idades.all { it >= 18 }
    println("Todas as idades da lista são maiores ou iguais a 18 anos? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Lista de idades maiores ou iguais a 18 $maiores")

    val busca = idades.find { it == 18 }
    println("Busca: $busca ")
}