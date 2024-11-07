/*
Es el encargado de llmar a los menus en funcion de las eleciones del jugador y
gurdar los valores pra el Juego en si
 */
package ar.com.codesystem.parametrosjuego;

import ar.com.codesystem.menus.*;
import java.util.Scanner;
//import ar.com.codesystem.parametrosjuego.Matriz;

public class ParametrosJuego {
    
        String intentos_competencia, palabra;
        String [] nombres = new String[2];
        String [] parametros = new String [4];
        int  opcion_solitario;
        int fil, col, eleccion;
        
        public String[] ParametrosDelJuego(){
            Scanner entrada = new Scanner(System.in);
             
            MenuModoJuego menu_juego1 = new MenuModoJuego();
            
            switch(menu_juego1.MenuModJuego()){
                case 1:{
                    MenuSolitario menu_solitario1 = new MenuSolitario();
                    switch(menu_solitario1.MenuModSoli()){
                        case 1:{
                                MenuModoTradicional menu_trad1 = new MenuModoTradicional();
                                eleccion = menu_trad1.MenuModTradicional();
                                switch(eleccion){
                                    case 1:{
                                        col  = (int) Math.floor(Math.random()*15);
                                        fil = 0;
                                        Matriz palabra_matriz = new Matriz();
                                        palabra = palabra_matriz.MatrizJuego(fil, col);
                                        intentos_competencia = "1";
                                        break;
                                    }
                                    case 2:{
                                        col  = (int) Math.floor(Math.random()*15);
                                        fil = 1;
                                        Matriz palabra_matriz = new Matriz();
                                        palabra = palabra_matriz.MatrizJuego(fil, col);
                                        intentos_competencia = "1";
                                        break;
                                    }
                                    case 3:{
                                        col  = (int) Math.floor(Math.random()*15);
                                        fil = 2;
                                        Matriz palabra_matriz = new Matriz();
                                        palabra = palabra_matriz.MatrizJuego(fil, col);
                                        intentos_competencia = "1";
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("Ingrese la palabra para el juego: ");
                                        palabra = entrada.nextLine().toUpperCase();
                                        for (int i = 0; i < 70; i++) {
                                            System.out.println();                                        
                                        }
                                        intentos_competencia = "1";
                                        break;
                                    }
                                }
                                break;
                            }
                        
                        
                        case 2:{ //busca en la fila de matematicas
                            col  = (int) Math.floor(Math.random()*15);
                            fil = 3;
                            Matriz palabra_matriz = new Matriz();
                            palabra = palabra_matriz.MatrizJuego(fil, col);
                            intentos_competencia = "1";
                            break;
                        }
                        case 3:{
                            col  = (int) Math.floor(Math.random()*15);
                            fil = 6;
                            Matriz palabra_matriz = new Matriz();
                            palabra = palabra_matriz.MatrizJuego(fil, col);
                            intentos_competencia = "1";
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    MenuNombresJugadores nombre_jugadores = new MenuNombresJugadores();
                    nombres = nombre_jugadores.NombresJugadores();
                    MenuCompetencia menu_competencia = new MenuCompetencia();
                    eleccion = menu_competencia.MenuComp();
                    switch(eleccion){
                        case 1:{
                            intentos_competencia = "3";
                            break;
                        }
                        case 2:{
                            intentos_competencia = "5";
                            break;
                        }
                    } break;   
                }
                case 3:{
                    intentos_competencia = "0";
                    break;
                }
                default:{
                    System.out.println("Ingreso incorrecto");
                }
            
            }
           
            //Lenado de arreglo parametros
            parametros[0] = nombres[0];
            parametros[1] = nombres[1];
            parametros[2] = palabra;
            parametros[3] = intentos_competencia;
           
            
            return parametros;
        }
        
        
        
    
}
        
