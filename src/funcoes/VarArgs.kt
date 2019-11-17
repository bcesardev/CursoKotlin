package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main() {
    for (n in ordenar(38, 3, 126, 997, 543, 234, 43, 986, 3, 86, a = 1))
        print("$n ")
}