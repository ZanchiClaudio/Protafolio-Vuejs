/*
 Mostrar el menu nombre de jugadores, guardar u retornar los nombres 
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;


public class MenuNombresJugadores {
    
    String nombres[] = new String[2] ;
    
    public String[] NombresJugadores(){
       
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("=======================================================================");
	System.out.println("|   \\     /\\                                                          |");
	System.out.println("|    )   (  °)     MODO COMPETITIVO                                   |");
	System.out.println("|    (  /  )                                                          |");
	System.out.println("|     \\(__)|      Digite el nombre del jugador 1                      |");
        nombres[0] = entrada.nextLine();
        System.out.println("|                                                 /|oo \\               |");
	System.out.println("|               Digite el nombre del jugador 2   (_|  /_)              |");
	System.out.println("|                                                 `@/  \\               |");
	System.out.println("|                                                  |     \\   \\          |");
	System.out.println("|                                                  |||\\ /  \\//         |");
	System.out.println("|                                                _//|| _\\   /          |");
	System.out.println("|                                              (_/(_|(____/            |");
        nombres[1] = entrada.nextLine();
        System.out.println("=======================================================================");
        return nombres; //Retorno un arreglo
    }
    
}
