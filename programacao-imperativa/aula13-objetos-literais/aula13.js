let carro = {
    modelo:"Ford",
    cor:"branca",
    andar: function(){
        return "carro andando "+this.modelo+" "+this.cor;
    }

}
console.log(carro.andar());

//Usando Função Construtora

function Carro(modelo,cor){
    this.modelo = modelo;
    this.cor = cor;
    this.pular = function(){
        return 'meu '+this.modelo+" esta pulando"
    }
}

let carro1 = new Carro("Ford","preto");
let carro2 = new Carro("Chevrolet","azul");
console.log(carro1);
console.log(carro2.pular());

let dadosCarro = {
    "cor" : "branco",
    "palca" : "AXC-2548",
    "qtPortas" : 4
}

let strdadosCarro = JSON.stringify(dadosCarro);
console.log(strdadosCarro);




