fun main() {
    println("Bem-vindo ao Conversor de Unidades!")
    while (true) {
        println("\nEscolha a conversão:")
        println("1. Metros para Quilômetros")
        println("2. Quilômetros para Metros")
        println("3. Celsius para Fahrenheit")
        println("4. Fahrenheit para Celsius")
        println("5. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Digite o valor em metros:")
                val metros = readLine()?.toDoubleOrNull()
                if (metros != null) {
                    println("$metros metros é igual a ${metros / 1000} quilômetros.")
                }
            }
            2 -> {
                println("Digite o valor em quilômetros:")
                val quilometros = readLine()?.toDoubleOrNull()
                if (quilometros != null) {
                    println("$quilometros quilômetros é igual a ${quilometros * 1000} metros.")
                }
            }
            3 -> {
                println("Digite a temperatura em Celsius:")
                val celsius = readLine()?.toDoubleOrNull()
                if (celsius != null) {
                    println("$celsius°C é igual a ${celsius * 9 / 5 + 32}°F.")
                }
            }
            4 -> {
                println("Digite a temperatura em Fahrenheit:")
                val fahrenheit = readLine()?.toDoubleOrNull()
                if (fahrenheit != null) {
                    println("$fahrenheit°F é igual a ${(fahrenheit - 32) * 5 / 9}°C.")
                }
            }
            5 -> {
                println("Saindo do Conversor de Unidades. Até logo!")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
