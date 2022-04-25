let nome = "     Kened Silva Felix";

//.length
console.log("Metodo .length: contar campos string: "+ nome.length);

//.trim
console.log("Metodo .trim: Retira espaços de uma string:"+ nome.trim()); //Retira espaço de uma string

//.trim
console.log("Metodo .trim: Quebra em um determinado tipo :"+ nome.split(" ")); //Quebra em um determiando tipo de caractere

let lista = ["Kened","João","Fulano","Ciclano"]; //criando um array
console.log(lista);
console.log("Mostrando a posição 3 do array: "+ lista[3]);

//push
lista.push('Beltrano');
console.log("Lista após o push: "+lista);

//.pop
let elimina = lista.pop(); //Elimina o ultimo elemento do array, e retorna o valor eliminado
console.log(elimina);
console.log("Lista após o pop: "+lista);

//.shift
let elimina2 = lista.shift(); //Elimina o primeiro elemento do array, e retorna o valor eliminado
console.log(elimina);
console.log("Lista após o shift: "+lista);

//.unshift
let adiciona = lista.unshift("Kened"); //Adiciona valor ao primeiro elemento do array, e retorna o valor adicionado
console.log(adiciona);
console.log("Lista após o unshift: "+lista);
 
//.join
let stringArray = lista.join(" "); //tranforma os elementros de uma array em uma string separado por um delimitador a ser passado
console.log("Array tranformado em string:"+ stringArray);

lista.push("Kened")
console.log(lista.lastIndexOf("Kened")) //Retorna a posição do ultimo valor encontrado
console.log(lista.indexOf("Kened")) // Retona a primeira posição do primeiro valor encontrado

//.includes
retorno = lista.includes("Kened"); //Verifica se tem o valor passado no array e retorna true ou false
retorno2 = lista.includes("Mauricio");
console.log(retorno);
console.log(retorno2);






