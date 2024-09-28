
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10;//variables locales: tiene alcance solo en el metodo
        int b = 7;//memoria stack
        miMetodo(); //llamos al metodo nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumero();//llama al metodo del archivo aritmetica
         //para almacenar un objeto o atributos se utiliza la mamoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumaConArgumentos(12, 26);
        System.out.println("resultado usando argumentos= " + resultado);
        
        System.out.println("Aritmetica1 a: "+aritmetica1.a);
        System.out.println("Aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8); 
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; //No utilizar, limpia el objeto, lo hace automaticamente
        //System.gc();//Recolector de basura, es inecesario dado que es muy pesado
        
    }
    public static void miMetodo(){
        //a = 10; tira error si no se inicializa 
        System.out.println("Aqui hay otro metodo");
    }
        
}
