function soma(a=1,b=3){
    return a+b;
}
console.log(soma());
console.log(soma(3));
console.log(soma(1,2));

let valor=5;
let fatorial=1;

for(let i = valor; i <=5; i++){
    fatorial+=i;
}

console.log("Fatorial = " + fatorial);

let frutasAmarelass=['Melão','Mamão','Limão']
let [fruta1,fruta2,fruta3] = frutasAmarelass;

console.log(fruta1);
console.log(fruta2);
console.log(fruta3);
//console.log(frutasAmarelas);


let numeros= [10, 8, 7, 99, 0, 1, 6];

console.log("a "+ numeros.sort(function(a,b){ return a-b;}));
console.log("b " + numeros.sort(function(a,b){ return a*b;}));
console.log("c "+ numeros.sort(function(a,b){ return b-a;}));
console.log("d "+ numeros.sort(function(a,b){ return a,b;}));
console.log("e "+ numeros.sort(function(a,b){ a-b;}));

console.log("_________________________")

let x=5;
let y = x++ + ++x;
console.log("y = "+ y);
x=3;
y=x*(x+1)*x++;
x=5;
y=3;
y*= x+1;

console.log("x = "+x);
console.log("y = "+y);

console.log("_________________________");

z=0;
for(var i=20; i<50;i+=10){
    z+=i;
}
console.log(z);

console.log("_________________________");
for (var i =0;i< 50;i+=10){
    console.log(i);
}

console.log(i);

console.log("_________________________");

function soletrar(texto){
    console.log(texto.replace('-','').toLocaleUpperCase().split("").join("-"));
}

soletrar("digital-house");
soletrar("ctd");
console.log("_________________________");

const fs = require('fs')

const content = 'Some content!!!'

try {
  fs.writeFileSync('test.txt', content)
  //file written successfully
} catch (err) {
  console.error(err)
}

console.log("_________________________");
let frutasAmarelas=['Melão','Mamão','Limão Siciliano'];
let frutasVermelhas=['Morango','Cereja','Maça red'];
let frutasVerdes=['Limão','Kiwi','Maça Verde'];

let frutasVermelhas1 = frutasVermelhas.map(fruta =>fruta.toUpperCase());
let todasFrutas=[...frutasAmarelas,...frutasVermelhas1,...frutasVerdes];
console.log(todasFrutas);
/*
1 - 4 6 3
2 - Node Package Manager
3 - if else
4 - opção 1
5 - Melão, Mamão e Limão, conceito: atribuição
6 - É a ação de criar um novo elemento para ser trabalhado a partir de uma classe já criada e com isso é compartilhando os mesmos conjunto atributos desta classe.
7 - nomePessoa
8 - O operador ++ incrementa 1, o operador -- decrementa 1, o operador % calcula o resto, o operador + concatena ou soma
9 - numeros.sort(function(a,b){ a-b;});

10 - Os principais métodos são: 

.readFileSync() - Recuperar dados de arquivos para que possamos usa-los.

.appendFileSync() - Adiciona conteudos a arquivos escolhidos não apagando os conteudos anteriores e somente adicionando ao final.

.parse() - Pega um arquivo em json e o converte em objeto literal para que possa ser manipulado pelo javascript.

.writeFileSync() - Utilizado para escrever arquivos e substituindo caso já exista algum igual.
11 - 12, 5 e 18
12 - 90
13 - O Node é um interpretador da linguagem Javascript, de código aberto, que possibilita a execução de códigos da linguagem do lado do servidor.
14 - + === ! &&
15 - São funçoes representadas por arrow function
16 - A instrução abaixo do fechamento do if é executada.
17 - 0 10 20 30 40 50
18 - Substitui cada hífen por '', transforma o texto em letras maiúsculas, transforma a string em array, junta o array com o separador hífen
19 - Ler um arquivo, adicionar conteúdo ao já existente, transformar dados Json em objetos literais, adicionar conteúdo substituindo o já existente.

20 - 1 - Criando um array chamado frutasAmarelas e ja atribuindo valores 
2- Criando um array chamado frutasVermelhas e  ja atribuindo valores 
3  - Criando um array chamado frutasVerdes e  ja atribuindo valores 
5 - Cria um novo array com os valores do array frutasVermelhas com o metodo .map e convertendo para maisuculas com .toUpperCase
6 - Cria um novo array atribuindo os valores dos arrays criando anteriormente(frutasAmarelas,frutasVermelhas1 e frutasVerdes)
7 - imprime no console o array todasFrutas






*/ 
