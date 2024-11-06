/*
 Creacion del menu solitario
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;


public class MenuSolitario {
    
    
    String eleccionMod;
    
    public Integer MenuModSoli(){
    
     Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("---------------------------------------");
            System.out.println("|Seleccione la tematica de la palabra |");
            System.out.println("|                                     |");
            System.out.println("|        1- Clasica                   |");
            System.out.println("|        2- Matematica                |");
            System.out.println("|        3- Informatica               |");
            System.out.println("---------------------------------------");
            eleccionMod = entrada.nextLine();
            
        }while(eleccionMod == "1" || eleccionMod == "2" || eleccionMod == "3");
        
        int eleccion_modo_solitario = Integer.parseInt(eleccionMod);
        
        return eleccion_modo_solitario;
    
}
}
