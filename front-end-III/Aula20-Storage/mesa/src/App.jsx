// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
//import './App.css'

//Aula04
import { AppComponent05 } from './components/Aula05/AppComponent05'
import { MesaComponent04 } from './components/aula04/MesaComponent04';

//Aula 05
import { AppComponent04 } from './components/aula04/AppComponent04'
import { AppComponent07 } from './components/Aula07';

//Aula 07
import { ListaProdutos } from './components/Aula07/mesa07/index';

const personagens_list = [
  {
    id: 1,
    nome: "Batman",
  },
  {
    id: 2,
    nome: "Homem-Aranha",
  },
  {
    id: 3,
    nome: "Thor",
  },
  {
    id: 4,
    nome: "Capitão America",
  }
]

import { useState, useEffect, useReducer } from 'react';

function App() {

  //const [personagens_inicial, setPersonagens] = useState(personagens_list);

  function personagemReducer(state, action) {

    switch (action.type) {

      case "DELETE_PERSONAGEM":
        return state.filter(personagem => personagem.id != action.payload);
        case "LOCALSTORAGE-STATE":
      return action.payload
      default:
        return state;
    }

  }

  const [personagens, dispatch] = useReducer(personagemReducer, personagens_list);

  useEffect(() => {

    const localStoragePersonagens = localStorage.getItem("personagens");
   
    if (localStoragePersonagens) {

      const personagensJS = JSON.parse(localStoragePersonagens)

      dispatch(
        {
          type: "LOCALSTORAGE-STATE",
          payload: personagensJS
        }
      );

    }

  }, []); // Executamos 1x ao montar o componente <App />


  useEffect(() => {
    localStorage.setItem("personagens", JSON.stringify(personagens));
  }, [personagens]); /// Executamos todas as vezes que "todos" sofrer alteração no estado

 
  const handleRemoveTodo = (id) => {

    dispatch(
      {
        type: "DELETE_PERSONAGEM",
        payload: id
      }
    )
  };

  return (
    <>
      {/* Aula 4 */}
      {/* <AppComponent04></AppComponent04>
      <MesaComponent04></MesaComponent04> */}

      {/* //Aula 05 */}
      {/* <AppComponent05></AppComponent05> */}

      {/* //Aula 07 - Hooks */}
      {/* <AppComponent07></AppComponent07> */}
      {/* //Mesa 07 - Hooks */}
      {/* <ListaProdutos></ListaProdutos> */}


      <h1>Lista de Personagens</h1>
      <table>
        <tr>
          <td>Nome</td>
          <td>Opção</td>
        </tr>
        {personagens.map(personagem => (
          <tr key={personagem.id}>
            <td>{personagem.nome}</td>
            <td><button  onClick={() => handleRemoveTodo(personagem.id)}>Excluir</button></td>
          </tr>
        ))}
      </table>
    </>

  )
}

export default App