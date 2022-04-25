
/* Micro desafio - Passo 1
Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). Crie um construtor para ele e importe-o como o módulo aluno.
*/
const Alunos = require('./modulos/aluno');
//console.log(Alunos());

function Aluno(nome,qtd_faltas,notas){
    this.nome = nome
    this.qtd_faltas = qtd_faltas
    this.notas = notas
}

const alunos = [
    new Aluno('Arthur Campolina', 9, [10,8,6,7]),
    new Aluno('Cristian Fernandes', 0, [10,8,6,7]),
    new Aluno('Felipe Santos ', 0, [10,8,6,7]),
    new Aluno('Kened Silva', 0, [10,8,6,7]),
    new Aluno('Rodrigo Costa Valle', 0, [10,8,6,7]),
    new Aluno('Thiago', 10, [10,8,6,7]),
];


console.log("1 - Objetos Alunos Criados__________________________________________________________________________")
console.log(alunos);
/* Micro desafio - Passo 2
Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, que simplesmente aumenta o número de faltas em 1. */

function CalcularMedia(Alunos){
    
        let alunos = Alunos.map(function(aluno){
                
            return aluno.nome;
        
        })
        let notas = Alunos.map(function(nota){
           
            return nota.notas;
           
        })
        let faltas = Alunos.map(function(aluno){
                
            return aluno.qtd_faltas;
        
        })
        arrayMedia = [];
        for(i=0;i<notas.length;i++){
                contador = 0;
                 for(j=0;j<=3;j++){
                    contador = contador + notas[i][j]
                 }
                arrayMedia.push([alunos[i],contador/4,faltas[i]]);
                
                }
    return arrayMedia;
}
console.log("2 - Media dos Alunos________________________________________________________________________________")
console.log(CalcularMedia(alunos));

function faltas(alunos){
    let ArrayAlunos = alunos.map(function(aluno){
      
        return aluno.qtd_faltas = aluno.qtd_faltas +1
        
    })
    //var maior = Math.max(...alturas)
    return ArrayAlunos;
}
//console.log("Faltas + 1  = " + faltas(alunos));

/* Micro desafio - Passo 3
Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 1).
*/
const Cursos = require('./modulos/curso');

console.log("3 - Objeto Literal Cursos Criado____________________________________________________________________")
console.log(Cursos());

/* Micro desafio - Passo 4
Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.
*/


let alunoNovo = new Aluno('Isabela Wagner', 0, [10,8,6,7]);
function adicionaAlunos(aluno){
alunos.push(aluno);
}
adicionaAlunos(alunoNovo);

console.log("4 - Adicionado um novo Aluno _______________________________________________________________________")
console.log(alunos)

/* Micro desafio - Passo 5
Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação. Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.
*/

function verificaAprovacao(aluno){
    
    let mediaAlunos = CalcularMedia(alunos);
    let cursos = Cursos();
    let array_comp = [];
   
   for(i=0;i<mediaAlunos.length;i++){

      for(j=0;j<2;j++){

        if(mediaAlunos[i][j] === aluno){
            array_comp.push(mediaAlunos[i][j]);
            array_comp.push(mediaAlunos[i][j+1]);
            array_comp.push(mediaAlunos[i][j+2]);  
        }
       }
   }
  //console.log(cursos[0].faltas_maximas);
  if(array_comp[2] == cursos[0].faltas_maximas){
    if(array_comp[1] > cursos[0].nota_aprovacao + (cursos[0].nota_aprovacao*0.1)){
        return true;
       }else{
           return false;
       }
  }else{
    if(array_comp[1] > cursos[0].nota_aprovacao && array_comp[2] < cursos[0].faltas_maximas){
        return true;
       }else{
           return false;
       }
  }
  
}
console.log("5 - Verificando se um aluno foi aprovado ou não_______________________________________________________")
console.log(verificaAprovacao("Thiago"));

/* Micro desafio - Passo 6
Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos com os resultados se os alunos aprovaram ou não.
*/

function verificaAprovacaoGeral(){

    let mediaAlunos = CalcularMedia(alunos);
    let cursos = Cursos();
    let array_comp = [];
    let array_faltas = [];
   
   for(i=0;i<mediaAlunos.length;i++){

      for(j=1;j<2;j++){
            array_comp.push(mediaAlunos[i][j]);
            array_faltas.push(mediaAlunos[i][j+1]);
       }
   }
   array_boolean_aprovacao = [];
   
   for(i=0;i<array_comp.length;i++){
       
        if(array_faltas[i] == cursos[0].faltas_maximas){
            if(array_comp[i] > cursos[0].nota_aprovacao + (cursos[0].nota_aprovacao* 0.1)){

                array_boolean_aprovacao.push(true);
              
            }else{
                array_boolean_aprovacao.push(false); 
            }
        }else{
            if(array_comp[i] > cursos[0].nota_aprovacao && array_faltas[i] < cursos[0].faltas_maximas){
                array_boolean_aprovacao.push(true);
               
               
               
            }else{
                array_boolean_aprovacao.push(false);  
            }
        }
  }
  return array_boolean_aprovacao;
 
}
console.log("6 - Retornando Resultado de aprovação de todos os alunos______________________________________________")
console.log(verificaAprovacaoGeral());

/*Micro desafio - Passo 7
Importe o módulo estudantes.js, que contém uma lista de alunos, dentro do arquivo que contém o objeto curso. Substitua o conteúdo da propriedade lista de estudantes, pela lista de estudantes do arquivo estudantes.js e garanta que sigam funcionando todos os métodos corretamente. (revisar que o arquivo tenha todos os métodos corretamente).
*/

//Importado conforme requisitado



