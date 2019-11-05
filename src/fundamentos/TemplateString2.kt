package fundamentos

import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main() {
    val bomHumor = true

    println("Hoje estou ${if(bomHumor) "feliz" else "chateado"}.")

    println(bomHumor is Boolean)
}