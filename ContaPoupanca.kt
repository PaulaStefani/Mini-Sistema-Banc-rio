class ContaPoupanca(
    var investimento: Float,
    var rendimento: Float,
    var taxaReferencial: Float,

    //infos da classe Conta:
    numeroDaConta: Float,
    titularDaConta: String,
    numeroDaAgencia: Float,
    nomeDaInstituicao: String
) : Conta(
    numeroDaConta,
    titularDaConta,
    numeroDaAgencia,
    nomeDaInstituicao
)