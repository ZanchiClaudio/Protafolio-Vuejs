
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3]; //en 3 es la cantidad de elementos
        //del lado izq de del = estamos declarando la variable mientas que del 
        //lado der estamos instanciando un objeto de tipo object. No se puede modificar la cantidad de elementos
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0= " + edades[0]);
        
        edades[1] = 23;
        System.out.println("edades 1= " + edades[1]);
        
        edades[2] = 39;
        System.out.println("edades 2= " + edades[2]);
        
        // edades[3] = 54; //Da error en tiempo de ejecucion pero no en el compilador
        
        for(int i = 0 ; i < edades.length; i++){
            System.out.println("edades y sus elementos " + i + ": "+ edades[i] );
        }
        
        
    }
    
}
