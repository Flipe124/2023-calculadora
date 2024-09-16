package calculadora.core

class Dividir(
    private val umValor: Double,
    private val outroValor: Double
) : Calculo {

    override fun calcular(): Resultado {
        return Resultado("O resultado de $umValor * $outroValor é ${umValor / outroValor}")
    }

}