package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Bernardo", "William", "Andreia", "Caio")
    println(nomes.sortedBy { it })
    println(nomes.sortedBy { it.reversed() })
    println(nomes.sortedBy { it.length })
}