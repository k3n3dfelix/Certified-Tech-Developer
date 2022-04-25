let nomeUsuario = "Pablo";

//Funções declaradas
function exibeNomeUsuario(nome,idade,cidade){
    return console.log(nome);
}

//Invocando a função

exibeNomeUsuario("Pablo",34, "SP");

//Chamada de função com auto Invoque

(function() {
    console.log("Função automática");
})()

//Funções Expressa

let valores = function somaValores(valorA, valorB){
    return valorA+valorB;
}
valores();

//Callbacks
function executaCalculo(callback){
    let valor1 = 4;
    let valor2 = 6;

    let soma = valor1+valor2;

    callback(soma);
}

function exibeResultadoSoma(resultado){
    console.log(`O resultado foi ${resultado}`);
}

executaCalculo(exibeResultadoSoma);


// Arrou functions
let soma = function(valorA,valorB){
    return valorA + valorB;
}

soma(4,6);

let somaArrow = (valor1,valor2) => {
    return console.log(valor1+valor2);
}

somaArrow(6,4);

let somarArrow2 = (valorA , valorB) => valorA + valorB;

somarArrow2(10,10);


function executaCalculo(){
    let valor1 = 4;
    let valor2 = 6;

    let soma = valor1+valor2;

    return soma;
}

function exibeResultadoSoma(resultado){
    console.log(`O resultado 2 foi ${resultado}`);
}

exibeResultadoSoma(executaCalculo());








