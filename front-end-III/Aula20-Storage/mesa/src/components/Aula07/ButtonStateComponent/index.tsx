import React, { useState } from "react";

 
export function ButtonStateComponent() {
    const [clicks,setClicks] = useState(0);

    //let clicks = 0;

    const contadorDeClicks = () => {
        //Forma com javascript
        // clicks = clicks + 1;
        // console.log(clicks);
        // document.getElementById("clicks").innerText = `Número de cliques: ${clicks}`;

        //Forma com React Hooks
        setClicks(clicks + 1);
       
    }

    return (
        <>
            <h4 id="clicks">Número de cliques: {clicks} </h4>
            <button onClick={contadorDeClicks}>Clique Aqui</button>
        </>
    )
}
