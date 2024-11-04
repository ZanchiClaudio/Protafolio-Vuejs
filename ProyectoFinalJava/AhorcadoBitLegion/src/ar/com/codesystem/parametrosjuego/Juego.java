/*
 Carga del juego en si. 
 */
package ar.com.codesystem.parametrosjuego;

import java.util.Scanner;


public class Juego {
    public static void main(String[] args){
        String palabraUsuario[] = new String [20];
        int intentos = 5, longPalabra = 0, cont,eleccion;
        String  palabra, a;
        char letraSubCadena;//letraIngresada;
        boolean aciertos = false;
    
    
    //public Juego(){
        Scanner entrada = new Scanner(System.in);
        //inicializo el arreglo
        palabra = "ARBOL";
        for (int i = 0; i < palabra.length(); i++) {
            palabraUsuario[i] = "_ ";
        }
        //juego
        while(intentos>0 && aciertos==false){
            System.out.println("Intentos restantes: " + intentos );
            //animacion(intentos)
            System.out.println("Palabra");
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print(palabraUsuario[i]);
            }
            System.out.println();
            //leer letra ingresada ppor el usuario
            if(intentos == 3 ){
                eleccion = 0;
                //Ayudin(palabra,palabraUsuario,eleccion)
                if(eleccion == 1){
                    intentos -= 2;
                }
            }
            System.out.println("Ingrese una letra: ");
            String letraIngresada = entrada.nextLine();
            letraIngresada = letraIngresada.toUpperCase();
            aciertos = false;
            
            for (int i = 0; i < palabra.length(); i++) {
                letraSubCadena = palabra.charAt(i);
                if(letraIngresada.charAt(0) == letraSubCadena){
                    palabraUsuario[i] = letraIngresada;
                    aciertos = true;
                }
            }
            //descontamos los intentos
            if(aciertos == false){
                intentos -= 1;
            }
            //Aumento el contador para determinar si todas las letras del arreglo forman la palabra
            cont = 0;
            for (int i = 0; i < palabra.length(); i++) {
                a = palabraUsuario[i];
                letraSubCadena = a.charAt(0);//transformacion a tipo char
                if(letraSubCadena == palabra.charAt(i)){
                    cont += 1;
                }
            }
            //Verificamos si adivino la palabra
            if(cont == palabra.length()){
                System.out.println();
                System.out.println("Palabra");
                //Mostramos la palabra del arreglo
                for (int i = 0; i < palabra.length(); i++) {
                    System.out.print(palabraUsuario[i]);
                }
                System.out.println();
                //animacion(7)
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("$           ¡¡Felicidades!!             $");
                System.out.println("$   Has adivinado la palabra secreta    $");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                aciertos = true;
            }
            else{
                aciertos = false;
            }
        }
        
        //se muestra la palabra al perder
        if(aciertos == false){
            //animacion(0)
            System.out.println("******************************************");
            System.out.println("*             Has perdido                *");
            System.out.println("*  La palabra secreta era:"+palabra+"    *");
            System.out.println("******************************************");
        }
        
    }
    
    
}
