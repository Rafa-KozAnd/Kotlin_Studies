import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    println("Bem-vindo ao Jogo de Reflexos!")
    println("Prepare-se para digitar 'GO!' o mais rápido possível após o sinal.")

    while (true) {
        println("\nAguardando...")
        Thread.sleep(Random.nextLong(2000, 5000)) // Pausa aleatória antes do sinal
        println("VAI!")

        val reactionTime = measureTimeMillis {
            val input = readLine()
            if (input?.uppercase() != "GO!") {
                println("Resposta errada! Tente novamente.")
                return@measureTimeMillis
            }
        }

        println("Seu tempo de reação foi: ${reactionTime}ms")
        println("Deseja tentar novamente? (s/n)")
        if (readLine()?.lowercase() != "s") break
    }
    println("Obrigado por jogar!")
