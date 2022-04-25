const somar = require("./somar");
const subtrair = require("./subtrair");
const multiplicar = require("./multiplicar");
const dividir = require("./dividir");

let calculadora = (valor1, valor2, operacao) => console.log(operacao(valor1, valor2)); 

calculadora(5, 2, subtrair);






