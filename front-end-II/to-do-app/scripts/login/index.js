//Capturando as informações
let campoEmailLogin = document.getElementById('inputEmail');
let campoSenhaLogin = document.getElementById('inputPassword');
let botaoAcessar = document.getElementById('botaoAcessar');

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

//variável de controle da validação
let emailEValido = false;

//Definindo objeto
const usuarioObjeto = {
    email: campoEmailLogin,
    password: campoSenhaLogin.value
}

console.log(usuarioObjeto);
botaoAcessar.addEventListener('click', function(evento){
   

    if (validacaoTelaDeLogin()) {
        
        //Normalizando as informações
        campoEmailLoginNormalizado = retiraEspacosDeUmValor(campoEmailLogin.value);
        campoSenhaLoginNormalizado = retiraEspacosDeUmValor(campoSenhaLogin.value);
        campoEmailLoginNormalizado = converteValorRecebidoParaMinusculo(campoEmailLoginNormalizado);

        //Populando o objeto com as informações normalizadas
        usuarioObjeto.email = campoEmailLoginNormalizado;
        usuarioObjeto.password = campoSenhaLoginNormalizado;

        //console.log(usuarioObjeto);

        evento.preventDefault();
    
        // let loginUsuario = {
        //     email: "kened@teste.com",
        //     password:"12345"
        // }
    
        let loginUsuarioJson = JSON.stringify(usuarioObjeto);
        //console.log("loginUsuarioJson"+loginUsuarioJson) ;
        let endPointLogin = "https://ctd-todo-api.herokuapp.com/v1/users/login";
        
        let configuracaoRequisicao = {
            method: 'POST',
            body: loginUsuarioJson,
            headers: {
                'content-type': 'application/json'
            }
        };
        
        fetch (endPointLogin, configuracaoRequisicao)
        .then(resultado=> {
            //console.log(resultado);
            return resultado.json();
        })
        .then(
            resultado=>{
                loginSucesso(resultado.jwt);
            }
        )
        .catch(
            erro => {
                //console.log("erro"+erro);
            }
        );
    } else {
        alert("Ambos os campos devem ser informados")
        evento.preventDefault(); //Não permite que o formulário seja executado / realizado o 'submit'
    }

});
function loginSucesso(jwtRecebido){
    //console.log(jwtRecebido);
    localStorage.setItem("jwt", jwtRecebido);
    location.href = "tarefas.html";
    //alert("Usuário logado com sucesso");
    
}

//Validando o campo de Email
campoEmailLogin.addEventListener('blur', function() {
    //Captura o elemento "small"
    let inputEmailValidacao = document.getElementById('inputEmailValidacao');

    //Se o campo estiver com algum valor...
    if (campoEmailLogin.value != "") {
        inputEmailValidacao.innerText = ""
        campoEmailLogin.style.border = ``
        emailEValido = true;

    //Se o campo estiver sem nenhum valor...
    } else {
        inputEmailValidacao.innerText = "Campo obrigatório";
        inputEmailValidacao.style.color = "#EE1729EC"
        inputEmailValidacao.style.fontSize = "8pt"
        inputEmailValidacao.style.fontWeight = "bold"
        campoEmailLogin.style.border = `1px solid #EE1729EC`
        emailEValido = false;
    }

    //Chama a função de validar, para "atualizar" o status da validação principal da tela de login
   // validacaoTelaDeLogin();
});

function validacaoTelaDeLogin () {
    if (emailEValido) {
        botaoAcessar.removeAttribute('disabled')
        botaoAcessar.innerText = "Acessar";
        return true;
    } else {
        botaoAcessar.setAttribute('disabled', true);
        botaoAcessar.innerText = "Bloqueado";
        return false;
    }
}

