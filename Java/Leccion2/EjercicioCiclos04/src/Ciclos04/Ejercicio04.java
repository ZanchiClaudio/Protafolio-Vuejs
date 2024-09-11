/*
Ejercicio4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introdicido.
Hacerlo con la clase Scanner y la JOptionPane
 */
package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
        
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero es Positivo");
            conteo++;
            JOptionPane.showMessageDialog(null, "Digite otro numero");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));       
        }
        JOptionPane.showMessageDialog(null, "A ingresado " + conteo+ " que no son positivos");
    }
    
}
