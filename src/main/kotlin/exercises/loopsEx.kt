package exercises

fun main() {

    var mounths: Short = 0
    val salary: Float = 10000f
    var anaAmount: Double = 0.00
    var paulaAmount: Double = 0.00

    do {
        // Ana
        anaAmount += ((salary * 0.05) * 2) + anaAmount * 0.002
        println("Mes $mounths: Ana tem -> $anaAmount")

        // Paula
        paulaAmount += (salary * 0.05) + (paulaAmount * 0.008)
        println("Mes $mounths: Paula tem -> $paulaAmount")

        println("------------------------------------------")
        mounths++
    } while (anaAmount > paulaAmount)

    println("Foram no total: $mounths meses para o patrimonio de Paula superar o de Ana")
}

