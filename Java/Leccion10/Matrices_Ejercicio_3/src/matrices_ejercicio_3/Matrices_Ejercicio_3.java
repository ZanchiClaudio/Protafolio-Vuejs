/*
 Ejercicio 3: Crea y carga una matriz de tamaño 3x3, trasponerla y mostrar
 */
package matrices_ejercicio_3;

import java.util.Scanner;
public class Matrices_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        
        System.out.println("Rellenar la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"] ["+j+"] :");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println(); //salto de linea
        
        //mostramos la matiz original
        System.out.println("Matriz Original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //mostramos la matiz traspuesta
        System.out.println("Matriz Traspuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
