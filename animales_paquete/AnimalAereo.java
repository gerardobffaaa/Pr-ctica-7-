/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class AnimalAereo extends Animal{
    
    private int numeroAlas;
    /**
    *
    * Metodo constructor vacío
    */
    public AnimalAereo() {
    }
    /**
    *
    * Metodo constructor completo
     * @param numeroAlas
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
    *
    * Metodo Para obtener el cnumero de alas
     * @return 
    */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
    *
    * Metodo Para obtener el numero de alas
     * @return 
    */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
    *
    * Metodo Para volar
     *
    */
     public void volar(){
    
        System.out.println("Estoy volando");
    }
    /**
    *
    * Se sobre escribe comer para ser especializada al animal
     * 
    */
    @Override
    public void comer(){
        System.out.println("Comiendo comida aerea");
    
    }
    /**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    * @return 
    */
    @Override
    public String toString() {
        return super.toString()+"AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
    
    
}
