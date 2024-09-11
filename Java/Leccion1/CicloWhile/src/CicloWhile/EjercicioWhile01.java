
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
//ciclo While
        var conteo = 0; //inferencia de tipos
        while(conteo<7){
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en 1 la variable
        }
//ciclo do while        
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 7);
        
//ciclo For
        for(var contando = 0;contando < 7;contando++){ //(variable;condicion;incremento)
            System.out.println("contando = " + contando);
            
        }
//Palabras breack y continue

        for(var contando = 0;contando < 7;contando++){
            if (contando %2 == 0){
            System.out.println("contando = " + contando);
            break;
            }
            }
        
         for(var contando = 0;contando < 7;contando++){
            if (contando %2 != 0){    
                continue; //Hace que salga pero que continue con las iteraciones siguientes
            }
            System.out.println("contando = " + contando);
            }
         
//Utilizacion de etiquetas labels
        inicio:
         for(var contando = 0;contando < 7;contando++){
            if (contando %2 == 0){
            System.out.println("contandoLabels = " + contando);
            break inicio;
            }
         }
        inicio2:
        for(var contando = 0;contando < 7;contando++){
            if (contando %2 != 0){    
                continue inicio2; //Hace que salga pero que continue con las iteraciones siguientes
            }
            System.out.println("contando = " + contando);
            }
    }
}
