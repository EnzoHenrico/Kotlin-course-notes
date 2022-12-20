package objects

class Person(var birthYear: Int, var name: String) {
    fun introduce(): String {
        return "Hello! My name is $name and i'm ${2022 - birthYear} year old"
    }
    fun sleep(): String {
        return "$name is sleeping"
    }
    fun wakeUp(): String {
        return "$name is awake"
    }
}
