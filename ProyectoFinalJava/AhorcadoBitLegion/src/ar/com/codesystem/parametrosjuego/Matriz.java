/*
Generadora de la matriz, hay qe definir se la realizamos como matriz o como una matris de objetos
 */
package ar.com.codesystem.parametrosjuego;


public class Matriz {
    int i, j;
    String dato[][] = new String[7][15];
    String palabramatriz;
    public String MatrizJuego(int i, int j){
        
        //Lleno la matriz
        dato[0][0] = "HOLA";
        dato[0][1] = "CASA";
        dato[0][2] = "LATA";
        dato[0][3] = "ARBOL";
        dato[0][4] = "GATO";
        dato[0][5] = "PERRO";
        dato[0][6] = "ARROZ";
        dato[0][7] = "MESA";
        dato[0][8] = "CALLE";
        dato[0][9] = "CARTON";
        dato[0][10] = "SABLE";
        dato[0][11] = "TERMO";
        dato[0][12] = "PARRA";
        dato[0][13] = "SILLA";
        dato[0][14] = "ALAS";
        dato[1][0] = "ESPEJOS";
        dato[1][1] = "ALACENA";
        dato[1][2] = "CAMPERA";
        dato[1][3] = "ARMARIO";
        dato[1][4] = "LAMPARA";
        dato[1][5] = "GANADOR";
        dato[1][6] = "COCINA";
        dato[1][7] = "TAPADO";
        dato[1][8] = "CELESTE";
        dato[1][9] = "LENTEJA";
        
        palabramatriz = dato[i][j];
        
        
       return palabramatriz;
    }
}
        
       
    
    

