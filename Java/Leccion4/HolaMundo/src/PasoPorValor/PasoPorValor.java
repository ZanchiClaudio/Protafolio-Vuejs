
package PasoPorValor;


public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //solo se envia una copia. No manipula el espacio de memoria
        //simplemente copia el valor y lo copia dentro del metodo
        System.out.println("valorX = " + valorX);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
        
    }
    
}
