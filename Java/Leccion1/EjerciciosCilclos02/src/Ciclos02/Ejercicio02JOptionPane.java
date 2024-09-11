/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos02;

import javax.swing.JOptionPane;


public class Ejercicio02JOptionPane {
    public static void main(String[] args) {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); 
        while(numero != 0){
            if(numero > 0){
                //System.out.println("El numero " + numero + " es positivo");
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            }
            else{
                //System.out.println("El numero " + numero + " es negativo");
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        //System.out.println("Ingreso un numero negativo. Finaliza el programa");
        JOptionPane.showMessageDialog(null, "El numero " + numero + " FINALIZA EL PROGRAMA");
    }   
}
