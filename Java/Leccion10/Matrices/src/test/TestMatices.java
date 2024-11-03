
package test;

import domain.Persona;


public class TestMatices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2]; //manera de crear una matriz
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5; //llenado manual
        edades[0][1] = 7;  //Diferente columna del de arriba
        edades[1][0] = 8; 
        edades[1][1] = 4;
        edades[2][0] = 9; 
        edades[2][1] = 1;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);
        
        //Recorremos la matriz con ciclos anidados for
        System.out.println("Recorremos la matriz atraves del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) { //recorremos las filas
            for (int col = 0; col < edades[fila].length; col++) { //Recorremos las columnas
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col] );
            }
            
        }
        
        //String frutas[][] = new String [3][2]; //sintaxis clasica definimos = instanciamos
        String frutas[][] ={{"Limon", "Pomelo"},{"Ciruela", "Kiwi"},{"Banana", "Manzana"}}; //sintaxis simplificada
        
         System.out.println("Recorremos la matriz frutas atraves del ciclo for");
         imprimir(frutas);
//        for (int i = 0; i < frutas.length; i++) { //recorremos las filas
//            for (int j = 0; j < frutas[j].length; j++) { //Recorremos las columnas
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j] );
//            } 
//        }
        
        //Creacion de una matriz de objetos
        Persona personas[][] = new Persona[3][2];
        //Asignamos los valores a la matriz
        personas[0][0] = new Persona("Claudio"); //instanciamos con un objeto de la clase Persona
        personas[0][1] = new Persona("Esteban");
        personas[1][0] = new Persona("Florencia");
        personas[1][1] = new Persona("Mikaela");
        personas[2][0] = new Persona("Fernando");
        personas[2][1] = new Persona("Ramon");
       
        //imprimimos la matriz con el metodo imprimir
        imprimir(personas);
        
    }
    
    public static void imprimir(Object matriz[][]){ //no es necesario poner las filas y columnas
         for (int i = 0; i < matriz.length; i++) { //recorremos las filas
            for (int j = 0; j < matriz[j].length; j++) { //Recorremos las columnas
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j] );
            } 
        }
    }
    
}
