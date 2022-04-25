
const funcMultiplica = require('./modulos/modulo');


console.log(funcMultiplica(5,5));


const CPF = require('cpf');
let cpf = CPF.isValid('111.444.777-35');
let cpfformatado = CPF.format('11144477735');
console.log(cpf);
console.log(cpfformatado);
