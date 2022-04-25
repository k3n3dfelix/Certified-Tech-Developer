onload = () => {
    let tokenJwt = window.localStorage.getItem('jwt');
    console.log(tokenJwt);
   
        //location.href = "tarefas.html";
        let endPointUsuario = "https://ctd-todo-api.herokuapp.com/v1/users/getMe";
        
        let configuracaoRequisicaoUser = {
            method: 'GET',
           
            headers: {
                'content-type': 'application/json',
                'Authorization': `${tokenJwt}`
            }
        };

        
        fetch (endPointUsuario, configuracaoRequisicaoUser)
        .then(resultado=> {
           
            return resultado.json();
        })
        .then(
            resultado=>{
                console.log(resultado);
            }
        )
        .catch(
            erro => {
                //console.log("erro"+erro);
            }
        );

        //Cadastrando Tarefas_____________________________________________________________
        let formulario = document.querySelector("form"); 
        formulario.addEventListener("submit", function(event){
            event.preventDefault();
        
            let novaTarefaInput = document.querySelector("input[name='novaTarefa']");
            let novaTarefa = novaTarefaInput.value; 

            let usuarioTarefa = {
                "description": novaTarefa,
                "completed": false
            }

            let tarefaUsuarioJson = JSON.stringify(usuarioTarefa);
       
        let endPointCadastroTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";
        
        let configuracaoRequisicaoCadastroTarefas = {
            method: 'POST',
            body: tarefaUsuarioJson,
            headers: {
                'Content-Type': 'application/json',
                'Authorization': `${tokenJwt}`
            }
        };
        
        fetch (endPointCadastroTarefas, configuracaoRequisicaoCadastroTarefas)
        .then(resultado=> {
           
            return resultado.json();
        })
        .then(
            resultado=>{
                //console.log(resultado);
            }
        )
        .catch(
            erro => {
                //console.log("erro"+erro);
            }
        );   
        })

         //Mostrar Tarefas_____________________________________________________________
        let endPointTarefas = "https://ctd-todo-api.herokuapp.com/v1/tasks";
        let configuracaoRequisicao = {
            method: 'GET',
           
            headers: {
                'content-type': 'application/json',
                'Authorization': `${tokenJwt}`
            }
        };
        
        fetch (endPointTarefas, configuracaoRequisicao)
        .then(resultado=> {
            
            return resultado.json();
        })
        .then(
            resultado=>{
               //console.log(resultado);
                manipulandoTarefasUsuario(resultado);
            }
        )
        .catch(
            erro => {
                //console.log("erro"+erro);
            }
        );
    }

    function manipulandoTarefasUsuario(listaDeTarefas){
        console.log(listaDeTarefas);
      
        for(let tarefa of listaDeTarefas){
          if(tarefa.completed){
            //Tarefas Terminadas
            console.log(tarefa.completed);
            renderizaTarefasConcluidas(tarefa);
          }else{
            //Tarefas pendentes
            console.log(tarefa.completed);
            renderizaTarefasPendentes(tarefa);
          }
        }
      }

      let tarefasPendentesUl = document.querySelector(".tarefas-pendentes")
      function renderizaTarefasPendentes(tarefa){

        let liTarefasPendente = document.createElement('li');
        liTarefasPendente.classList.add("tarefa");

        let cardTarefasPendente = 
        `
            <div class="not-done" id="${tarefa.id}"></div>
            <div class="descricao">
                <p class="nome">${tarefa.description}</p>
                <p class="timestamp"><i class="far fa-calendar-alt"></i> ${tarefa.createdAt}</p>
            </div>
        `
        liTarefasPendente.innerHTML = cardTarefasPendente;
        tarefasPendentesUl.appendChild(liTarefasPendente);
      }

      let tarefasTerminadasUl = document.querySelector(".tarefas-terminadas")
      function renderizaTarefasConcluidas(tarefa){

        let liTarefasPendente = document.createElement('li');
        liTarefasPendente.classList.add("tarefa");

        let cardTarefasPendente = 
        `
            <div class="done"></div>
            <div class="descricao">
            <p class="nome">${tarefa.description}</p>
            <div>
                <button><i id="${tarefa.id}" class="fas fa-undo-alt change"></i></button>
                <button><i id="${tarefa.id}" class="far fa-trash-alt"></i></button>
            </div>
            </div>
        `
        liTarefasPendente.innerHTML = cardTarefasPendente;
        tarefasTerminadasUl.appendChild(liTarefasPendente);
      }