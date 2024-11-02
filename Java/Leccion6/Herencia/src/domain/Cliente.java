
package domain;

import java.util.Date;

public class Cliente extends Persona{
    //Atributos
    private int idCliente;
    private Date fehcaRegistro; //Se tiene que importar el paquete date
    private boolean vip; //Very important person
    private static int contadorCliente; //tipo estatico
    
    //Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);//siempre va en primer lugar 
        this.idCliente = ++Cliente.contadorCliente;
        this.fehcaRegistro = fechaRegistro;
        this.vip  = vip;
    }
    
    //Get and Set
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFehcaRegistro() {
        return this.fehcaRegistro;
    }

    public void setFehcaRegistro(Date fehcaRegistro) {
        this.fehcaRegistro = fehcaRegistro;
    }

    public boolean isVip() { //usa el is por que es boolean, lo toma como una pregunta
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    //toString con StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fehcaRegistro=").append(fehcaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
