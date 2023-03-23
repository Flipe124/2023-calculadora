package calculadora.core

fun calcular(valorUm: Double, outroValor: Double, operacao: Int): String {
    return when (operacao) {
        1 -> "O resultado de $valorUm + $outroValor = ${valorUm + outroValor}"
        2 -> "O resultado de $valorUm - $outroValor = ${valorUm - outroValor}"
        3 -> "O resultado de $valorUm * $outroValor = ${valorUm * outroValor}"
        4 -> "O resultado de $valorUm / $outroValor = ${valorUm / outroValor}"
        else -> "Não foi possível realizar um cálculo"
    }
}