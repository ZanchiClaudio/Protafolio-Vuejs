/*
 Sera la parte del programa que llamara los demas "metodos, clases, etc"
para que funcione el juego
 */
package ar.com.codesystem.juego;

import ar.com.codesystem.parametrosjuego.*;
import ar.com.codesystem.opcion2jugadores.*;




public class Ahorcado {
    public static void main(String[] args) {
        
        String nombre1, nombre2, palabra, aciertos;
        String[] parametros = new String[4];
        int intentos_competencia, fil, col, ganados_jugador1 = 0,gandos_jugador2 = 0;
      
                
        ParametrosJuego parametros1 = new ParametrosJuego();
        parametros = parametros1.ParametrosDelJuego();
        nombre1 = parametros[0];
        nombre2 = parametros[1];
        palabra = parametros[2];
        intentos_competencia = Integer.parseInt(parametros[3]);
        if(intentos_competencia == 1){
           Juego juego1 = new Juego();
           aciertos = juego1.JuegoAhorcado(palabra);
        }
        else if(intentos_competencia == 0){
            System.out.println("Muchas gracias");
        }
        else{
            while(intentos_competencia > 0){
                Matriz palabra1 = new Matriz();
                col  = (int) Math.floor(Math.random()*15);
                fil  = (int) Math.floor(Math.random()*7);
                palabra = palabra1.MatrizJuego(fil, col);
                System.out.println("Turno del jugador: "+nombre1);
                System.out.println("Ronda:"+ intentos_competencia);
                Juego juego2 = new Juego();
                aciertos = juego2.JuegoAhorcado(palabra);
                if(aciertos == "true"){
                    ganados_jugador1 += 1;
                }
                //Turno del jugador 2
                Matriz palabra2 = new Matriz();
                col  = (int) Math.floor(Math.random()*15);
                fil  = (int) Math.floor(Math.random()*7);
                palabra = palabra2.MatrizJuego(fil, col);
                System.out.println("Turno del jugador: "+nombre2);
                System.out.println("Ronda:"+ intentos_competencia);
                Juego juego3 = new Juego();
                aciertos = juego3.JuegoAhorcado(palabra);
                
                if(aciertos == "true"){
                    ganados_jugador1 += 1;
                }
                intentos_competencia -= 1;
            }
            for (int i = 0; i < 70; i++) {
                System.out.println();   
            }
            Intentos intentofinal = new Intentos();
            intentofinal.Intento(7);
            Ganador ganador = new Ganador();
            ganador.MenuGanador(nombre1, nombre2, ganados_jugador1, gandos_jugador2);
        }
        
    }
    
    
}
