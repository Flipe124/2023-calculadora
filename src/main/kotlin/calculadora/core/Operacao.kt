package calculadora.core

enum class Operacao(
    val opcao: Int,
    val descricao: String
) {
    SOMAR(1, "Somar") {
        override fun criarCalculoEntre(umNumero: Double, outroNumero: Double): Calculo {
            return Somar(umNumero, outroNumero)
        }
    },
    SUBTRAIR(2, "Subtrair") {
        override fun criarCalculoEntre(umNumero: Double, outroNumero: Double): Calculo {
            return Subtrair(umNumero, outroNumero)
        }
    },
    MULTIPLICAR(3, "Multiplicar") {
        override fun criarCalculoEntre(umNumero: Double, outroNumero: Double): Calculo {
            return Multiplicar(umNumero, outroNumero)
        }
    },
    DIVIDIR(4, "Dividir") {
        override fun criarCalculoEntre(umNumero: Double, outroNumero: Double): Calculo {
            return Dividir(umNumero, outroNumero)
        }
    };

    abstract fun criarCalculoEntre(umNumero: Double, outroNumero: Double): Calculo


    companion object {

        private val operacoes: MutableMap<Int, Operacao> = mutableMapOf()

        init {
            for (operacao in Operacao.values()) {
                operacoes[operacao.opcao] = operacao
            }
        }

        fun of(valor: Int): Operacao? {
            return operacoes[valor]
        }
    }

}