fun main(args: Array<String>) {

    // CARTÃO DE CRÉDITO
    //Inserir limite disponível no cartão e valor do pagamento.
    var limiteDisponivel = 5000
    var valorProduto = 8000
    if (limiteDisponivel > valorProduto) {
        println("Saldo suficiente, compra no cartão de crédito aprovada!")
    } else {
        println("Saldo insuficiente, compra no cartão de crédito não aprovada!")
    }


    //CARTÃO DE DÉBITO
    //Inserir saldo disponível e valor do pagamento.
    var saldoDisponivel = 100
    var valorPagamento = 94
    if (saldoDisponivel > valorPagamento) {
        println("Saldo suficiente, compra no cartão de débito aprovada!")
    } else {
        println("Saldo insuficiente, compra no cartão de débito não aprovada!")
    }


    //SACAR DINHEIRO
    //Inserir saldo bancário e valor do saque.
    var valorDoSaque = 40
    var saldoBancario = 60
    var saqueMinimo = 20
    if (valorDoSaque > saqueMinimo && saldoBancario >= valorDoSaque) {
        println("Aguarde a contagem de notas. Saque realizado com sucesso")
    } else
        println("Saque negado! Verifique se está tudo correto.")


    //EFETUAR PIX
    var saldoDisponivell = 3000
    var valorDoPix = 33000
    if (saldoDisponivell >= valorDoPix) {
        println("Pix aprovado!")
    } else
        println("Pix não aprovado, saldo insuficiente.")

    //variáveis:
    val contaPoupanca = ContaPoupanca(
        1000f,
        50f,
        48f,
        123456f,
        "Paula Stéfani",
        12345678f,
        "Caixa Ecônomica Federal"

    )
    val contaCorrente = ContaCorrente(
        83027f,
        4343f,
        43234457678f,
        "Paula Stéfani",
        65465f,
        "Bradesco"
    )
    val cliente = Cliente(
        "Empresário",
        "Rua Osvaldo,323, Parque, Porto Alegre, RS",
        51991420436f,
        "3289amanda@gmail.com",
        "034869305898",
        "24/12/1967",
        "Amanda Ferreira Do Santos Alves",
        "94558964",
    )
    val gerente = Gerente(
        5000f,
        "Administracao",
        "Bradesco",
        21,
        "Rua, 545, bairro, Porto Alegre, RS",
        51993758493f,
        "albertogerentebrad@hotmail.com",
        "054638395",
        "12/06/1952",
        "Alberto tal tal tal",
        "58940843"
    )
}
