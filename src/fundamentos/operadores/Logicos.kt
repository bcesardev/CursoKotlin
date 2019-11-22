package fundamentos.operadores

fun main() {

    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println("Comprou sorvete: $comprouSorvete")
    println("Comprou TV 50\": $comprouTv50")
    println("Comprou TV 32\": $comprouTv32")

    // Operador Unário
    if (!comprouSorvete) {
        println("A saúde agradece")
    }

}