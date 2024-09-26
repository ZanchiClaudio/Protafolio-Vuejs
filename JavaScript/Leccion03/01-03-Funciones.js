//hoisting: La podemos llamar antes o despues de definir la funcion
miFuncion(8, 2);
//Esto nos permite definir la funcion en cualquier parte del codigo

function miFuncion(a, b){ //Puede o no tener parametros
    //Cuerpo de la funcion
     //console.log("Sumamos: "+ (a + b));
    return a + b; 
}

//Llamamos la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Funciones de tipo expresion o anonima
let x = function(a, b){return a + b}; //necesita cierre con;
resultado = x(5, 6); //se usa el nombre de la variable y los parentesis con los argumentos
console.log(resultado);

//Funciones de tipo self y invoking
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6); //No se puede volver a llamar, solo se llama una sola vez a si misma


console.log(typeof miFuncion);
//para saver la cantidad de argumentos recivio la fincion
function miFuncion2(a, b){
    console.log(arguments);
    console.log(arguments.length);
}
miFuncion2(5, 7, 3, 6);

//toString: Convierte la funcion a texto
var miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto);

//funcion Flecha
const sumarFuncionFlecha = (a, b) => a + b;//simbolo de flecha 
resultado = sumarFuncionFlecha(3, 7);
console.log(resultado);
//no se utiliza la palabra function ni las llaves ni la palabra return

let sumar = function(a=5, b=5){
    console.log(arguments[0]); //muestra el parameto de: a
    console.log(arguments[1]); //muestra el parameto de: b
    console.log(arguments[2]);
    return a + b + arguments[2];
}
resultado = sumar();
console.log(resultado);
resultado = sumar(3, 5, 9);
console.log(resultado);
//No requiere que coincida la cantidad de argumentos con la cantidad de parametros

//sumar todos los argumantos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//Tipos primitivos : paso por valor
let k = 10;//variable global
function cambairValor(a){
    a = 20;//Esta variable se destruye al momento de terminar la funcion
}

cambairValor(k);
console.log(k);

//Paso por referencia.
//Se le pasa la posicion exadecimal del espacio de memoria 
const persona = {
    nombre: 'Juan',
    apellido: 'Lopez'
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}//se destruye la variable p1, pero como utilizo el mismo espacio de memoria, afecta a la ariable global por lo que modifica al objeto

cambiarValorObjeto(persona);
console.log(persona);
