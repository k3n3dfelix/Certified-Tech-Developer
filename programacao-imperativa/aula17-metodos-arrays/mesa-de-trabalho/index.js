/* Métodos avançados de array 
1) -Crie uma função que receba um array composto por números e retorna uma nova matriz (array) com todos os valores divididos pela soma de toda a matriz, usando map() e reduce().
*/ 

function calculaArray(){

let numeros = [1,3,5,7,9,11,13];
let total = numeros.reduce(function(acumulador,item){
    return acumulador+item;
});

let novos = numeros.map(function(item){
    return item/total;
});
return novos;
}
console.log(calculaArray());

/*2) - Crie uma função que receba um array de palavras e um número, e que retorna uma matriz (array) com apenas as palavras que têm mais do que uma quantidade de letras maior do que o número informado. (verifique como funciona o método filter ())
*/

let array = ["Maria","João","Joaquina",36];
let numero = 5; 
function filtraTamNomes(array,numero){

    let maiores = array.filter(function(item){
    
    return item.length > numero;
});
return maiores;

}

console.log(filtraTamNomes(array,numero));

/*3) Crie um array de objetos literais, onde cada objeto será um aluno e terá dois atributos: nome e nota. Crie duas funções que ordenam o array: uma ordenará os alunos em ordem alfabética e a outra o fará por nota, da mais alta para a mais baixa. */

var alunos = [
    { name: 'Edward', value: 7 },
    { name: 'Sharpe', value: 9 },
    { name: 'And', value: 8 },
    { name: 'The', value: 10 },
    { name: 'Magnetic',value: 5 },
    { name: 'Zeros', value: 6}
  ];

alunos.sort(function (a, b) {
    if (a.name > b.name) {
      return 1;
    }
    if (a.name < b.name) {
      return -1;
    }
    // a must be equal to b
    return 0;
  });

console.log(alunos);

alunos.sort(function (a, b) {
    if (a.value < b.value) {
      return 1;
    }
    if (a.value > b.value) {
      return -1;
    }
    // a must be equal to b
    return 0;
  });

console.log(alunos);

 /* 
 Exercício Integrador

Temos que fazer um sistema para um Agricultor controlar suas vendas. Ele tem um controle de vendas em um caderno, onde os produtos estão organizados por nome, preço e quantidade vendida. 
Portanto, crie um array de objetos literais com essas informações. No sistema, você tem que adicionar uma função (ou várias) que realize os seguintes passos:
1) - Calcular o lucro total de todos os produtos;
2) - Permitir pesquisar um produto pelo nome e calcular seu lucro total;
3) -Permite receber um valor e indicar todos os produtos que venderam mais que esse valor;
4) - Classifique todos os produtos pela quantidade de dinheiro que geraram.
5) - Encontre um produto e atribua a ele um novo valor (reutilize o código que permite encontrar o produto pelo nome).
6) - Calcule o lucro total após pagar 45% do lucro em impostos.

*/


