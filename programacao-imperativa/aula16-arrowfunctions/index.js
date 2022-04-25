/* */ 
let bemVindo = () => 'Olá Mundo';
let dobro = numero => numero * 2;
let soma = (a,b) => a+ b;

let horaAtual = () =>{
    let data = new Date();
    return data.getHours() + ':' + data.getMinutes();
}

console.log(horaAtual());

/* Callbacks----------------------------------------------------------------*/ 
setTimeout(function(){
    console.log("Olá");
},1000);

function minhaFuncao(){
    console.log("Olá");
}

let funcao = () => {
    console.log("Olá Arrow");
}

setTimeout(funcao,5000);