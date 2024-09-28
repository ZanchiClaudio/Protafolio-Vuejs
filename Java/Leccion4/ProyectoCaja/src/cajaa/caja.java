
package cajaa;

public class caja {//clase publica
     //Atributos
    int ancho;
    int alto;
    int profundidad;
    
    //Metodos y constructores
    public caja(){
        //constructor vacio
    }
    
    public caja(int ancho, int alto, int profundidad){
        //constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public int calcularVolumen(){
        return ancho * alto * profundidad;
    }
    
}
