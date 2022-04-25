/*Calculadora - Nível I
1. Crie um arquivo calculadora.js que terá as diferentes operações para realizar.
2. Crie uma função adicionar, que deverá receber dois parâmetros e retornar a
soma deles.
3. Crie uma função de subtração, que deverá receber dois parâmetros e retornar
a subtração do primeiro menos o segundo.
4. Crie uma função de multiplicação, que deverá receber dois parâmetros e
retornar o resultado de sua multiplicação.
5. Crie uma função de divisão, que receberá dois parâmetros e retornará o
resultado da divisão do primeiro sobre o segundo. */

function adicionar(numero1,numero2){
    return numero1 + numero2
}


function subtrair(numero1,numero2){
    return numero1 - numero2
}


function multiplicar(numero1,numero2){
    return numero1 * numero2
}


function dividir(numero1,numero2){
    return numero1 / numero2
}


/* Calculadora - Nível II
Após passar o Nível I, adicionamos um pouco mais de dificuldade para testarmos
nossas funções.
1. No seu arquivo calculadora.js, a partir das 4 funções feitas anteriormente, crie
um console.log no qual você irá colocar uma string para indicar que abaixo dela
você começará a testar as funções, por exemplo:
console.log ("-------------- Teste de Operações / Calculadora --------------")
2. Execute a função que soma e a função que subtrai, passando quaisquer dois
números como argumentos. Mostrar resultados no console.
3. Execute a função que multiplica, passando quaisquer dois números como
argumentos. Mostre o resultado no console.
4. Execute a função que faz divisão, passando quaisquer dois números como
argumentos. Mostre o resultado no console.
5. Execute a função que faz divisão, passando agora o número zero como um dos
dois argumentos. Mostre o resultado no console.
Agora no ponto 5, vimos que éramos obrigados a executar a função de divisão, mas
forçá-la causaria um erro. Não se preocupe! A ideia é se familiarizar com isso ao longo
de sua carreira de programador e durante o processo de treinamento você vai
encontrar erros, então propomos aprender a lidar com essa frustração da maneira
mais produtiva possível. Continue com determinação e siga em frente! */

console.log ("-------------- Teste de Operações / Calculadora --------------")
console.log ("Parametros passados 10 e 2")
console.log("A soma dos numeros passados é: "+ adicionar(10,2));
console.log("A subtração dos numeros passados é: "+ subtrair(10,2));
console.log("A multiplicação dos numeros passados é: "+ multiplicar(10,2));
console.log("A divisão dos numeros passados é: "+ dividir(10,2));

console.log ("Parametros passados 10 e 2")
console.log("A divisão dos numeros passados é: "+ dividir(10,0));

/* 
Nível III - Funções Extras
Se chegamos até aqui, podemos ficar tranquilos em relação ao que fizemos.

A partir deste momento, desenvolveremos funções extras para nossa Calculadora, a
partir das funções que já criamos e efetuaremos testes após desenvolver cada uma
função.
1. Crie uma função chamada quadradoDoNumero, que recebe um número como
parâmetro e deve retornar esse número multiplicado por ele mesmo, ou seja,
ao quadrado.
Importante: quadradoDoNumero() deve usar a função multiplicação() para
calcular o quadrado do parâmetro inserido em power().

2. Crie a função mediaDeTresNumeros, ela deve calcular a média de 3 números,
que serão inseridos por parâmetro.
Importante: Em mediaDeTresNumeros() você precisará usar algumas funções
criadas anteriormente em nossa calculadora.

3. Crie a função calculaPorcentagem, que receberá dois parâmetros: o número
total e a porcentagem que deseja calcular, e que deverá retornar x% de
totalPorcentagem.
Exemplo: calculaPorcentagem(300, 15) (deve retornar 45, pois é 15% de 300).
Importante: calculaPorcentagem() você precisará usar algumas funções
criadas anteriormente em nossa calculadora.

4. Crie uma função geradorDePorcentagem que leva dois parâmetros, e que deverá
retornar a porcentagem do primeiro em relação ao segundo parâmetro.
Exemplo: geradorDePorcentagem (2, 200) (deve retornar 1 já que 2 é 1% de 200).
*/

function quadradoDoNumero(numero){
    return multiplicar(numero,numero);
}
console.log("O quadrado  do número passado é:"+ quadradoDoNumero(5));

function mediaTresNumeros(numero1,numero2,numero3){
    return dividir(adicionar(adicionar(numero1,numero2),numero3),3);
}

console.log("O media  dos  passado é:"+ mediaTresNumeros(2,10,5));

function calculaPorcentagem(numero1,numero2){

}

