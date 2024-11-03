/*
 Ejercicio 3 : Leer 5 numeros por teclado, almacenarlos en un arreglo
y a continuacion realizar la media de los numero positivos, la media de los
negativos y contar el nnumero de ceros.
 */
package arreglos_ejercicio_3;
import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numeros[] = new float[5];
        float negativos = 0 , positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteo_neg = 0, conteo_pos = 0;
        
        System.out.println("Guardamos los elementos del arreglo: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i] > 0){
                positivos += numeros[i];
                conteo_pos++;
            }
            else if(numeros[i] < 0){
                negativos += numeros[i];
                conteo_neg++;
            }
            else{
                conteo0++;
            }
        }
        
        if(conteo_pos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros positivos");
        }
        else{
            mediaPositivos = positivos / conteo_pos;
            System.out.println("\nLa media de los numeros positivos es: " + mediaPositivos );
        }
        
        if(conteo_neg == 0){
            System.out.println("\nNo se puede sacar la media de los valors negativos ");
        }
        else{
            mediaNegativos = negativos / conteo_neg;
            System.out.println("\nLa media de los numeros negativos es: "+ mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: " + conteo0);
        
    }
}
