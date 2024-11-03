
package domain;


//public final class Persona { //clase constante. 
public class Persona {
    public final static int CONSTANTE_AQUI = 15; //forma correcta de definir una constante
    private String nombre;
    
    
    
    public final void imprimir(){ //Metodo constante
        System.out.println("Metodo imprimir desde la clase padre");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
