/*
 Mostrar el menu Competencia
Definir si lo realizamos con JOptionPane o Scanner
 */
package ar.com.codesystem.menus;

import java.util.Scanner;

public class MenuCompetencia {
    
    String eleccionComp1;
    
    public Integer MenuComp(){
        
        Scanner entrada = new Scanner (System.in);
        
        do{
            System.out.println("================================================================ ");    
            System.out.println("|                 Modo competitivo              ./(       )\\.   |");  
            System.out.println("|       Seleccione a cuantas rondas jugaran     )  \\/\\_/\\/      |");  
            System.out.println("|         1- El mejor de 3                      `)  (^Y^)  (`   |");  
            System.out.println("|         2- El mejor de 5                       `),-(~)-,(`    |");  
            System.out.println("================================================================ ");
            eleccionComp1 = entrada.nextLine();
            
        }while(eleccionComp1 == "1" || eleccionComp1 == "2");
        
        int eleccionComp = Integer.parseInt(eleccionComp1);
        
        return eleccionComp;

    }
}
