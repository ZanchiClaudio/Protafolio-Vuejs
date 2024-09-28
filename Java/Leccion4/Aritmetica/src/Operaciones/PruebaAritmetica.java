
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
        Persona persona = new Persona("Caludio", "Zanchi");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }
    //Modularidad creamos un nuevo metodo
    public static void miMetodo(){
        //a = 10; tira error si no se inicializa 
        System.out.println("Aqui hay otro metodo");
    }
        
}

//creamos una nueva clase
//solo puede creear una sola clase public, las demas van a ser como defaul o package
class Persona{ //lo coloca automaticamente al modificador de acceso, no es necesario agregar ninguno
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //constructor
        //super();//constructor vacio, es de la clase Padre object. Lo hace automaticamente sin necesidad de agregarlo. Si se lo agrega hay que hacerlo al principio
        //Imprimir imprimir = new Imprimir(); //se puede acceder por que estan todos dentro de la miama estructura
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }

class Imprimir{
    public Imprimir(){
        super(); //el constructor fr la clase padre, para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde la calse imprimir: "+ persona);
        System.out.println("Impresion del objeto actual (this): "+this);
    }
    }
}
