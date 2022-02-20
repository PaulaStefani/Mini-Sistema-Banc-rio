class ContaCorrente(
    depositar: Float,
    sacar: Float,
//Infos da classe Conta
    numeroDaConta: Float,
    titularDaConta: String,
    numeroDaAgencia: Float,
    nomeDaInstituicao: String
) : Conta(
    numeroDaConta,
    titularDaConta,
    numeroDaAgencia,
    nomeDaInstituicao,
) {
    /* var fazerPix = fazerPix
         get() {
             println()
             return field
         }
         set(value) {
             println("")
             field = value
             if (fazerPix >= 1) {
                 println("Pix efetuado com sucesso!")
             } else if (fazerPix <= 1) {
                 println("Pix não efetuado!")
             }
         } */
}




