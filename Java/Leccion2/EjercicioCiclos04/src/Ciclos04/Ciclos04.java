/*
Ejercicio4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introdicido.
Hacerlo con la clase Scanner y la JOptionPane
 */
package Ciclos04;

import java.util.Scanner;


public class Ciclos04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int numero, conteo = 0;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El numero es Positivo");
            conteo++;
            System.out.println("Digite otro numero");
            numero = Integer.parseInt(entrada.nextLine());        
        }
        System.out.println("A ingresado " + conteo+ " que no son positivos");
    }
    
}
