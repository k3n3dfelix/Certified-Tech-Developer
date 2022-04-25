/* 
1 - Crie a função imprimirInverso que pega um Array como um argumento e imprime cada elemento em ordem reversa no console (você não precisa inverter o Array).
*/

let frutas = ['abacaxi','laranja','morango','tangerina'];

function inprimirInverso(){
   
    for(i=frutas.length-1;i>=0;i--){
        console.log(frutas[i]);
    }
}
inprimirInverso();

/*
2 - Crie a função inverter que recebe um Array como argumento e retorna um novo invertido.
*/

function inverterArray(array){
    let arrayRecebido = array;
    let arrayInvertido = [];

    for(i=arrayRecebido.length-1;i>=0;i--){
       arrayInvertido.push(arrayRecebido[i])
    }
    console.log(arrayInvertido);
}

inverterArray(frutas);

/*
somarArray()
Neste exercício, você criará uma função somarArray() que aceita um array de números e retorna a soma de todos eles.
Exemplo:
somarArray([1,2,3])                // 6
somarArray([10, 3, 10, 4])     // 27
somarArray([-5,100])             // 95

*/
let arraySoma=[-5,100];
function somarArray(array){

    let arrayRecebido = array;
    let contador = 0;

    for(i=0;i<arrayRecebido.length;i++){
        contador = arrayRecebido[i] + contador
     }
     console.log(contador);
}

somarArray(arraySoma);

/* Simulação Array.join()
Neste exercício, você criará uma função chamada join que recebe um array e simula o comportamento do método Array.join().
Importante: Não poderá utilizar o método Array.join() original.
Por exemplo:
join(["o","l","á"]) deve retornar a string "olá".
join([“t”,"c","h","a,"u"]) deve retornar a string "tchau". */

let arraySaudação = ['O','L',"Á!"];
function join(array){
    let arrayRecebido = array;
    let arrayEmString = arrayRecebido.toString();
    let arrayOk = arrayEmString.replace(/,/g,"");
    console.log(arrayOk);

}

join(arraySaudação);

/*
Coleções de Filmes (e mais…)
O tech leader da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:

1 - Criar a estrutura apropriada para armazenar os seguintes filmes e séries:
	"star wars", "matrix",  "mr. robot", "o preço do amanhã",  "a vida é bela". 

*/

let filmes = ["star wars","matrix","mr. robot","o preço do amanhã","a vida é bela"];
console.log(filmes[0]);

/*
2 - Os filmes devem estar todos em letras maiúsculas. Para isso, crie uma função que recebe um array por parâmetro e converta o conteúdo de cada elemento em letras maiúsculas.
Dica: revise o que faz o método de strings .toUpperCase().
*/

function convertMaiusculas(array){
    arrayFilmes = array;
    stringConvertido = arrayFilmes.toString().toUpperCase();
    console.log(stringConvertido);
}

convertMaiusculas(filmes);

/* 
3 - Crie outra estrutura semelhante à primeira, mas com os seguintes filmes de animação:
	"Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"
Em seguida, crie uma função que receba dois arrays como parâmetros, para poder adicionar os elementos contidos no segundo array, dentro do primeiro, a fim de retornar um único array com todos os filmes como seus elementos.*/

let filmes2 = ["Toy Story","Procurando Nemo","Kung-fu Panda","Wally","Fortnite"];

function unirArrays(array1,array2){

    arrayConcatenado = array1.concat(array2);
    return arrayConcatenado;
}
console.log(unirArrays(filmes,filmes2));

/*
4 - Durante o processo, percebemos que o último elemento na série de filmes animados é, na verdade, um game. Agora devemos editar nosso código e modificá-lo para que possamos remover o último elemento antes de migrar o conteúdo para o array que contém todos os filmes.
PS: por precaução, salve o elemento que você vai deletar em uma variável.
*/

let remocao = filmes2.pop();
console.log(remocao);
console.log(filmes2);
/*
5 - Finalmente, recebemos dois arrays com classificações feitas por diferentes usuários do mundo nos filmes com o seguinte formato:
	const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
	const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

    Crie uma função que compare as notas e nos diga se elas são iguais ou diferentes.
Para verificar se tudo está bem até agora, recomendamos testar cada uma das funções, a fim de verificar seu correto funcionamento.
Se chegarmos a este ponto e tudo estiver bem, o tech leader da equipe deve estar extremamente feliz com nosso trabalho e desempenho.
Bom trabalho!
*/

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function comparaArrays(array,array2){

   for(i=0;i<array.length;i++){
       if(array[i] == array2[i]){
           console.log("Numero: "+array[i]+"  | é igual a: "+array2[i]);
       }else{
        console.log("Numero: "+array[i]+"  | diferente de: "+array2[i]);
       }
   }
}

comparaArrays(asiaScores,euroScores);






