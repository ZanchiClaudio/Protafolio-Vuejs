/*
 Carga del juego en si. 
 */
package ar.com.codesystem.parametrosjuego;

import java.util.Scanner;


public class Juego {
    
        String palabraUsuario[] = new String [23];
        int intentos = 6, longPalabra = 0, cont, eleccion, incrementos = -1;
        String  palabra, aux,aux1; 
        String letrasqueingreso[] = new String[23];
        char letraSubCadena;
        String aciertos = "false";
        
        
        
    public String JuegoAhorcado (String palabra){ 
        Scanner entrada = new Scanner(System.in);
        //inicializo el arreglo
        for (int i = 0; i < palabra.length(); i++) {
            palabraUsuario[i] = "_ ";
        }
        for (int i = 0; i < 22; i++) {
            letrasqueingreso[i] = "";
        }
        
        Intentos animacion = new Intentos(); //creacion del objeto animacion para mostrar el viejo
        
        //juego
        while(intentos>0 && aciertos=="false"){
            

            
            System.out.println("Intentos restantes: " + intentos );
            animacion.Intento(intentos);
            System.out.println("Palabra");
            
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print(palabraUsuario[i]);
            }
            System.out.println();
            //leer letra ingresada por el usuario
            if(intentos == 3 ){
                Ayudin ayudin1 = new Ayudin();
                eleccion = ayudin1.Ayuda(palabraUsuario,palabra);
                if(eleccion == 1){
                    intentos -= 2;
                }
            }
            System.out.println("Ingrese una letra: ");
            String letraIngresada = entrada.nextLine();
            while(letraIngresada == ""){
                System.out.println("Ingrese una letra");
                letraIngresada = entrada.nextLine();
            }
                        
              for (int i = 0; i < 70; i++) {
                System.out.println();   
            }
            
            letraIngresada = letraIngresada.toUpperCase();
            incrementos +=1;
            letrasqueingreso[incrementos] = letraIngresada;                        
    
            
            //mostramos las letras ingresadas:
            System.out.print("Las letras ya ingresadas son: ");
            for (int i = 0; i < 22; i++) {
                System.out.print(letrasqueingreso[i] + " ");
            }
 //           System.out.println(letrasqueingreso);
           // letrasqueingreso.append(letraIngresada);
//            System.out.println("letrasqueingreso = " + letraIngresada);
            aciertos = "false";
            System.out.println();
            for (int i = 0; i < palabra.length(); i++) {
                letraSubCadena = palabra.charAt(i);
                if(letraIngresada.charAt(0) == letraSubCadena){
                    palabraUsuario[i] = letraIngresada;
                    aciertos = "true";
                }
            }
            
            //descontamos los intentos
            if(aciertos == "false"){
                intentos -= 1;
            }
            //Aumento el contador para determinar si todas las letras del arreglo forman la palabra
            cont = 0;
            for (int i = 0; i < palabra.length(); i++) {
                aux = palabraUsuario[i];
                letraSubCadena = aux.charAt(0);//transformacion a tipo char
                if(letraSubCadena == palabra.charAt(i)){
                    cont += 1;
                }
            }
            //Verificamos si adivino la palabra
            if(cont == palabra.length()){
                            
                for (int i = 0; i < 70; i++) {
                    System.out.println();   
                }
                System.out.println();
                System.out.println("Palabra");
                //Mostramos la palabra del arreglo
                for (int i = 0; i < palabra.length(); i++) {
                    System.out.print(palabraUsuario[i]);
                }
                System.out.println();
                animacion.Intento(7);
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("$           ¡¡Felicidades!!             $");
                System.out.println("$   Has adivinado la palabra secreta    $");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                aciertos = "true";
            }
            else{
                aciertos = "false";
            }

        }
        
        //se muestra la palabra al perder
        if(aciertos == "false"){
            for (int i = 0; i < 70; i++) {
                System.out.println();   
            }
            animacion.Intento(8);
            System.out.println("******************************************");
            System.out.println("*             Has perdido                *");
            System.out.println("*  La palabra secreta era:"+palabra+"    *");
            System.out.println("******************************************");
        }
    return aciertos;    
    }
    
    
}
