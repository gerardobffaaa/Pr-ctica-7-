/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class Ballena extends AnimalAcuatico{
    
    private int largo;
    /**
    *
    * Metodo constructor vacío
    */
    public Ballena() {
    }
    /**
    *
    * Metodo constructor completo
     * @param largo
     * @param numeroAletas
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    
    /**
    *
    * Metodo Para obtener el largo
     * @return 
    */
    public int getLargo() {
        return largo;
    }
    /**
    *
    * Metodo Para establecer el largo
    * 
    */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
    *
    * Metodo para pelear con pinocho
    */
    private void pelearConPinocho(){
    
        System.out.println("Estoy peleando con pinocho");
    }
    
    /**
    *
    * Se sobre escribio el mensaje porque ls ballenas comen comida especial
    */
    
    @Override
     public void comer(){
         System.out.println("Comiendo krill");
    
    }
/**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    * 
     * @return 
    */
    @Override
    public String toString() {
        return super.toString() +"Ballena{" + "largo=" + largo + '}';
    }
    
    
    
}
