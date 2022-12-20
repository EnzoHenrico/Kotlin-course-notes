package colectionsAndFunctions

fun main() {
    val data = generateData()

    /**
     * Any me retorna um boolean, sendo true se possuir algum elemento
     */
    println("Possui dados? ${ if (data.any()) "sim" else "não" }")

    // Any também aceita um escopo
    data.any { it.name == "Omelete" }

    /**
     * Count retorna a quantidade de elementos na coleção
     */
    println("Possui quantos dados? ${ data.count() }")

    /**
     * First representa primeiro elemento do conjunto e las o último
     */
    println("Primeiro elemento ${ data.first().name }")
    println("Último elemento ${ data.last().name }")

    /**
     * Caso a lista esteja vazia é retornada uma "Exception",
     * por isso é melhor utilizar a seguinte variação
     */
    println("Primeiro elemento ou nulo: ${ data.firstOrNull()?.name }")
    println("Último elemento ou nulo: ${ listOf<Recipe>().lastOrNull()?.name }")

    /**
     * Sum soma elementos numéricos de uma coleção
     */
    listOf<Int>(1, 2, 3, 4).sum()

    /**
     * SumOf é aberto um escopo para soma de um atributo numérico especificado pelo "it"
     */
    data.sumOf { it.cals }

    /**
     * Filter retorna uma array com os elementos que passam na verificação
     */
    data.filter { it.cals > 500 }
}

fun generateData(): List<Recipe> {
    return listOf(
        Recipe(
            "Lasanha",
            1200,
            listOf(
                Ingridient("presunto", 5),
                Ingridient("queijo", 5),
                Ingridient("massa", 5),
                Ingridient("molho", 5),

            )
        ),Recipe(
            "Hamburguer",
            800,
            listOf(
                Ingridient("pão", 5),
                Ingridient("carne", 5),
                Ingridient("queijo", 5),
                Ingridient("maionese", 5),

            )
        ),
        Recipe("Panqueca",400),
        Recipe("Omelete",100),
        Recipe("Sopa",100),
    )
}

data class Recipe(
    val name: String,
    val cals: Int,
    val ingredients: List<Ingridient> = listOf()
)

data class Ingridient(
    val name: String,
    val quantities: Int
)