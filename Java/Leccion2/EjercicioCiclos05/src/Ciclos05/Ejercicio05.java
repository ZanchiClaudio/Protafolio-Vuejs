/*
Ejercicio 5: Realizar un juego para adivinar un numero, para ello 
generar un numeor aleatorio de 0-100, y luego ir pidendo numeros indicando 
"es mayor" o es "es menor" segun sea mayor o menor con respecto a N.
Ell proceso ternima cuando el usuario acierta y mostramos el numero de intentos hechos
 */
package Ciclos05;

import javax.swing.JOptionPane;


public class Ejercicio05 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);//Esto genera un numero aleatorio de 0 a 100
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if(numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero mayor");
            }
            else if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
                }
            else{
                JOptionPane.showMessageDialog(null, "Has adivinado el numeor");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste en numero en " +conteo+ " intentos");
    }
    
}
