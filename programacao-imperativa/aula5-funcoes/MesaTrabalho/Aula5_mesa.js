function teste1(x,y){
    return y - x;
}
console.log(teste1(10,40));

 function teste2(x,y){
     return x * 2;
     console.log(x);
     return x/2
 }
 console.log(teste2(5,2));
/*1. Crie uma função que converta polegadas em centímetros.
Recebe pelo parâmetro polegadas e retorna seu equivalente em centímetros.*/
function contertPolParaCent(polegada){
    return polegada * 2.54;
}
console.log(contertPolParaCent(5));
/*2. Crie uma função que receba uma string e a converta em um URL.
ex: "funcaojs" é retornado como "http://www.funcaojs.com.br" */
function convertParaUrl(string){
    return "http://www."+string+".com.br";
}
console.log(convertParaUrl('funcaojs'));
/*3. Crie uma função que recebe uma string e retorna a mesma frase, mas com o
caracter de exclamação ( ! ). */
function convertFrase(string){
    return string +"!";
}
console.log(convertFrase('A função funcionou'));
/*4. Crie uma função que calcule a idade dos cachorros, considerando que 1 ano
humano, equivale a 7 anos para eles. */
function mostraIdadeCanina(idade){
    return idade * 7;
}
console.log(mostraIdadeCanina(5));
/*5. Crie uma função que calcule o valor da sua hora de trabalho, tendo como
parâmetro o seu salário mensal.
PS: considere que você trabalhe 160 horas no mês.*/
function mostraHoraMensal(salario){
    return salario / 160;
}
console.log(mostraHoraMensal(1000));
/*6. Crie a função calculadora de IMC* de uma pessoa, que recebe a altura em
centímetros e o peso em quilogramas. Em seguida, execute a função, testando
diferentes valores.
*IMC, significa Índice de Massa Corporal e é um parâmetro utilizado para saber se o peso está
de acordo com a altura.*/
let nome = "José";let sobrenome = "da Silva";let idade="27";let peso = "83.5"; let altura = "1.70"; let plano = "ouro"; let indice = null;

//indice = peso / (altura * altura);
indice = peso / Math.pow(altura, 2) ;

//console.log(Math.round(indice,-2)); 
console.log(nome+" "+sobrenome+" tem "+idade+" anos"+" e seu índice de massa corporal é de: "+ indice.toFixed(2)); 

/*7. Crie uma função que receba uma string em minúsculas, converta-a em
maiúsculas e as retorne.
Investigue o que o método de .toUpperCase() faz. */
function convertEmMaisculas(string){
    return string.toUpperCase();
}
console.log(convertEmMaisculas('kened'));
/*8. Crie uma função que receba um parâmetro e retorne o tipo de dado deste
parâmetro.
Dica: Isso te ajudará a entender o que o operador typeof faz. */
function retornaTipo(parametro){
    return typeof parametro;
}
console.log(retornaTipo('kened'));
/*9. Crie uma função pela qual passamos o raio de um círculo e ela retorna a
circunferência.
Dica: Investigue se o objeto Math tem entre suas propriedades o número Pi. */