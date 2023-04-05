package calculadora

import calculadora.core.Resultados
import calculadora.cli.Terminal

private const val SAUDACOES = "Seja bem-vindo(a) a nossa magnifica calculadora feita em Kotlin!!!!"
private const val LABEL_UM_NUMERO = "Informe um número!"
private const val LABEL_OUTRO_NUMERO = "Informe outro número!"
private const val LABEL_DESEJA_CONTINNUAR = "Deseja realizar novo cálculo?"
private const val LABEL_IMPRIMIR_RELATORIO = "Deseja imprimir o relatório de resultados?"

object Calculadora {

    private val terminal = Terminal()
    private val resultados = Resultados()

    fun run() {
        println(SAUDACOES)
        do {
            val umNumero = terminal.lerValor(LABEL_UM_NUMERO)
            val operacao = terminal.lerOperacao()
            val outroNumero = terminal.lerValor(LABEL_OUTRO_NUMERO)
            val calculo = operacao.criarCalculoEntre(umNumero, outroNumero)
            val resultado = calculo.calcular()

            println(resultado)
            resultados.registrar(resultado)

            val continuar = terminal.lerSimOuNao(LABEL_DESEJA_CONTINNUAR)

        } while (continuar)

        val imprimirRelatorio = terminal.lerSimOuNao(LABEL_IMPRIMIR_RELATORIO)
        if (imprimirRelatorio) {
            resultados.imprimir()
        }

    }
}