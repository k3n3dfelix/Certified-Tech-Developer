/*.map */ 
let numeros = [1,5,9,3,5,7];
let dobro = numeros.map(function(item){
    console.log(item);
    return item * 2
});
console.log(dobro);

/* .filter() - filtra os lementos do array*/
let idades = [15,12,16,20,25,30,36];

let maiores = idades.filter(function(item){
    console.log(item);
    return item >= 18;
});

console.log(maiores);

/* .reduce() - Soma todos os valores de um array - O acumulador comeca com o valor da 1 posição do array */

let total = idades.reduce(function(acumulador,item){
    console.log(acumulador,item)
    return acumulador+item;
});

console.log(total);

/* forEach() - percorrer todo array sem necessidade de um retorno */
let paises = ['Brasil','Cuba','Peru','India'];
paises.forEach(function(item){
    console.log(item)
});

