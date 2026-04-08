import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    println("Bem-vindo ao Flappy Bird Simples!")
    println("Pressione ENTER para voar e tente não cair ou bater!")
    
    var birdHeight = 5
    var obstacle = Random.nextInt(1, 10)
    var score = 0
    
    while (true) {
        println("\nAltura do Pássaro: $birdHeight")
        println("Obstáculo está na altura: $obstacle")
        println("Pressione ENTER para voar ou 's' para sair.")
        
        val input = readLine()
        if (input == "s") {
            println("Jogo encerrado! Pontuação final: $score")
            exitProcess(0)
        }
        
        birdHeight += 2
        birdHeight -= 1 // gravidade

        if (birdHeight == obstacle) {
            println("Você bateu no obstáculo! Pontuação final: $score")
            exitProcess(0)
        }
        
        if (birdHeight <= 0) {
            println("Você caiu! Pontuação final: $score")
            exitProcess(0)
        }

        score++
        obstacle = Random.nextInt(1, 10)
    }
}
