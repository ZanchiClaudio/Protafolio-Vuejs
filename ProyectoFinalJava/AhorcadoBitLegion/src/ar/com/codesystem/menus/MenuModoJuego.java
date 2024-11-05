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
            System.out.println("---------------------------------------");
            System.out.println("|        Ahorcado BitLegion            |");
            System.out.println("|                                  O   |");
            System.out.println("|     Seleccione modo de juego   --|   |");
            System.out.println("|        1- Un jugador          |  |   |");
            System.out.println("|        2- Dos jugadores         | |  |");
            System.out.println("|        3- Salir                      |");
            System.out.println("---------------------------------------");
            eleccionMod = entrada.nextLine();
            
        }while(eleccionMod == "1" || eleccionMod == "2" || eleccionMod == "3");
        
        int eleccion_modo_juego = Integer.parseInt(eleccionMod);
        
        return eleccion_modo_juego;
    }
}
