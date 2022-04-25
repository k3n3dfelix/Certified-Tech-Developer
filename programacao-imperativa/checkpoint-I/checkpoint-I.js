/*1 ͦ Checkpoint de Programação Imperativa!
Olá, você foi contratado para executar este projeto. É importante que você analise, entenda o pedido do cliente e desenvolva conforme solicitado. Veja abaixo os requisitos do projeto:

- Precisamos desenvolver um menu para um microondas super veloz, onde teremos 5 opções de comida com seus respectivos tempos pré-definidos. 

      1 - Pipoca – 10 segundos (padrão);
      2 - Macarrão – 8 segundos (padrão);
      3 - Carne – 15 segundos (padrão);
      4 - Feijão – 12 segundos (padrão);
      5 - Brigadeiro – 8 segundos (padrão); 

- O usuário poderá alterar o tempo padrão, aumentando ou diminuindo de acordo com sua vontade. Se o tempo informado for maior que 2x o necessário, exibir mensagem que a comida queimou.
- Se o tempo for menor que o padrão, exibir a mensagem: "tempo insuficiente"; 
- Opções não listadas no menu, devem exibir uma mensagem de erro: "Prato inexistente";
- Se o tempo for 3x maior que o necessário para o prato, o microondas deve exibir a mensagem: “kabumm”;
- No final de cada tarefa, o microondas deverá exibir a mensagem: "Prato pronto, bom apetite!!!". */

console.log("Menu Microondas");
console.log("Estas são as opçoes disponiveis para o microondas superveloz");
console.log("-------------------------------------------------------------");
console.log(" 1 - Pipoca – 10 segundos"); 
console.log(" 2 - Macarrão – 8 segundos"); 
console.log(" 3 - Carne – 15 segundos"); 
console.log(" 4 - Feijão – 12 segundos"); 
console.log(" 5 - Brigadeiro – 8 segundos"); 

let pipoca = 10;
let macarrao = 8;
let carne = 15;
let feijao = 12;
let brigadeiro = 8;

console.log("----------------------------------------------------------------------");
console.log("||||||||||||||||||||||||Testando o Microondas|||||||||||||||||||||||||");

function iniciarMicro(opcao,tempo){

    switch (opcao){
      
        case 1: 
        let desc_opcao1 = "Pipoca";
       console.log("----------------------------------------------------------------------");
        console.log("Você escolheu o tipo de comida: "+desc_opcao1+", e o tempo em segundos: "+tempo)
        
        if(tempo < 10){
            console.log('tempo insuficiente'); 
        }else if(tempo > (pipoca*2) && tempo < (pipoca*3)) {
            console.log('a comida queimou'); 
        }else if(tempo > (pipoca*3)) {
            console.log('kabumm'); 
        }else{
            console.log('Prato pronto, bom apetite!!!'); 
        }

        break;
        
        case 2: 
        let desc_opcao2 = "Macarrão";
        console.log("----------------------------------------------------------------------");
        console.log("Você escolheu o tipo de comida: "+desc_opcao2+", e o tempo em segundos: "+tempo);
        if(tempo < 8){
            console.log('tempo insuficiente'); 
        }else if(tempo > (macarrao*2) && tempo < (macarrao*3)) {
            console.log('a comida queimou'); 
        }else if(tempo > (macarrao*3)) {
            console.log('kabumm'); 
        }else{
            console.log('Prato pronto, bom apetite!!!'); 
        }
        break;
        
        case 3: 
        let desc_opcao3 = "Carne";
        console.log("----------------------------------------------------------------------");
        console.log("Você escolheu o tipo de comida: "+desc_opcao3+", e o tempo em segundos: "+tempo)
        if(tempo < carne){
            console.log('tempo insuficiente'); 
        }else if(tempo > (carne*2) && tempo < (carne*3)) {
            console.log('a comida queimou'); 
        }else if(tempo > (carne*3)) {
            console.log('kabumm'); 
        }else{
            console.log('Prato pronto, bom apetite!!!'); 
        }
        break;
        
        case 4: 
        let desc_opcao4 = "Feijão";
        console.log("----------------------------------------------------------------------");
        console.log("Você escolheu o tipo de comida: "+desc_opcao4+", e o tempo em segundos: "+tempo)
        if(tempo < feijao){
            console.log('tempo insuficiente'); 
        }else if(tempo > (feijao*2) && tempo < (feijao*3)) {
            console.log('a comida queimou'); 
        }else if(tempo > (feijao*3)) {
            console.log('kabumm'); 
        }else{
            console.log('Prato pronto, bom apetite!!!'); 
        }
        break;
        
        case 5: 
        let desc_opcao5 = "Brigadeiro";
        console.log("----------------------------------------------------------------------");
        console.log("Você escolheu o tipo de comida: "+desc_opcao5+", e o tempo em segundos: "+tempo)
        if(tempo < brigadeiro){
            console.log('tempo insuficiente'); 
        }else if(tempo > (brigadeiro*2) && tempo < (brigadeiro*3)) {
            console.log('a comida queimou'); 
        }else if(tempo > (brigadeiro*3)) {
            console.log('kabumm'); 
        }else{
            console.log('Prato pronto, bom apetite!!!'); 
        }
        break;
        default:
            console.log('Prato inexistente'); 

 }
}
/*  let pipoca = 10; */
 iniciarMicro(1,9); //menor
 iniciarMicro(1,10); // igual
 iniciarMicro(1,19); //antes
 iniciarMicro(1,20); //2x
 iniciarMicro(1,21); //2x +
 iniciarMicro(1,30); //3x
 iniciarMicro(1,31); //3x +

 /* let macarrao = 8; */
 iniciarMicro(2,7); //menor
 iniciarMicro(2,8); // igual
 iniciarMicro(2,15); //antes
 iniciarMicro(2,16); //2x
 iniciarMicro(2,17); //2x +
 iniciarMicro(2,24); //3x
 iniciarMicro(2,25); //3x +

/* let carne = 15; */
iniciarMicro(3,14); //menor
 iniciarMicro(3,15); // igual
 iniciarMicro(3,29); //antes
 iniciarMicro(3,30); //2x
 iniciarMicro(3,31); //2x +
 iniciarMicro(3,45); //3x
 iniciarMicro(3,46); //3x +

 /* let feijao = 12; */
iniciarMicro(4,11); //menor
 iniciarMicro(4,12); // igual
 iniciarMicro(4,23); //antes
 iniciarMicro(4,24); //2x
 iniciarMicro(4,25); //2x +
 iniciarMicro(4,36); //3x
 iniciarMicro(4,37); //3x +

/* let brigadeiro = 8; */
iniciarMicro(5,7); //menor
 iniciarMicro(5,8); // igual
 iniciarMicro(5,15); //antes
 iniciarMicro(5,16); //2x
 iniciarMicro(5,17); //2x +
 iniciarMicro(5,24); //3x
 iniciarMicro(5,25); //3x +
