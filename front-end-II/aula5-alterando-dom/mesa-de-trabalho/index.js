let body = document.querySelector('body');
let h1 = document.querySelector('h1');
let listaItens = document.querySelectorAll('div');
let listaCabecalho = document.querySelectorAll('h2');
let listaParagrafo = document.querySelectorAll('p');

function darkMode() {
  body.style.backgroundColor = 'rgb(39, 39, 39)';
  
  h1.classList.add("titulo_Dark");
  
  listaItens.forEach(div => {
    
    //Adicionando uma classe a todos itens
    div.classList.add("itens_Dark");

  }); 

  listaCabecalho.forEach(h2 => {
    
    //Adicionando uma classe a todos itens
    h2.classList.add("cabecalho_Dark");

  }); 

  listaParagrafo.forEach(p => {
    
    //Adicionando uma classe a todos itens
    p.classList.add("paragrafo_Dark");

  }); 
  }
  function lightMode() {
    body.style.backgroundColor = 'rgb(219, 219, 219)';
  
    h1.classList.remove("titulo_Dark");
    
    listaItens.forEach(div => {
      
      //Adicionando uma classe a todos itens
      div.classList.remove("itens_Dark");
      div.classList.add("item");
  
    }); 
  
    listaCabecalho.forEach(h2 => {
      
      //Adicionando uma classe a todos itens
      h2.classList.remove("cabecalho_Dark");
  
    }); 
  
    listaParagrafo.forEach(p => {
      
      //Adicionando uma classe a todos itens
      p.classList.remove("paragrafo_Dark");
  
    });
  }