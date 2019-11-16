package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {

    val carro = Carro("Ford", "Fusion")
    val (marca, modelo) = carro

    println("$marca $modelo")
    println(carro)

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido $mulher")

    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}