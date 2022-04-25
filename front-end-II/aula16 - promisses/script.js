let validacao = true;
let usuarioObjeto = {
    nome: "Usuario",
    endereco: {
        cidade: {
            nome: "São Paulo",
            cep: "541231"
        }
    }
}

let usuarioObjetoJson = JSON.stringify(usuarioObjeto)

let minhaPromisse = new Promise(function(resolve, reject){

    setTimeout(() =>{

        if(validacao){
            resolve(usuarioObjetoJson);
        }else{
            reject("Promisse não ok");
        }
    }, 4000);
    
});

minhaPromisse.then(
    function (resultado){
        console.log("Primeiro then");
        let resultadoJs = JSON.parse(resultado)
        console.log(resultadoJs);
        return resultadoJs;
    }
).then(function(resultadoJs){
    console.log("Segundo then");
    console.log(resultadoJs);
    return resultadoJs.cidade

}).catch(
    function(erro){
        console.log(erro);
    }
)