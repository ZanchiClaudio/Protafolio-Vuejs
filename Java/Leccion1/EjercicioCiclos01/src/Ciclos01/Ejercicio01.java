/*
Ejercicio1: Leer un numero y mostrar su cuadrado.
Repetir el proceso hata que se introduzca un numero negativo
*/
//Utilizacion de JOptionPane
package Ciclos01;

import javax.swing.JOptionPane; //Nos muestra un mesaje emergente simple y muetra la ejecucion en la consola

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); //Lo pasamos a entero por que devielve un tipo objeto
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));  
        }
        System.out.println("Ingreso un numero negativo. Finaliza el programa");
                
    }
    
}
