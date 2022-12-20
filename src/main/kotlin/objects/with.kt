package objects

/**
 *  O método "with" recebe um objeto e abre um escopo para manipulação do mesmo
 */
fun main() {
    val carlos = Person(1998, "Carlos")

    with(carlos) {
        // Acesso a variáveis públicas
        println("Acessando o escopo do(a) $name")

        // Acesso aos métodos
        println(sleep())
        println(wakeUp())
    }
}