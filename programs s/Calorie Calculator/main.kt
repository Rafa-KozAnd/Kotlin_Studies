fun main() {
    println("Bem-vindo à Calculadora de Calorias!")
    var caloriasTotais = 0.0

    while (true) {
        println("\nDigite o alimento ou 'sair' para finalizar:")
        val alimento = readLine()
        if (alimento.equals("sair", ignoreCase = true)) {
            break
        }

        println("Quantas calorias tem $alimento?")
        val calorias = readLine()?.toDoubleOrNull()
        if (calorias != null) {
            caloriasTotais += calorias
            println("Você consumiu $calorias calorias de $alimento.")
        } else {
            println("Valor inválido. Tente novamente.")
        }
    }

    println("Total de calorias consumidas: $caloriasTotais")
}
