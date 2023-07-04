package com.test.demokotlin.metodos

class KotlinStringTemplate

fun formatarMensagem(nome: String, sistema: String, plano: String): String {
    return "Olá $nome, $nome" +
            "\nSeja bem vindo ao sistema $sistema" +
            "\nVocê selecionou o plano $plano para o seu período de Trial"
}

fun formatarMensagem2(nome: String) =
    "Primeiro caracter do nome = ${nome.first()}"

fun formatarMensagem3(nome: String?) =
    "Primeiro caracter do nome = ${if (nome != null) nome.first() else "_____"}"

fun main() {
    println(formatarMensagem("João", "Youtube", "PLUS"))
    println("--------------------------")
    println(formatarMensagem2("João"))
    println("--------------------------")
    println(formatarMensagem3("João"))
    println("--------------------------")
    println(formatarMensagem3(null))
}
