package concepts

fun main() {
    // O conceito de "let" é abrir um escopo para uma variável não nula

    val str: String? = null

    // Ao referenciar a variável, o escopo do "let" é executado caso não seja nulo
    str?.let {
        print(it.uppercase())
    }

    print(str)
}