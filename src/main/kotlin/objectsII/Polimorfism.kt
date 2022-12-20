package objectsII

interface Employ {
    var salary: Float
    fun bonus(): Float
}

class Manager(override var salary: Float) : Employ {
    override fun bonus(): Float {
        return salary * 0.5f
    }
}
class Analyst(override var salary: Float) : Employ {
    override fun bonus(): Float {
        return salary * 0.3f
    }
}

fun showBonus(employ: Employ) {
    print(employ.bonus())
}

fun main() {
    showBonus(Manager(7000f))
    showBonus(Analyst(2000f))
}