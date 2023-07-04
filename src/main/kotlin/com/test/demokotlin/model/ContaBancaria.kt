package com.test.demokotlin.model

import java.math.BigDecimal

class ContaBancaria {
    var saldo: BigDecimal? = null
    var numeroConta: String = "123"
}

fun main(args: Array<String>) {
    val conta = ContaBancaria()
    val numeroConta = conta.numeroConta.length
    println(numeroConta)
    // O ? verifica se saldo é null ou não, se for null saldo2 = null, se não, ele chama o metodo toDouble()
    // Impede de nullPointException
    var saldo2 = conta.saldo?.toDouble()
    println(saldo2)

    conta.saldo = BigDecimal.ONE
    saldo2 = conta.saldo?.toDouble()
    println(saldo2)
}
