/*
  Ejercicio 07 : Pedir numeros hasta que ingrese un numero negativo 
y calcular la media
 */
package Ciclos07;

import javax.swing.JOptionPane;


public class EjercicioCiclos07 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero >= 0){ //mientra el numero no sea negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        if(conteo == 0){
            JOptionPane.showMessageDialog(null,"Error, la divicion por cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
            
        }
    }   
}
