package lambdas

fun main() {
    println("Digite sua mensagem: ")

    val entrada = readLine()
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}