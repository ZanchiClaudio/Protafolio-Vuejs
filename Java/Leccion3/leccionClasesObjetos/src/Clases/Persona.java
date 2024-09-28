//Una clase es una plantilla de la cual podemos crear objetos
//Las clases  se nombran con la escritura pascalcase
package Clases;


public class Persona {
    //Declaracion de los atributos, es recomendable realizarlos al principio del codigo
    //(caracteristicas)
    public String nombre;
    public String apellido;
    
   //Metodos de la clase (Acciones)
    public void obtenerInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
