function somar(a,b){
    //console.log(a+b);
    return(a+b);
    
}
console.log(somar(10,5));

function nomePessoa(nome,idade){
    return nome+" tem a idade de: "+idade+" anos!";
}

let nome = nomePessoa("kened",21);
console.log(nome);

console.log(nomePessoa("Kened ",29));

//função anonima
let sub = function(x,y){
    console.log(x-y);
}

sub(10,1);