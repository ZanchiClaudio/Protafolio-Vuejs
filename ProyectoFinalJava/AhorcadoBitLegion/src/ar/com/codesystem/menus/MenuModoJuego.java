/*
creacion del menu modo de juego
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;

public class MenuModoJuego {
    String eleccionMod;
    
    public Integer MenuModJuego(){
    
     Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("=====================================================================");  
            System.out.println("|    __^__       Bienvenidos al Ahorcado BitLegion       __^__      |");  
            System.out.println("|   ( ___ )                                             ( ___ )     |");  
            System.out.println("|    | / |    Seleccione al modo de juego        O       | / |      |");  
            System.out.println("|    | / |    1- Un jugador                     /|\\      | / |      |");  
            System.out.println("|    |___|    2- Dos jugadores                   |       |___|      |");  
            System.out.println("|   (_____)   3- Salir                          / \\     (_____)     |");  
            System.out.println("=====================================================================");
            eleccionMod = entrada.nextLine();
            
        }while(eleccionMod == "1" || eleccionMod == "2" || eleccionMod == "3");
        
        int eleccion_modo_juego = Integer.parseInt(eleccionMod);
        
        return eleccion_modo_juego;
    }
}
