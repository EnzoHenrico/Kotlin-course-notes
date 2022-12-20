fun main() {
    println(stringChanger("Are you an Animal?"))
}

fun stringChanger(str: String) = str.lowercase().replace("a", "x")

