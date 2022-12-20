/**
 * Types     |  Bit
 * Double    |  64
 * Float     |  32
 * Long      |  54
 * Int       |  32
 * Short     |  16
 * Byte      |  8
 * Boolean   |  ?
 * String    |  ?
 * Char      |  ?
 */

fun main() {

    println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE)

    // Dinamic type declaration
    var idade = 18

    // You can't declare a variable without value dinamicaly
    // But you can with static type
    var idade3: Int

    // Inplicit declaration patterns
    val n1 = 10.0 // Any float point value is interpreted as "Double"
    val n2 = 10.0f // With "f" sufix now it is Float
    val n3 = 13 // Integer inside Int range are interpreted as "Int"
    val n4 = 13L // Whit "L" now it's "Long"
    val n5 = 13 // There is no sufix for "Byte" so has to be splicit
}

/**
 * -- Anotações --
 * O tamanho Boolean pode ser representado somente com 1 bit, true ou false
 * Porém o tamanho é depende da JVM e a especificaçacão não deixa claro
 *
 * String
 * O tamanho de uma String depende de seu conteúdo.
 *
 * Char
 * O tamanho de um char, assim como Boolean, também é variável e dependente da JVM
 *
 * Fonte
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */