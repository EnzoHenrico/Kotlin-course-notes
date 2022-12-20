fun main() {

    println("Iteração de string: ")
    val str: String = "Teste de Iteração"
    for (i in str){
        print("$i ")
    }

    println("\nLoop de intervalos: ")
    for (i in 1..20){
        print("$i ")
    }

    println("\nLoop de '2' passos")
    for (i in 1..20 step 2){
        print("$i ")
    }

    println("\nLoop decrescente: ")
    for (i in 20 downTo 0){
        print("$i ")
    }
}
