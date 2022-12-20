package objectsII

open class Eletronic(var brand: String) {
    private var energy = false
    var power = false

    private fun activateEnergy() {
        energy = !energy
    }

    fun on() {
        if (power == false) activateEnergy()
        power = true
    }
    fun off() {
        if (power == true) activateEnergy()
        power = false
    }
}

class Computer(brand: String): Eletronic(brand) {
    fun installProgram(): String{
        return "installed"
    }
    fun process(): String{
        return "processing..."
    }
}

fun main() {
    var notebook: Computer = Computer("Dell")

    notebook.brand

    notebook.on()
    notebook.off()

}