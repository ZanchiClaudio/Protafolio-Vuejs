/*
 Mostrar el menu nombre de jugadores, guardar u retornar los nombres 
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;


public class MenuNombresJugadores {
    
    String nombres[] = new String[2] ;
    
    public String[] MenuModJuego(){
       
        Scanner entrada = new Scanner (System.in);
   
        System.out.println("---------------------------------------");
        System.out.println("|        Modo Competitivo             |");
        System.out.println("|                                     |");
        System.out.println("|   Digite el nombre de jugador 1     |");
        System.out.println("|                                     |");
        System.out.println("---------------------------------------");
        nombres[0] = entrada.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("|        Modo Competitivo             |");
        System.out.println("|                                     |");
        System.out.println("|   Digite el nombre de jugador 2     |");
        System.out.println("|                                     |");
        System.out.println("---------------------------------------");
        nombres[1] = entrada.nextLine();
        
        return nombres; //Retorno un arreglo
    }
    
}
