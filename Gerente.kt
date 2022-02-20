class Gerente(
    var salario: Float,
    var equipeCordenada: String,
    var instituicaoDetrabalho: String,
    var codigoDeAcesso: Short,

    //infos da classe Pessoa
    endereco: String,
    telefone: Float,
    email: String,
    cpf: String,
    dataDeNascimento: String,
    nomeCompleto: String,
    rg: String
) : Pessoa(
    endereco = endereco,
    telefone = telefone,
    email = email,
    cpf = cpf,
    dataDeNascimento = dataDeNascimento,
    nomeCompleto = nomeCompleto,
    rg = rg
)