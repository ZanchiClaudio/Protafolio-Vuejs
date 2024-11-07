
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;
import javax.swing.JOptionPane;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Claudio", 57000.00); //los constructores se heredan
        System.out.println("empleado1 = " + empleado1);
        
        
        JOptionPane.showMessageDialog(null, "asfwfwefvw3 \n hshshshshs");
        JOptionPane.showInputDialog(null,"yo");
        
        JOptionPane.showMessageDialog(null, "asfwfwefvw3 \n hshshshshs");
        
//        Date fecha1 = new Date();
//        
//        Cliente cliente1 = new Cliente(fecha1, true, "Bety", 'F', 32, "9 de Julio 1413" );
//        System.out.println("cliente1 = " + cliente1);
//        
//        Persona persona1 = new Persona();
    }
    
    
}
