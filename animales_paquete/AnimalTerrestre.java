/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class AnimalTerrestre extends Animal {
    
    
    private int numeroPatas;
    /**
    *
    * Metodo constructor vacío
    */
    public AnimalTerrestre() {
    }
    /**
    *
    * Metodo constructor completo
     * @param numeroPatas
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
    *
    * Metodo Para obtener el numero de patas
     * @return 
    */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
    *
    * Metodo Para obtener el numero de patas
     * 
     * @param numeroPatas
    */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
    *
    * Metodo Para correr
     * 
    */
    public void correr(){
    
        System.out.println("Estoy corriendo");
    }
    /**
    *
    * Metodo Para obtener el numero de aletas
     * 
    */
    @Override
    public void comer(){
        System.out.println("Comiendo comjda terrestre");
    
    }
/**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
     * @return 
    */
    @Override
    public String toString() {
        return super.toString()+"AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
    
    
}
