package objectsII

interface Savage {

    fun atack()
}

abstract class Mammal(val name: String) {

    fun wake() {
        println("I'm awake")
    }

    fun sleep() {
        println("I'm asleep")
    }

    abstract fun talk()
}

class Dog(name: String) : Mammal(name), Savage {

    override fun atack() {
        TODO("Not yet implemented")
    }

    override fun talk() {
        TODO("Not yet implemented")
    }
}