import kotlin.math.*

fun main() {
    // Strings Functions
    val str: String = "Kotlin Dummy"

    println("Tamanho da string ${str.length}")
    println("Compara os primeiros caracteres ${str.startsWith("Kot")}")
    println("Compara os ultimos caracteres ${str.endsWith("my")}")
    println("Retorna outra string baseada nos indexes passados ${str.substring(2,6)}")
    println("Substitui partes da string ${str.replace("Dummy", "is good")}")

    // Math Functions
    println("Retorna o maior valor entre os dois parametros ${max(5, 10)}")
    println("Retorna o menor valor entre os dois parametros ${min(5, 10)}")
    println("Retorn a raiz quadrada do valor passado ${sqrt(45.7f)}")
    println("Arrendonda valores para cima ${round(3567.829374827348)}")
    println("Retorna o valor de pi $PI")
    println("Retorna o valor de Euler $E")
}