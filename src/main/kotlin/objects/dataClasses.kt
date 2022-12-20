package objects

/**
 * "Data Class" é um conceito de classe onde os dados instanciados ficam em evidência
 * Os métodos de acesso e comparação são naturalmente modificados para referenciar os dados em vez dos espaços de memória
 *
 * Normalmente o conceito é aplicado em transições de dados:
 *  Como uma classe que recebe parâmetros, podendo ou não conter validadores, e os armazena
 *  A instância desse objeto vai conter os dados necessários e simplifica todos em uma única referência de memória
 */
data class ShapeData(val a: Int, val b: Int)
class Shape(a: Int, b: Int)

fun main() {
    // Exemplo de duas instancias de uma classe comum
    val shape1 = Shape(10, 8)
    val shape2 = Shape(10, 8)

    // Ao comparar classes comuns com os mesmos valores o retorno é falso
    // Isso ocorre porque o método "equals" compara o espaço de memória e não os valores em sí
    println(shape1.equals(shape2))

    // Valores impressos de uma classe comum não são possuem informações claras na nossa linguagem
    println(shape1.toString())
    println(shape1.hashCode())
    println("---------------")
    println(shape2.toString())
    println(shape2.hashCode())

    // Exemplo das mesmas instancias com Data Class
    val shape3 = ShapeData(10, 8)
    val shape4 = ShapeData(10, 8)

    // Método(copy) exclusivo de Data Class onde todos os dados são copiados para a criação de uma nova instância
    // Não é uma referência de memória, e sim a criação de um novo objeto com parâmetros copiados
    val shape5 = shape4.copy()

    // O método "equals" em Data Classes comparam valores e não a memória
    println(shape3.equals(shape4))

    // Data classes fornecem valores legíveis para nós
    println(shape3.toString())
    println(shape3.hashCode())
    println("---------------")
    println(shape4.toString())
    println(shape4.hashCode())
}


