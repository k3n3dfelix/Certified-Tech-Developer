// Eventos de tela página

// onload = function(){

//     alert("A página foi carregada");
// }

function exibeAlertaFinalCarregamento(){
    alert("A página foi carregada completamente")
}

let button = document.querySelector('button');

button.addEventListener('click',function(event){
    event.preventDefault();
})

let label = document.querySelector('label');

label.addEventListener('mouseover',function(){
    label.style.color = 'red';
})

label.addEventListener('mouseout',function(){
    label.style.color = 'black';
})