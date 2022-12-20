package exeptions

fun main() {
    // Null Safety: Declaração segura que permite nulos
    var str: String? = null

    // Acesso que trata a excessão caso receba um "null"
    println(str?.length) // "null"

    // Acesso que assume possíveis erros
    println(str!!.length) // Exception Error
}