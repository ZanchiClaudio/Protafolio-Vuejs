/*
Ejercicio3: Leer numeros hasta que se introduzca un cero.
Para cada uno indicar si es par o impar
Primero lo hacemos con la clase Scanner
Luego con la clase JoptionPana
 */
package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada =new Scanner(System.in);
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero ingresado es PAR");
            }
            else{
                System.out.println("El numero ingresado es IMPAR");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
    }
        System.out.println("Finalizo el programa.Ingreso el 0");
    }
}
