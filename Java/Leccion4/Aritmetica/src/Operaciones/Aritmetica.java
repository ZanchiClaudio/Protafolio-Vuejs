
package Operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a; 
    int b;
    
    //El constructor es un metodo especial(construye un objeto, guarda un lucar en memoria e inicializa los metodos
    public Aritmetica(){ //cosntructor 1
        System.out.println("Se esta ejecutando el constructor numero 1");
    }
    //Estamso viendo lo que se llama sobrecarga de constructores
    public  Aritmetica(int a, int b){ //constructor 2
        this.a = a; //es ara que el compilador diferencie entre el atribito con la variable, si no se pone el this 
        this.b = b; //la variavle tiene que tener un nuobre distinto
        System.out.println("Se esta ejecutando el constructor numero 2");
    }
    
    //Metodos
    public void sumarNumero(){ //el retorno es vacio
        //cuerpo de la clase, las variables aqui son locales. 
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
    
    public int sumarConRetorno(){ //retorna un int   
        int resultado = a + b;
        return resultado;
    }
    
    public int sumaConArgumentos(int arg1, int arg2){
        this.a = arg1;//El argumento a se asigna al atributo this.a
        this.b = arg2;//Se usa para diferenciar los atributos por argumnetos aunque tenga el mismo nombre
        //return  a + b;
        return this.sumarConRetorno();//solo se hacen con metodos de la misma clase No RECOMENDABLE
    }
}
