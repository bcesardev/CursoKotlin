package lambdas

fun main() {
    val alunos = arrayListOf<String>("Pedro", "Tiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { println(this) }
}