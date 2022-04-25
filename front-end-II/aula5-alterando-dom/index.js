//Modificando as propiedades dos elementos
let h1 = document.querySelector('h1');
console.log(h1);

let body = document.querySelector('body');

body.style.backgroundColor = "#88e690";
h1.style.color = "#CA8122";
h1.style.textAlign = "center";

//Modificar a classe dos elementos
let listaElementosLi = document.querySelectorAll('li');
console.log(listaElementosLi);

listaElementosLi.forEach(li => {
    //console.log(li.innerHTML);

    console.log(listaElementosLi[3].classList.contains('novo-li'));

    //Adicionando uma classe a um elemento
    listaElementosLi[3].classList.add('novo-li');

    //Adicionando uma classe a todos lis
    //li.classList.add("novo-li");

    //Alterando todos os lis
    //li.innerHTML = "Novo Texto";
});