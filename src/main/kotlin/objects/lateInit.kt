package objects

/**
 * O LateInit é uma condição de inicialização de variável que permite a declaração sem valor padrão
 *
 * Nenhum espaço de memória é alocado enquanto não for atribuído um valor a variável
 * Deve se ter atenção ao acessar um variável "lateinit":
 *  Caso não tenha sido atribuído nenhum valor, será lançada uma Exceção imediatamente
 */
class Recipe {
    lateinit var instructions: String
    fun notes() {
        instructions = "Lave as mãos"
    }
}

fun main() {

}