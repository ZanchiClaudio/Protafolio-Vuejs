/*
 Mostrar el menu tradicional 
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;


public class MenuModoTradicional {
    
    String eleccionMod;
    
    public Integer MenuModTradicional(){
    
     Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("---------------------------------------");
            System.out.println("|Seleccione la dificultar modo(clasico)|");
            System.out.println("|                                      |");
            System.out.println("|        1- Facil                      |");
            System.out.println("|        2- Medio                      |");
            System.out.println("|        3- Dificil                    |");
            System.out.println("|        4- Palabra personalizada      |");
            System.out.println("---------------------------------------");
            eleccionMod = entrada.nextLine();
            
        }while(eleccionMod == "1" || eleccionMod == "2" || eleccionMod == "3" || eleccionMod == "4");
        
        int eleccion_modo_tradicional = Integer.parseInt(eleccionMod);
        
        return eleccion_modo_tradicional;
    }
    
}
