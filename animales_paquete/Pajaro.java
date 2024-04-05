/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class Pajaro extends AnimalAereo {
    
    private String tipoPico;
    /**
    *
    * Metodo constructor vacío
    */
    public Pajaro() {
    }
    /**
    *
    * Metodo constructor completo
     * @param tipoPico
     * @param numeroAlas
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    /**
    *
    * Metodo Para obtener el tipo de pico 
     * @return 
    */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
    *
    * Metodo para establecer el tipo de pico
     * @param tipoPico
    */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
    *
    * Metodo para recolectar ramas
    */
    public void recolectarRamas(){
    
        System.out.println("Estoy recolectando ramas");
        
    }
    /**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    */
    @Override
    public String toString() {
        return super.toString()+"Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
}
