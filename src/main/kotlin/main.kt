fun main() {
    entrySystem()
}

fun entrySystem() {

    // Check age
    println("Your age:")
    val age = readln()
    if (age != "" && age.toInt() < 18) return println("Negado. Menores de idade não são permitidos")

    // Check ticket type
    println("Ticket type: ")
    val verification = when (readln().lowercase()) {
        "comum" -> {
            // Check ticket code
            println("Ticket code: ")
            val ticketCode = readln().uppercase()
            ticketCode.startsWith("XT")
        }
        "premium" -> {
            // Check ticket code
            println("Ticket code: ")
            val ticketCode = readln().uppercase()
            ticketCode.startsWith("XL")
        }
        "luxo" -> {
            // Check ticket code
            println("Ticket code: ")
            val ticketCode = readln().uppercase()
            ticketCode.startsWith("XL")
        }
        else -> false
    }

    return if (verification) {
        println("Welcome :)")
    } else {
        println("Negado. Convite Inválido")
    }
}
