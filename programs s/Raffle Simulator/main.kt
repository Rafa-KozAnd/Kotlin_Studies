fun main() {
    println("Bem-vindo ao Simulador de Sorteios!")
    println("Digite os nomes (separados por vírgula):")
    val nomes = readLine()?.split(",")?.map { it.trim() }
    
    if (nomes != null && nomes.isNotEmpty()) {
        val sorteado = nomes.random()
        println("O vencedor do sorteio é: $sorteado")
    } else {
        println("Nenhum nome foi inserido.")
    }
}
