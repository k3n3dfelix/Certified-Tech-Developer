/* 1) - Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares. */
let numeros = [1,3,5,7,9,11,13];
let pares = numeros.map(function(item){
    console.log(item);
    return item + 1
});
console.log(pares);

/*2) - Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria. */ 

/*3) - Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.
 Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7” */ 

 /*4) - Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.
 */ 