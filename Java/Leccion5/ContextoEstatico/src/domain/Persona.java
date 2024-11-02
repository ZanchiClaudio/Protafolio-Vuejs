package domain;


public class Persona {

    //Cargamos los atributos
    private int idPersona;
    private static int contadorPersona; //al ser statico se asocia a la clase y no en si al objeto
    private String nombre;
    
    //Costructor
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; //No utilizar el contador this, si no atraves de la clase
        //Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
        
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //agrega informacion extra
    public String toString() { //estamos sobreescribiendo el metodo recibido de la clase object
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
