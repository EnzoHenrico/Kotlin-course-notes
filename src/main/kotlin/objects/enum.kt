package objects

/**
 * Classes Enum são objetos que possuem enumeradores definidos
 *
 * No caso do exemplo esses enumeradores são: "Low", "Medium" e "High"
 * Os valores fixados ajudam no tratamento de dados evitando possíveis erros
 *
 * É necessária que seja instanciado o valor do Enum quando a classe é chamada
 */
enum class Priority(val value: Int) {
    Low(1){
        // É possível adicionar novos métodos e lógicas para os enumeradores
        // E também reescrever os métodos padrões
        override fun toString(): String{
            return "Priority level is Low ($value)"
        }
    },
    Medium(2),
    High(3)
}

fun main() {
    val priority = Priority.Low

    println(priority.toString())
    println("Priority number is: ${priority.value}")
}