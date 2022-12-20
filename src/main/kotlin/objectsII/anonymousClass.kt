package objectsII

interface Event {
    fun onSuccess()
}

class Program {
    fun save(e: Event) {
        println("Abrindo conexões...")
        println("Salvando Valores...")
        println("Sucesso! Conexões fechadas")
        e.onSuccess()
    }
}

/**
 * Chamando o "object" criamos uma classe anônima, onde ela herda a 'interface' nomeada "Event"
 * A classe anonima não possui nome e só "existe" em tempo de execução
 */
fun main() {
    val program = Program()

    program.save(object : Event {
        override fun onSuccess() {
            TODO("Not yet implemented")
        }
    })
}