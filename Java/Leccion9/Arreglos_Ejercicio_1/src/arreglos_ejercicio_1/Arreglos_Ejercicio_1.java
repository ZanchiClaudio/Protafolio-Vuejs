/*
 Ejercicio 1 :Leer 5 numero, guardarlos en un arreglo y 
mostrarlos en el mismo orden ingresado
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        float array[] = new float[5];
        
        //solicitamos y guardado de los valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite el valor " + (i+1) + " del arreglo: ");
            array[i] = valor.nextFloat();   
        }
        
        //Mostramos los valores ingresados en el mismo orden ingresado
        System.out.println("\nLos valores ingresados al arreglo son: ");
        for (float i: array) {
            System.out.print(i + " ");
        }
        
    }
    
}
