//1) Em um novo arquivo chamado ex3.js, exiba na tela a soma de dois números.
console.log("A soma de dois numeros aleatorios é:", 1+2);

//2) Repita o processo anterior, mas utilizando outro operador.
console.log("A multiplicacao de dois numeros aleatorios é:", 1*2);

//3) Declare e atribua 2 variáveis ​​numéricas independentes. Exiba a soma de ambas na tela.
let x = 5;
let y = 3;

console.log("variavel x é igual a:" + x);
console.log("variavel y é igual a:" + y);
console.log("A soma das duas variaveis é: ",x+y);

//4) Atribua a soma das duas variáveis ​​anteriores a uma outra variável e exiba-a na tela.
var z = x+y;
console.log("O valor de Z somando x+y é:",z)

//5) Re-atribua à variável anterior "1" +1, e exiba na tela. (O que  aconteceu?)
var z = "1";
console.log("O valor de Z somando '1' + 1 é:",z+1);
// Ele concatenou o 1 string com o 1 numeral
 
//6) Re-atribua "olá" + 23, e exiba na tela. (O que aconteceu?)
var z = "Olá";
console.log("O valor de Z somando 'Olá' + 23 é:",z+23);

//7) Crie mensagens concatenadas com valores diferentes.
let msg1 = "Olá";
let msg2 = "Aluno CTD"
console.log(msg1 +" "+ msg2);

/*Exercício:
Um nutricionista enviou a seguinte tabela com os dados de seus clientes e, você será responsável por calcular o Índice de Massa Corporal de cada registro:
Quais são as variáveis? Quais são as constantes? De que tipo são? Qual variável poderia armazenar o valor null segundo estes dados?





O Índice de Massa Corporal (IMC) se calcula dividindo o peso pela altura2  (a altura deve estar em metros e o peso em quilogramas). Por exemplo, no caso de Carlos de Souza, a altura ao quadrado é 3,09. 

Você deverá criar 6 variáveis:
Nome
Idade
Peso
Altura
Plano (só nos interessa saber se TEM ou NÃO TEM)
Índice de Massa Corporal (IMC)

O programa deverá apresentar em tela o valor do IMC de um paciente da tabela com uma mensagem. Por exemplo: “Aline Ferreira tem 33 anos e seu índice de massa corporal é de xx”.


*/

let nome = "José";let sobrenome = "da Silva";let idade="27";let peso = "83.5"; let altura = "1.70"; let plano = "ouro"; let indice = null;

//indice = peso / (altura * altura);
indice = peso / Math.pow(altura, 2) ;

//console.log(Math.round(indice,-2)); 
console.log(nome+" "+sobrenome+" tem "+idade+" anos"+" e seu índice de massa corporal é de: "+ indice.toFixed(2)); 





//console.log("A subtração de y de x é: ", x-y);


