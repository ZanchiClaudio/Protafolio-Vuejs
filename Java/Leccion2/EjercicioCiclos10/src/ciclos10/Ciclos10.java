//Ejercicio10: Pedir 10 numero y escribir la suma total
//Hacerlo con la clase scanner y JoptionPane
package ciclos10;

import java.util.Scanner;


public class Ciclos10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de todos los numero ingresados es:  "+suma);
    }
    
}
