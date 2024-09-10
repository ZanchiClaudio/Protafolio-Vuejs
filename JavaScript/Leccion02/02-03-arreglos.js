// los arreglos son de typo objeto. 
//let autos = new Array("Ferrari","Reanult","BMW"); //forma antigua ya no recomendad.
const autos = ["Ferrari","Reanult","BMW"]; //declaramos al variable y los elementos del arreglo
console.log(autos);

//Recorremos los arreglos
console.log(autos[0]); //mostramos el elemento 0 del arreglo.
console.log(autos[2]);
for(let i = 0; i < autos.length; i++){
    console.log(i+": " +autos[i]);
}

// Modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

//Agregar nuevosd valores al arreglo
autos.push('Audi'); //Agregamos el elemento al final del arreglo
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porsche'; //le agregamos un nuevo valor al final de arroglo con la long del mismo 
console.log(autos);

//Tercera forma de agregar elemntos teniendo CUIDADO
autos[6] = 'Renault'; //te agrega el espacio vacio ocupando memoria
console.log(autos);

//Como preguntar su es un array 
console.log(Array.isArray(autos)); //devuelve un booleano

console.log(autos instanceof Array); //preguntamos si la variable es una intancia de la clase array

 