package loops

fun main() {

    // Repete enquanto *condição
    var w = 0
    while (w < 100) {
        print(w)
        w++
    }

    // Faça *lógica e repita enquanto *condição
    do {
        print("digite seu nome: ")
        val name = readln()
    } while (name == "")

    // Break e Continue

    var i = 0
    while (i < 100000) {
       if (i == 50 ) {
           break // loops end
       }
        print("$i ")
        i++
    }

    var z = 0
    while (z < 100000) {
        if (z < 50 ) {
            z++
            continue // Stop current loop execution
        }
        print("$z ")
        z++
    }
}