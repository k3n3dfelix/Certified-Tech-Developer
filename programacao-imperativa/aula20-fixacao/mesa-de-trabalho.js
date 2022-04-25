let pessoas = [
    {
        "nome": "Abigael Natte",
        "opniao":1,
        "idade":29
    },
    {

        "nome": "Ramon Connell",
        "opniao":2,
        "idade":45
    },
    {

        "nome": "Jarret Lafuente",
        "opniao":3,
        "idade":21
    },
    {

        "nome": "Ansel Ardley",
        "opniao":3,
        "idade":15
    },
    {

        "nome": "Jacki Shurmer",
        "opniao":1,
        "idade":24
    },
    {

        "nome": "Jobi Mawtus",
        "opniao":1,
        "idade":48
    },
    {

        "nome": "Thomasin Latour",
        "opniao":2,
        "idade":18
    },
    {

        "nome": "Lonnie Verheijden",
        "opniao":3,
        "idade":37
    },
    {

        "nome": "Alonso Wannan",
        "opniao":2,
        "idade":22
    },
    {

        "nome": "Bendite Huggett",
        "opniao":1,
        "idade":44
    }
  ]
;
console.log(pessoas);
/* Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: ótimo - 3, bom - 2, regular -1.
Faça um programa que receba a idade e a opinião de 15 espectadores, calcule e imprima: */
//________________________________________________________________________________________________
/* a média das idades das pessoas que responderam ótimo; */

function mediaIdades(){
    let opnioes = pessoas.map(function(pessoa){
        if(pessoa.opniao === 3){
        return pessoa.idade;
        }
    })
    //var maior = Math.max(...alturas)
    let array = opnioes.filter(function(item){
        return Number(item);
    });
    
    let total = array.reduce(function(acumulador,item){
        
        return acumulador+item;
    });
    return total / array.length;
}

console.log(mediaIdades());
//_______________________________________________________________________________________________
/* a quantidade de pessoas que responderam regular; */

function QtdPessoasRegular(){
    let pessoasOp = pessoas.map(function(pessoa){
        if(pessoa.opniao === 1){
        return pessoa.nome;
        }
    })
    var filtered = pessoasOp.filter(function (el) {
        return el != null;
      });

    return filtered.length;
}

console.log(QtdPessoasRegular());

//_______________________________________________________________________________________________
/* a porcentagem de pessoas que responderam bom entre todos os espectadores analisados. */

function PorcentAnaliseBom(){
    let pessoasB = pessoas.map(function(pessoa){
        if(pessoa.opniao === 2){
        return pessoa.nome;
        }
    })
    var filtered = pessoasB.filter(function (el) {
        return el != null;
      });
    return (filtered.length/pessoas.length)*100.0;
}

console.log(PorcentAnaliseBom());





