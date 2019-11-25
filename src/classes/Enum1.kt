package classes

enum class DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

fun main() {
    print("Talvez hoje seja ${DiaSemana.SABADO}")
}