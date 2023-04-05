package calculadora.core

import java.time.LocalDateTime

class Resultados {

    private val calculos = mutableMapOf<LocalDateTime, Resultado>()

    fun registrar(resultado: Resultado) {
        calculos.put(LocalDateTime.now(), resultado)
    }

    fun imprimir() {
        println("+----------------------------------------------------------------------+")
        println("   DataHora                   - Resultado                              ")
        println("+----------------------------------------------------------------------+")
        for (entry in calculos.entries.reversed()) {
            println("   ${entry.key} - ${entry.value}")
            println("+----------------------------------------------------------------------+")
        }
    }

}


