fun main() {
    val horoscopos = listOf(
        "Hoje será um dia cheio de energia, aproveite para conquistar seus objetivos!",
        "Cuidado com as palavras, elas podem machucar mais do que você imagina.",
        "A paciência será sua maior aliada hoje, respire fundo e siga em frente.",
        "O amor está no ar, aproveite para se conectar com pessoas queridas.",
        "Seja corajoso e tome as rédeas da sua vida, o sucesso está próximo!"
    )
    
    println("Bem-vindo ao Gerador de Horóscopo!")
    println("Pressione ENTER para receber seu horóscopo.")
    readLine()
    
    val horoscopo = horoscopos.random()
    println("Seu horóscopo de hoje: $horoscopo")
}
