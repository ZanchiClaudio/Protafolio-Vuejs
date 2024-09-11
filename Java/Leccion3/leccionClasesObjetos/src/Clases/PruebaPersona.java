
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamanos al constructor. Este lo convierte a objeto
        persona1.nombre = "Claudio";//El valor hexadecimal normalmente comienza com 0x
        persona1.apellido = "Zanchi";
        persona1.obtenerInformacion();
        //Creacion de un nuevo objeto
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}
