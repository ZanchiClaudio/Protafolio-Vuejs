/*
Mostrata de manera grafica el nombre del ganado en el modo de 2 jugadores. 
 */
package ar.com.codesystem.opcion2jugadores;

import java.util.Scanner;


public class Ganador {
    
    //String nombres[] = new String[2] ;
    
    public void MenuGanador(String nombre1, String nombre2,int ganados_jugador1,int ganados_jugador2){
       
        Scanner entrada = new Scanner (System.in);
        
        if(ganados_jugador1 > ganados_jugador2){
            System.out.println("---------------------------------------");
            System.out.println("|         El ganador es:              |");
            System.out.println("|         "+ nombre1 +"               |");
            System.out.println("---------------------------------------");
        }else if(ganados_jugador1 < ganados_jugador2){
            System.out.println("---------------------------------------");
            System.out.println("|         El ganador es:              |");
            System.out.println("|         "+ nombre2 +"               |");
            System.out.println("---------------------------------------");
        }else{
            System.out.println("---------------------------------------");
            System.out.println("|          Hay un empate               |");
            System.out.println("---------------------------------------");
        }
        
        
        
    }
    
    
    
}
