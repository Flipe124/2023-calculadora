import java.time.LocalDateTime
import java.util.*

// Imprimir saudações - ok
// Solicitar primeiro valor - ok
// Solicitar a operação (+,-,* ou /) - ok
// Solicitar segundo valor - ok
// Realizar o cálculo - OK
// Imprimir o resultado do cálculo -OK
// Garantir que a operação informada é válida -ok
// Solicitar continuação do programa e garantir que continuação do programa aconteça. // ok
// Possibilitar a impressão dos últimos cálculos & resultados - ok
// Garantir que seja informado valores numéricos sem quebrar o programa.


fun main() {
    var programaLigado = true
    var resultados: Array<String> = emptyArray()

    println("Bem-vind@ a maravilhosa calculadora feita em Kotlin!!!!!!!!")

    val scanner = Scanner(System.`in`)

    while (programaLigado) {

        var valorUm = 0.0
        do {
            var valorInvalido = true
            try {
                println("Informe um valor!")
                valorUm = scanner.nextDouble()
                valorInvalido = false
            } catch (ex: InputMismatchException) {
                scanner.nextLine()
                println("Valor inválido!")
            }
        } while (valorInvalido)

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

        println("Informe outro valor!")
        val outroValor = scanner.nextDouble()

        val resultado = when (operacao) {
            1 -> "O resultado de $valorUm + $outroValor = ${valorUm + outroValor}"
            2 -> "O resultado de $valorUm - $outroValor = ${valorUm - outroValor}"
            3 -> "O resultado de $valorUm * $outroValor = ${valorUm * outroValor}"
            4 -> "O resultado de $valorUm / $outroValor = ${valorUm / outroValor}"
            else -> "Não foi possível realizar um cálculo"
        }

        println(resultado)
        resultados += "${LocalDateTime.now()}: $resultado"

        do {
            println("Deseja continuar calculando? 1-Sim / 2-Não")
            val opcaoEscolhida = scanner.nextInt()
            val opcaoInvalida = opcaoEscolhida !in 1..2
            if (opcaoInvalida) {
                println("Opção Inválida! Informe uma opção válida!")
            } else {
                programaLigado = opcaoEscolhida == 1
            }
        } while (opcaoInvalida)

    }


    var imprimirResultados = 2 //Não imprimir os resultados
    do {
        println("Deseja imprimir os últimos resultados? 1-Sim / 2-Não")
        imprimirResultados = scanner.nextInt()
        val opcaoInvalida = imprimirResultados !in 1..2
        if (opcaoInvalida) {
            println("Opção Inválida! Informe uma opção válida!")
        }
    } while (opcaoInvalida)
    if (imprimirResultados == 1) {
        for (resultado in resultados.reversed()) {
            println(resultado)
        }
    }


    println("Até logo bye bye, foi bom enquanto durou!")
}