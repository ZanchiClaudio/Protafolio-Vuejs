
package domain;


public class Empleado extends Persona { //con extends indeica que la clase empleado es hija de la clase persona
    //en java no se puede heredar de varias clases. Solo puede heredar de una sola clase padre
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //para hacer el incremento
    
    //Generamos el constructor
    public Empleado(){ //constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    public Empleado(String nombre, double sueldo) { //Constructor 2
        //super(nombre); //se usa el super o la llamada del constructor interno, no los dos. 
        //this.idEmpleado = ++Empleado.contadorEmpleados;
        this();//llamamos a un constructor interno
        this.nombre = nombre; //Accedemos al atributo de la clase padre
        this.sueldo = sueldo;
    }
    
    
    
    // metodos get and set
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //toString con la clase StringBuilder(es mas eficiente que la concatenacion de las +
    //dado que el + va creando objetos string que no se pueden modificar. )
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
