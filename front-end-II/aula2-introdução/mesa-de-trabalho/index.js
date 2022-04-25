
function iniciaJogo(){
    alert("Jogo Jokpenpo será iniciado");
    let opcaoUsuario;
    opcaoUsuario = parseInt(prompt("Entre com uma opção: 1 - Pedra 2 - Papel 3 Tesoura"));
    return opcaoUsuario;
}
function getRandomArbitrary() {
    return parseInt(Math.random() * (3 - 1) + 1);
}

function verificarTipo(numero){
    switch (numero){
        case 1:
            numero = "Pedra";
            break;
        case 2:
            numero = "Papel";
            break;
        case 3:
            numero = "Tesoura";
            break;
    }
    return numero;
}
function verificaGanhador(opcaoUsuarioNome, opcaoMaquinaNome, contador){
    if(opcaoUsuarioNome == "Pedra" && opcaoMaquinaNome == "Papel"){
        alert("Você Perdeu");
    }else if(opcaoUsuarioNome == "Pedra" && opcaoMaquinaNome == "Tesoura"){
        alert("Voçe Ganhou");
    } else if(opcaoUsuarioNome == "Papel" && opcaoMaquinaNome == "Pedra"){
        alert("Voçe Ganhou");
    }else if(opcaoUsuarioNome == "Papel" && opcaoMaquinaNome == "Tesoura"){
        alert("Você Perdeu");
    }else if(opcaoUsuarioNome == "Tesoura" && opcaoMaquinaNome == "Pedra"){
        alert("Você Perdeu");
    }else if(opcaoUsuarioNome == "Tesoura" && opcaoMaquinaNome == "Papel"){
        alert("Você Ganhou");
    }else{
        alert("Empatou");
    }
}

opcaoUsuario = iniciaJogo();
switch (opcaoUsuario) {
    case 1:
        opcaoMaquina = getRandomArbitrary();
        opcaoMaquinaNome = verificarTipo(opcaoMaquina);
        opcaoUsuarioNome = verificarTipo(opcaoUsuario);
        alert("Voçe escolheu = Pedra, a máquina = " + opcaoMaquinaNome);
        verificaGanhador(opcaoUsuarioNome,opcaoMaquinaNome);
        break;
    case 2:
        opcaoMaquina = getRandomArbitrary();
        opcaoMaquinaNome = verificarTipo(opcaoMaquina);
        opcaoUsuarioNome = verificarTipo(opcaoUsuario);
        alert("Voçe escolheu = "+opcaoUsuarioNome +", a máquina = " + opcaoMaquinaNome);
        verificaGanhador(opcaoUsuarioNome,opcaoMaquinaNome);
        break;
    case 3:
        opcaoMaquina = getRandomArbitrary();
        opcaoMaquinaNome = verificarTipo(opcaoMaquina);
        opcaoUsuarioNome = verificarTipo(opcaoUsuario);
        alert("Voçe escolheu = "+opcaoUsuarioNome +", a máquina = " + opcaoMaquinaNome);
        verificaGanhador(opcaoUsuarioNome,opcaoMaquinaNome);
      break;
    default:
        alert(`Desculpe voçe deve escolher um numero entre as opçãoes informadas`);
        iniciaJogo();
  }
