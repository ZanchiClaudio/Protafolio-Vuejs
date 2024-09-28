//Las clases son las plantillas, es decir que definiremos los metodos y propiedades. Estas no contienen valores
//y si tienen se va a agregar a todos los objeto o intancias que se generen desde las clases. 
//Las plantillas van a tener las caractristicas, atributos y metodos pero cada objeto creado
//tendra sus propios valores independientes unos de otros. 

//let persona3 = new Persona('Carla', 'Ponce'); //arroja error, solicita inicializar antes de usar la clase

//sintaxis basica
class Persona{  //Sera nustra clase padre
    constructor(nombre, apellido){ //metodo constructos
        this._nombre = nombre; //atributos
        this._apellido = apellido; //recomndable usar el _ en los atributos para que nos sean iguales a las variables del get y set
    }

    get nombre(){
        return this._nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

}

class Empleado extends Persona{ //clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); //se llama con super al constructir de la clase padre y se tiene que agregar sus parametros
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
 
}

let persona1 = new Persona('Facundo', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
//console.log(persona2); 
//tarea, hacer lo mismo para apellido
//Para la persona 1
console.log(persona1.apellido);
persona1.apellido = 'Mendoza';
console.log(persona1.apellido);
//Para la persona 2
console.log(persona2.apellido);
persona2.apellido = 'Flores';
console.log(persona2.apellido);

//metodo hosting y clases- no se puede llamar una clase sin ser definida, no funciona el metodo hosting
//Ejemplo arriba

//Herencia entre calses padre e hija
let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);