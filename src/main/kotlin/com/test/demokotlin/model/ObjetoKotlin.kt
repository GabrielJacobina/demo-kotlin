package com.test.demokotlin.model

class ObjetoKotlin (
    val numero: String,
    val agencia: String
)

fun main() {
    val conta = ObjetoKotlin("88888-8", "0000")
    println(conta.agencia)
    println(conta.numero)
}

