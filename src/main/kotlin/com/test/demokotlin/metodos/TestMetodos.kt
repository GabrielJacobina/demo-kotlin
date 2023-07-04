package com.test.demokotlin.metodos

class TestMetodos {

    // Metodo void
    fun metodoPrimeiro() {
        println("Testando o primeiro metodo sem retorno")
    }

    //Metodo com retorno
    fun metodoDois(): String {
        return "Retorno com string"
    }

    // Lambda quando o método só tem uma linha
    fun metodoLambda() = metodoDois()
    fun metodoLambsa2() = println("Test lambda")

    fun metodoLambdaParams(x: Int, y: Int) = x + y


}
