fun main() {
    val listaDeCompras = mutableListOf<String>()

    println("Bem-vindo à Lista de Compras!")
    
    while (true) {
        println("\n1. Adicionar item")
        println("2. Exibir lista")
        println("3. Remover item")
        println("4. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Digite o item para adicionar:")
                val item = readLine()
                if (!item.isNullOrEmpty()) {
                    listaDeCompras.add(item)
                    println("$item foi adicionado à sua lista de compras.")
                }
            }
            2 -> {
                println("Sua lista de compras:")
                listaDeCompras.forEach { println(it) }
            }
            3 -> {
                println("Digite o item que deseja remover:")
                val item = readLine()
                if (item != null && listaDeCompras.contains(item)) {
                    listaDeCompras.remove(item)
                    println("$item foi removido da sua lista de compras.")
                } else {
                    println("Item não encontrado na lista.")
                }
            }
            4 -> {
                println("Saindo da Lista de Compras. Até logo!")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
