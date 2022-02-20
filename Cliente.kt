class Cliente(
    var profissao: String,
    //infos da classe pessoa
    endereco: String,
    telefone: Float,
    email: String,
    cpf: String,
    dataDeNascimento: String,
    nomeCompleto: String,
    rg: String
) : Pessoa(
    endereco = endereco,
    telefone=telefone,
    email = email,
    cpf = cpf,
    dataDeNascimento = dataDeNascimento,
    nomeCompleto = nomeCompleto,
    rg = rg
)