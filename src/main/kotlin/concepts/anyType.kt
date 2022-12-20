package concepts

fun main() {
    // Any, Unit e Nothing

    values(false)
}

/**
 * Todos os valores conhecidos são decendentes de Any
 * O Any possui um comportamento similar os generics
 *
 * O Unity diz que a função não possui nenhum retorno
 */
fun values(value: Any): Unit {
    // Função sem retorno
}

/**
 * Tem uso exclusivo de lançar excessões, é o único retorno possível com "Nothing"
 *
 * Metodos com retorno "Nothing" são não implementados e
 * servem para manter o fluxo de desenvolvimento mesmo sem elaborar o método
 */
fun nothing(value: Any): Nothing {
    TODO("Mensasgem a ser lançada na Exception quando o método é chamado")
}