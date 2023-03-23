package calculadora

import calculadora.cli.lerDouble
import calculadora.cli.lerOperacao
import calculadora.cli.lerSimOuNao
import calculadora.core.calcular
import calculadora.core.listarResultados
import calculadora.core.salvarResultado

fun main() {
    println("Bem-vind@ a maravilhosa calculadora feita em Kotlin!!!!!!!!")

    var programaLigado = true

    while (programaLigado) {
        val valorUm = lerDouble("Informe um valor!")
        val operacao = lerOperacao()
        val outroValor = lerDouble("Informe outro valor!")
        val resultado = calcular(valorUm, outroValor, operacao)
        println(resultado)
        salvarResultado(resultado)

        programaLigado = lerSimOuNao("Deseja continuar calculando?")
    }

    val imprimirResultados = lerSimOuNao("Deseja imprimir os últimos resultados?")
    if (imprimirResultados) {
        listarResultados()
    }

    println("Até logo bye bye, foi bom enquanto durou!")
}