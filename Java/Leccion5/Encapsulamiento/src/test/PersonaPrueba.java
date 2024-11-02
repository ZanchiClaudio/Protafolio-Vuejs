
package test;

import dominio.*; //no carga todas las clases dentro de memorio, por lo que no hay un mal uso de memoria


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000.0, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        System.out.println("persona1: " + persona1);
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar dado que tiene acceso privado
        //System.out.println("Nombre es = " + persona1.nombre);//Ya no se puede utilizar dado que tiene acceso privado
        System.out.println("persona1 su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 el resulta para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el boolean: " + persona1.isEliminado());
        //Tarea Crear otro objeto tipo persona, asignar valores de manera inicial
        //y imprimir. luego modificar sus valores y volver a imprimir.
        Persona persona2 = new Persona("Claudio", 35000.0, false);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo es: " + persona2.getSueldo());
        System.out.println("persona2 su boolen es: " + persona2.isEliminado());
        //Modificamos e imprimimos a traves de los metodos
        persona2.setNombre("Esteban");
        persona2.setSueldo(40000.00);
        System.out.println("persona1 su nombre modificado es: " + persona2.getNombre());
        System.out.println("persona1 el resulta para el sueldo: " + persona2.getSueldo());
        System.out.println("persona1 para obtener el boolean: " + persona2.isEliminado());
        //toString
        //System.out.println("persona1: " + persona1.toString()); //sintaxis correcta pero
        System.out.println("persona1: " + persona1); //al estar definido el toString lo llama automaticamente
        
        
        
    }
    
    
}
