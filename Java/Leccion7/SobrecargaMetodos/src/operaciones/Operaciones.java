
package operaciones;


public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }
    //si los metodos son de tipo public los sigientes no pueden tener otro tipo de modificador
    //pero si puede variar el tipo de retorno
    public static double sumar(double a, double b){
        System.out.println("Metodo para sumar double");
        return a + b;
    }
    
    
}
