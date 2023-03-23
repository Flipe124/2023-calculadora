package calculadora.cli

import java.util.*

private val scanner = Scanner(System.`in`)

fun lerDouble(label: String): Double {
    var valor = 0.0
    do {
        var valorInvalido = true
        try {
            println(label)
            valor = scanner.nextDouble()
            valorInvalido = false
        } catch (ex: InputMismatchException) {
            scanner.nextLine()
            println("Valor inválido!")
        }
    } while (valorInvalido)

    return valor
}

fun lerOperacao(): Int {
    var operacao: Int
    do {
        println("Informe a operação desejada!")
        println("1 - Somar")
        println("2 - Subtrair")
        println("3 - Multiplicar")
        println("4 - Dividir")
        operacao = scanner.nextInt()
        val isInvalido = operacao !in 1..4
        if (isInvalido) {
            println("Informe uma opção válida!")
        }
    } while (isInvalido)
    return operacao
}

fun lerSimOuNao(label: String): Boolean {
    do {
        println("$label - 1-Sim / 2-Não")
        val opcaoEscolhida = scanner.nextInt()
        val opcaoInvalida = opcaoEscolhida !in 1..2
        if (opcaoInvalida) {
            println("Opção Inválida! Informe uma opção válida!")
        } else {
            return opcaoEscolhida == 1
        }
    } while (opcaoInvalida)
    return false
}

