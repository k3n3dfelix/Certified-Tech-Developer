/* 1. Começamos a partir de nossa variedade de filmes, que tínhamos o seguinte: */
let filmes = ["star wars","matrix","mr. robot","o preço do amanhã","a vida é bela"];

/* e nos pediram para passar todos os elementos para letras maiúsculas, o que
na época tínhamos feito de forma "manual" Vamos movê-lo para uma maneira mais
automática usando loops. */
function convertMaiusculas(array){
    arrayFilmes = array;
    for(i=0;i<array.length;i++){
        array[i] = array[i].toUpperCase();
    }
    return array;
   
}
console.log(convertMaiusculas(filmes));

/* 
2. Agora precisamos modificar a função passagemDeElemento() que nos permite
adicionar o conteúdo de nossa matriz de filme animado à matriz de filme
original.
*/ 

/* 3. A partir deste ponto, se você decidiu trabalhar em um arquivo diferente ao
invés de modificar o anterior, lembre-se que tivemos um infiltrado dentro de
nossos filmes de animação, o qual tivemos que tirar e salvar em outra variável
antes de fazer a passagem de elementos de um array para outro! */

/*4. Finalmente, devemos modificar nossa função comparadora para os filmes
como temos feito até agora. */

/*Bônus extra

Se você chegou aqui, você está indo muito bem! Parabéns!
Para que você não fique com o desejo ou que você possa continuar praticando se
quiser, propomos esse outro exercício, tenha em mente esses exercícios podem ser
mais difíceis, para resolvê-los é importante que você revise o que aprendeu até agora
e você também pode procurar informações extras no google ou documentações que
conhece! */

/* Aplicativo para um concurso
Um cliente nos pede para fazer um aplicativo que possa determinar os vencedores de
um concurso que foi realizado no fim de semana.
Para isso, precisaremos seguir as seguintes instruções e informações para poder
desenvolver nosso aplicativo.
Cada participante tem 5 notas, dos quais suas pontuações individuais serão
formadas, os participantes com suas respectivas pontuações são:
●Participante A: 5, 8, 4, 9, 5;
● Participante B: 8, 7, 8, 6, 8;
● Participante C: 7, 5, 10, 8, 3.
O concurso consiste em 2 modalidades de seleção para um vencedor:
● Melhor média (a maior pontuação média entre os concorrentes)
● Maior e-tip(a maior pontuação entre as 5 notas de cada participante).
Com essas informações, nosso líder de Tecnologia nos pergunta o seguinte: */

/* 1. Determine qual seria a maneira ideal de representar cada participante com
suas pontuações. */

/* 2. Crie uma função pontuacaoMedia à qual receba um participante por parâmetro
e deve calcular e devolver a pontuação média dele. */

/* 3. Crie uma função pontuacaoMaior que receba um participante por parâmetro e
deve calcular e devolver a pontuação mais alta que o participante tem. */

/* 4. Logo nosso líder tecnológico nos pede para criar essas duas funções, geramos
uma nova funcionalidade chamada competição que receberá os 3 participantes
por parâmetros, executará as duas funções criadas anteriormente para calcular
as médias e pontuações mais altas de cada uma e deve anunciar (mostrar pelo
console) o vencedor de cada modalidade de pontuação.*/