package concepts

fun main() {
    gradePointsAvarege(10f, 8f, 7f)
    genericsGradePointsAvarege("Minha média é: ", 10f, 8f, "2", "error", false)
}

/**
 * A declaração "vararg" assume uma quantidade indeterminada de parametros
 * Podendo então ser atribuido mais de um parametro do mesmo tipo a mesma variável
 * Os valores são armazenados em uma Array
 * "vararg" necessáriamente precisa ser o último ou único parametro
 */
fun gradePointsAvarege(vararg points: Float): Float {
    var sum = 0f

    for (p in points) {
        sum += p
    }
    return (sum / points.size)
}


/**
 * O tipo "T" é um "generics", ele representa um tipo indeterminado de entrada
 * O argumento "<T>" anterior a função é necessário para uma função genérica
 * Funções genéricas permitem parametros de tipos diversos, esses tipos são somente descobertos em tempo de execução
 */
fun <T> genericsGradePointsAvarege(message: String, vararg points: T): String {
    var sum = 0f

    for (p in points) {
        if (p is Float) {
            sum += p
        }
    }
    return "$message ${sum / points.size}"
}