inline fun transacao(funcao: () -> Unit) {
    println("Abrindo Transação")
    try {
        funcao()
    } finally {
        println("Fechando Transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
            println("Executando SQL 2...")
              println("Executando SQL 3...")
    }
}
