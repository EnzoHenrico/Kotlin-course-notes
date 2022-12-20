package colectionsAndFunctions

fun main() {
    /**
     * Coleções com "List"
     *
     * O "List" cria uma coleção com tipo definido ou não, a mesma possui diferentes métodos para tratamento dos dados
     * "MutableList" segue o mesmo conceito, porém nele é possível a modificação das informações através dos métodos
     */
    val list1: List<Int> = listOf<Int>(0, 1, 2, 3, 4)
    val list2: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4)

    // Adição e remoção de elementos na lista mutável
    list2.add(5)
    list2.remove(0)

    /**
     * Coleções com "Set"
     *
     * O Set é um tipo, coleção, o que o difere do List é que ele não possui uma ordem ou valores repetidos
     */

    val set1: Set<String> = setOf<String>("São Paulo", "Paris", "Madrid")
    val set2: MutableSet<String> = mutableSetOf()

    // Métodos de manipulação do Set
    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")
    set2.clear()

    /**
     * Coleções com "Map"
     *
     * Map é uma coleção do tipo chave/valor, onde é declarado em pares, a chave para referência e o valor
     */

    // Declaração de um par no map
    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Brasil", "Brasília"))
    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"))

    println(map1.entries)
    println(map1.values)

    map2["Alemanha"] = "Brelím"

    map2.remove("Brasil")
    map2.contains("Alemanha")
    map2.clear()
}
