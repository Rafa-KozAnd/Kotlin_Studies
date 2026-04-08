import kotlin.random.Random

fun main() {
    println("Bem-vindo ao Simulador de Dados RPG!")
    while (true) {
        println("\nEscolha o tipo de dado para rolar:")
        println("1. D4")
        println("2. D6")
        println("3. D8")
        println("4. D10")
        println("5. D12")
        println("6. D20")
        println("7. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> println("Você rolou um D4: ${rolarDado(4)}")
            2 -> println("Você rolou um D6: ${rolarDado(6)}")
            3 -> println("Você rolou um D8: ${rolarDado(8)}")
            4 -> println("Você rolou um D10: ${rolarDado(10)}")
            5 -> println("Você rolou um D12: ${rolarDado(12)}")
            6 -> println("Você rolou um D20: ${rolarDado(20)}")
            7 -> {
                println("Encerrando o simulador. Até logo!")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}

fun rolarDado(lados: Int): Int {
    return Random.nextInt(1, lados + 1)
}
