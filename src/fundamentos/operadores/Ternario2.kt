package fundamentos.operadores

fun obterResultado(nota: Double): String = if (nota >= 7) "Passou" else "Reprovado"

fun main() {
    println(obterResultado(8.3))
}