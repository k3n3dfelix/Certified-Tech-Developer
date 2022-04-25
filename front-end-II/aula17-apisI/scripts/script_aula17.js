let quantidadeFormulario = document.getElementById('quantidadeFormulario');
let botaoPesquisar = document.getElementById('botaoPesquisar');
let exibeResultado = document.getElementById('exibeResultado');

botaoPesquisar.addEventListener('click', function (evento) {
    evento.preventDefault();

    if (quantidadeFormulario.value != "") {
        //Executar a busca a API...
        fetch(`https://dog.ceo/api/breed/hound/images/random/${quantidadeFormulario.value}`)
        .then(function(resultado){
            // json = resultado.json();
            // console.log(json);
            if(resultado.status == 200){
                return resultado.json();
            }else{
                throw "Requisição falhou";
            }
            
        }).then(function(resultado){
            console.log(resultado.message)

            for(let img of resultado.message){

                let imgElemento = document.createElement('img');
                imgElemento.src = img;
                exibeResultado.appendChild(imgElemento);

                console.log(img);
            }
        }).catch(
            function(erro){
                console.log(erro);
            }
        );
        
    } else {
        alert("Você deve informar o número de imagens que deseja buscar")
    }
});

function atualizaPagina() {
    window.location.reload();
}