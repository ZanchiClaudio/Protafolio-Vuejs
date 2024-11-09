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
            System.out.println("================================================================");
            System.out.println("|    Seleccione una opcion de dificultad del modo clásico      |");
            System.out.println( "|    1- Facil                                _        ,..     |");
            System.out.println("|    2- Medio                           ,--._\\_.--, (-00)      |");
            System.out.println("|    3- Dificil                        ; #         _:(  -)     |");
            System.out.println("|    4- Palabra personalizada          :          (_____/      |");
            System.out.println("|                                      :            :          |");
            System.out.println("|    Seleccione una opcion:             `.___..___.            |");
            System.out.println("================================================================");
            eleccionMod = entrada.nextLine();
            
        }while(eleccionMod == "1" || eleccionMod == "2" || eleccionMod == "3" || eleccionMod == "4");
             
        int eleccion_modo_tradicional = Integer.parseInt(eleccionMod);
        
        return eleccion_modo_tradicional;
    }
    
}
