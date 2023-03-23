package calculadora.core

import java.time.LocalDateTime

private var resultados: Array<String> = emptyArray()

fun salvarResultado(resultado: String) {
    resultados += "${LocalDateTime.now()}: $resultado"
}

fun listarResultados() {
    for (resultado in resultados.reversed()) {
        println(resultado)
    }
}