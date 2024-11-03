 /*Uso de la palabra final.
Esta palabra tiene diferentes significado dependiendo donde se apliquen:
    Variable: evita cambiat el valor que almacena la variable
    Metodos: Evita que se modifique la definicion o el comportamiento de un metodo
            desde una sub clase (hija)
    Clases: Evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables
se combinan con el modificado de acceso estatico para convertir una
variable en una constante, es decir que no se puede modificar su valor,
el ejempl de esto es la clase Math en la cual todos sus atributos
son de tipo static y final, es por esto que la variable pi* se conoce
como una constante
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 38456721;
        System.out.println("miDni = " + miDni);
        //miDni = 20312321; //No se puede asignar un valor, no se puede reasignar la varible
        //Persona.CONSTANTE_AQUI = 9; //No se puede modificar
        System.out.println("Mi constante es: " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //no se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 = " + persona1.getNombre());
        //no se puede modificar las referencias, pero si el contenido del atributo
        persona1.setNombre("Liliana");
        System.out.println("persona1 = " + persona1.getNombre());
        
    }
    
}
