/*
 carga de la funcion que te da una letra a cambio de 2 intentos
 */
package ar.com.codesystem.parametrosjuego;

import java.util.Scanner;


public class Ayudin {
   char eleccion1;
   int eleccion;
   String letra = "_ ", palabraAyudin[] = new String [20];
   boolean comp;
    
    public Integer Ayuda(String palabraUsuario[], String palabra){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < palabra.length()-1; i++) {
            palabraAyudin[i] = "_ ";
        }
        String palabraAyudin[] = palabra.split(""); //convierto la palabra en un arreglo
        do{
            System.out.println("---------------------------------------");
            System.out.println("|  Una letra a cambio de dos intentos  |");
            System.out.println("|              ¿Quieres?               |");
            System.out.println("|      1-SI                2-NO        |");
            System.out.println("---------------------------------------");
            eleccion1 = entrada.nextLine().charAt(0);
            if(eleccion1 == '1'){
                comp = false;
            }
            else if(eleccion1 == '2'){
                comp = false;
            }
            else{
                comp = true;
            }  
        }while(comp);
        
        int eleccion = Character.getNumericValue(eleccion1);
        if (eleccion == 1){
            System.out.println("11111111");
            for (int i = 0; i < palabraUsuario.length - 1; i++) {
                if(palabraUsuario[i] == "_ " & letra == "_ "){
                    letra = palabraAyudin[i];
                    System.out.println("Utiliza la letra: " + letra);
                }
            }
        }
        return eleccion;
    }
    
}
