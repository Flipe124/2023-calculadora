package calculadora.cli

import calculadora.core.Operacao
import java.util.*

class Terminal {

    private val scanner = Scanner(System.`in`)

    fun lerValor(label: String): Double {
        println("> $label")
        return scanner.nextDouble()
    }

    fun lerOperacao(): Operacao {
        var valor: Operacao?
        do {
            println("> Informe qual operação deseja realizar")
            for (value in Operacao.values()) {
                println("${value.opcao} - ${value.descricao}")
            }
            valor = Operacao.of(scanner.nextInt())
        } while (valor == null)
        return valor
    }

    fun lerSimOuNao(label: String): Boolean {
        var valor: Int
        do {
            println("> $label")
            println(": 1 - Sim")
            println(": 2 - Não")
            valor = scanner.nextInt()
        } while (isInvalido(valor, 1..2))
        return valor == 1
    }

    private fun isInvalido(continuar: Int, range: IntRange): Boolean {
        val isInvalido = continuar !in range
        if (isInvalido) {
            println(">> Opção inválida")
        }
        return isInvalido
    }

}


