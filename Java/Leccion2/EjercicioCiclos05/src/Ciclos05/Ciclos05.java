/*
Ejercicio 5: Realizar un juego para adivinar un numero, para ello 
generar un numeor aleatorio de 0-100, y luego ir pidendo numeros indicando 
"es mayor" o es "es menor" segun sea mayor o menor con respecto a N.
Ell proceso ternima cuando el usuario acierta y mostramos el numero de intentos hechos
 */
package Ciclos05;

import java.util.Scanner;


public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100);//Esto genera un numero aleatorio de 0 a 100
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un numero mayor");
            }
            else if(numero > aleatorio){
                System.out.println("Digite un numero menor");
                }
            else{
                System.out.println("Has adivinado el numnero");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Adivinaste en numero en " +conteo+ " intentos");
    }
}