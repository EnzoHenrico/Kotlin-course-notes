package exeptions

fun main() {
    val str: String? = null

    // Operador que retorna um valor caso ele seja nulo
    println(str ?: "retorno caso nulo")

    // extra: ternario no kotlin
    var idade = 10
    val str2 = if ( idade > 18 ) "Maior de idade" else "Menor de idade"
}