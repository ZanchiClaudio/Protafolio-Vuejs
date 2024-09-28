
package dominio;


public class Persona {
    //atributos
    private String nombre;//Encapsulados
    private double sueldo;
    private boolean eliminado;
    
    //constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Crear metodos
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
}
