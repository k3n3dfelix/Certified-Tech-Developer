import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HelloClassComponent from './components/HelloClassComponent'
import HelloFunctionComponent from './components/HelloFunctionComponent'
import InputComponent from './components/InputComponent'
import { FormComponent } from './components/FormComponent'
import { SaudacaoComponent } from './components/SaudacaoComponent'

function App() {

  return (
    //Aula 4
    // <>
    // <HelloClassComponent></HelloClassComponent>

    // <HelloFunctionComponent></HelloFunctionComponent>
    // </>

    // <FormComponent>
    //   <InputComponent label="Titulo" type="text"></InputComponent>
    //   <InputComponent label="Descrição" type="email"></InputComponent>
    //   <InputComponent label="Titulo" type="text"></InputComponent>
    //   <InputComponent label="Titulo" type="text"></InputComponent>
    //   <InputComponent label="Titulo" type="text"></InputComponent>
    // </FormComponent>

    //Mesa
    <SaudacaoComponent>
      <span>Kened Felix</span>
    </SaudacaoComponent>
   
  )
}

export default App
