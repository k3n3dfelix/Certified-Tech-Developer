//Microdesafios
/*Em um parque de diversões nos pedem um programa para verificar se os
passageiros da montanha-russa podem entrar no brinquedo.
1) Crie uma função podeSubir() que receba dois parâmetros:
- altura da pessoa;
- se está acompanhada.

Deve retornar um valor booleano (TRUE, FALSE) que indique se a pessoa pode
subir ou não, baseado nas seguintes condições:

a) A pessoa deve medir mais de 1.40m e menos de 2 metros.
b) Se a pessoa medir menos de 1.40m, deverá ir acompanhada.
c) Se a pessoa medir menos de 1.20m, não poderá subir, nem
acompanhada. */



function podeSubir(altura,acompanhada){
   if(altura >= 1.40 && altura < 2.00){
    console.log('pode subir');
     return true;
    
   }else if(altura >= 1.20 && altura < 1.40 && acompanhada == true){
    console.log('pode subir, mas com um acompanhante');
    return true;
   }else if(altura >= 1.20 && altura < 1.40 && acompanhada == false){
    console.log('não pode subir, devido a altura e não ter nenhum acompanhante');
    return true;
   }else{
    console.log('Não poderá subir devido a altura');
    return true;
   }
   ;
}

podeSubir(1.45,true);
podeSubir(1.39,true);
podeSubir(1.25,false);
podeSubir(1.10,false);

/*
2) Modifique a função podeSubir(), de modo que ela exiba uma mensagem
de autorização ou de impedimento no acesso ao brinquedo dependendo
se a pessoa se enquadra ou não nas condições do exercício anterior. Por
exemplo:

a) Em caso de autorização, exiba a mensagem: “Acesso
autorizado” ou “Acesso autorizado somente com
acompanhante”;
b) Em caso de impedimento, exiba a mensagem: “Acesso
negado.”  
*/
console.log("---------------------------------------------------------------------------------------")
function podeSubir2(altura,acompanhada){
  if(altura >= 1.40 && altura < 2.00){
   console.log('Acesso autorizado');
    return true;
   
  }else if(altura >= 1.20 && altura < 1.40 && acompanhada == true){
   console.log('Acesso autorizado');
   return true;
  }else if(altura >= 1.20 && altura < 1.40 && acompanhada == false){
   console.log('Acesso autorizado somente com acompanhante');
   return true;
  }else{
   console.log('Acesso negado.');
   return true;
  }
  ;
}

podeSubir2(1.45,true);
podeSubir2(1.39,true);
podeSubir2(1.25,false);

podeSubir2(1.10,false);