let x =10; //variable de tipo primitiva
console.log(x.length);

//Objeto
console.log('Tipos primitivos')
let persona ={
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'es', //Buenas practicas es que los idiomas van an mayusculas 
    get lang(){
        return this.idioma.toUpperCase(); //no importa si se ingresa en mayuscula o minuscula, lo transforma a todo en un strin y lo pasa a mayusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    //primero se asigna con el get y luego con el set le dados las propiedades que queremos, en este
    //caso solo pasamos todo a mayusculas. 

    //Creamos un metodo/funcion
    nombreCompleto: function(){
        return this.nombre + ' ' +this.apellido;
    },
    get nombreEdad(){//Agregamos el metodo get
        return 'El nombre es: '+this.nombre+ ' edad: '+this.edad;
    }
   
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log('Ejecutando con un objeto')

//otra forma de crear un objeto
let persona2 = new Object(); //crea un nuevo objeto en memoria
persona2.nombre = 'Juan';//carga de atributos y metodos del objeto
persona2.direccion = 'Salada 14';
persona2.telefono = '123456554';
console.log(persona2.telefono);
console.log('Creamos un nuevo objeto')

//acceder a las propiedades del objeto
console.log(persona.apellido); //accedemos como si fuerra un arreglo
//for in
console.log('Usamos el ciclo for in')
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}

//Cambiamos dianamicamente el valor de un objeto
console.log('Cambiamos y modificacmos un error')
persona.apellido = 'Zanchi'; //si nos equivocamos en el nombre de la propiedad vamos a crear una nueva propiedad en el objeto
console.log(persona.apellido); //y no vamos a modificar el valor que queriamos.
//Se agrega dado que nos confundimos en el nombre
persona.apellida = 'Zanchi';
console.log(persona);
//Lo podemos eliminar con delete
delete persona.apellida; //borra la pripiedad y el valor. 
console.log(persona);

//formas de imprimir objetos
//Numero 1: concatenar los valores de cada propiedad (la mas sencilla)
console.log('Distintas formas de imrimir un objecto. Forma 1');
console.log(persona.nombre+' '+persona.apellido);

//Numero 2: A traves del ciclo for in
console.log('Distintas formas de imrimir un objecto. Forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: La funcion Object.values() //devuelve un arrreglo 
console.log('Distintas formas de imrimir un objecto. Forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizando el metodo JSON.stringify / lo muestra como una cadena
console.log('Distintas formas de imrimir un objecto. Forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el metodo get')
//metodos get. Se agrega como un metodo dentro del objeto
console.log(persona.nombreEdad); //simplificamos la sintaxic al no poner los parentesis

//metodo get y set para idiomas.
console.log('Comenzamos con el metodo get y set pata idiomas');
persona.lang = 'en'
console.log(persona.lang);

//constructores de Objectos. 
//funcion especial que nos permite guardar la estructura del objeto
function Persona3(nombre = 'Luis', apellido, email){ //buenas practias es que comience con mayusculas - Se puede preasignar valores 
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    //Agregamos metodos dentro del metodo constructor
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}
let padre = new Persona3('Leo','Lopez','lopez@hotmail.com'); //Creacion del objeto padre con la estructura de Persona 3
padre.nombre = 'Pedro'; //Se puede modificar como un object normalmente
padre.telefono = '45688875'; //agregamos una nueva propiedad solo al objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); //LAs funciones llevan el parentesis
let madre = new Persona3('Laura','Contrera','contrera@hotmail.com');//creacion de otro objeto
console.log(madre);
console.log(madre.telefono);  //no esta definida la propiedad
console.log(madre.nombreCompleto());
//Cada objeto creado con new se gusrda independientemente en espacios de memoria distintos. 

//Distintas formas de crear Objetos
//Caso objeto 1
let miObject = new Object(); //opcion formal
//Caso objeto 2
let miObject2 = {}; //Forma breve y recomendada

//caso string 1
let miCadena1 = new String('Hola'); //sintaxis formal
//caso string 2
let miCadena2 = 'Hola'; //sintaxis simplificada y recomndada

//caso con numero1
let miNumero1 = new Number(1); //formal no recomndada
//caso con numero 2
let miNumero2 = 1 // sintaxis recomendada

//caso boolen1
let miBoolean1 =new Boolean(false); //formal
//caso boolean2
let miBoolean2 = false; //sintaxis recomendada

//caso arreglos 1
let miArreglo1 = new Array(); //Formal
//caso arreglo 2
let arreglo2 = []; //sintaxis recomendada

//caso funcion1
let miFuncion1 = new function(){}; //Todo despues de new es considerado objeto
//caso funcion2
let miFuncion2 = function(){}; //Notacion recomendada

//uso de prototype. Le podemos ingresar mas propiedades para todos los objetos creados con el constructor sin modificar derectamente el constructor
Persona3.prototype.telefono = '123455658745555';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '123456';
console.log(madre.telefono);

//Uso de call - Nos permite llamar un metodo que esta definido dentro de un objeto desde otro objeto
let Persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){   
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono;
        //return this.nombre+' '+this.apellido;
    }

}

let Persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
    //No definimos el metodo nombreCompleto2
}

console.log(Persona4.nombreCompleto2('Licenciado','45777899999'));
console.log(Persona4.nombreCompleto2.call(Persona5,'Ing','78521346'));

//Metodo Apply - tambien se utiliza para llamar a un metodo que esta en otro objeto
let arreglo = ['Ing' , '458887856663'];
console.log(Persona4.nombreCompleto2.apply(Persona5, arreglo));
//La diferencia es que apply cambia la forma de pasar los argumentos,
//Se tiene que pasar atraves de un arreglo

