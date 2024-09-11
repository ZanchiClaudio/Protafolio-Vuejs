/*
Ejercicio1: Leer un numero y mostrar su cuadrado.
Repetir el proceso hata que se introduzca un numero negativo
*/
package Ciclos01;
import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado ;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            numero = Integer.parseInt(entrada.nextLine());
            
        }
        System.out.println("Ingreso un numero negativo. Finaliza el programa");
                
    } 
}
