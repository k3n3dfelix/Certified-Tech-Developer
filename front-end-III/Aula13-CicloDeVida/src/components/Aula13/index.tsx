import React, { useEffect, useState } from 'react';

export function Aula13() {

    const [statusPedido, setStatusPedido] = useState(true);


    useEffect(() => {
        setTimeout(() => {
            console.log('O componente foi atualizado');
        }, 2000);

        return function limpaComponente() {
            console.log("<ContadorDeCliquesCompoent/> Foi Desmontado/Limpo");
        }
    }, []);

    useEffect(() => {
       if(statusPedido === false){
        alert('Seu pedido foi cancelado!');
    }

    }, [statusPedido]);

    return (
        <>
            <h1>Seu pedido: </h1>

           {statusPedido && <button onClick={() => setStatusPedido(false)}>Cancelar Pedido</button>} 
        </>
    )
}