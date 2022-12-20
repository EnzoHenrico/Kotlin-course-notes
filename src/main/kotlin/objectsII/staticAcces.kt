package objectsII

class MathTest {

    /**
     * No Kotlin não existe o modificador de acesso "static", os elementos da classe podem ter dois escopos semelhantes:
     *  O "companion object" declara um escopo de classe que não necessita de nomeação para acesso
     *  O "object" é outra forma de declarar um escopo de classe, porém é necessário ser nomeado e referenciado em instância.
     */
    companion object {
        const val PI = 3.1415
    }
    object Calc {
        fun double (x: Int): Int = x * 2
    }
}

fun main() {
    val mathT = MathTest()

    println(MathTest.PI)
    println(MathTest.Calc.double(2))

    // Escopo de classe não agrega instancias, pois referência a classe em sí
    // "mathT.PI" e "mathT.Calc.double(2)" não são acessíveis
}