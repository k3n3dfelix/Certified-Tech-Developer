
let idade = 15;
if(idade>=18){
    console.log('Voce é maior de idade');
}else if (idade==18){
    console.log('Voce tem 18 anos')
}else{
    console.log('Voce não é maior de idade')
}

let result = idade>18 ?"Você é maior de idade":"Você não é maior de idade";

console.log(result)

switch(idade){
    case 18:
        console.log("Idade é igual a 18");
        break;
    case 19:
        console.log("Idade é igual a 19");
        break;
    default:
        console.log("Nenhum Deles");
}