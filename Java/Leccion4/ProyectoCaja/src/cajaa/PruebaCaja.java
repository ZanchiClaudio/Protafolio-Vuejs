
package cajaa; 

import java.util.ArrayList;

public class PruebaCaja {
    public static void main(String[] args) { //metodo main
        //variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundidad = 6;
        
        caja caja1 = new caja(); //instanciamos el objeto, constructor vacio
        caja1.ancho = medidaAncho; //Pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProfundidad;
        int resultado = caja1.calcularVolumen();//llamamos al metodo
        
        //primer resultado
        System.out.println("resultado volumen de caja 1: " + resultado);
        
        caja caja2 = new caja(2, 4, 6); //llamamos al constructor 2 con los nuevos argumentos
        //llamamos con el nuevo abjeto al metodo para un nuevo calculo
        System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen());
        
        
    }
}
        

                
        
   
