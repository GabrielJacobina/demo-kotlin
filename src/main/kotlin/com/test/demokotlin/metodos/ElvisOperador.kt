package com.test.demokotlin.metodos

import com.test.demokotlin.model.ContaBancaria
import java.math.BigDecimal

class ElvisOperador

fun main(args: Array<String>) {
    val conta = ContaBancaria()
    val saldo = conta.saldo?.toDouble() ?: BigDecimal.ZERO.toDouble()
    val saldo2 = if (temSaldo(conta.saldo)) conta.saldo else BigDecimal.ZERO
}

fun temSaldo(valor: BigDecimal?): Boolean {
    return valor != null
}

private class ContaBancaria2 {
    val saldo: BigDecimal? = null
}
