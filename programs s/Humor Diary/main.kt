fun main() {
    println("Bem-vindo ao Diário de Humor!")
    println("Como você está se sentindo hoje? (Digite o número correspondente)")
    println("1. Feliz")
    println("2. Triste")
    println("3. Ansioso")
    println("4. Calmo")

    val humor = readLine()?.toIntOrNull()

    when (humor) {
        1 -> println("Hoje você está radiante! Aproveite o seu dia!")
        2 -> println("Parece que o dia não está fácil, mas lembre-se: tudo passa.")
        3 -> println("Respire fundo, tudo vai se ajeitar em breve.")
        4 -> println("A paz interior é a chave. Aproveite o momento de tranquilidade.")
        else -> println("Opção inválida.")
    }
}
