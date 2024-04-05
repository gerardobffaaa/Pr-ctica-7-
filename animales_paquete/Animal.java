/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class Animal extends Object {// no hay cambio por que la extencion a objectss ocurre siempre
    
    private String nombre;
    private String lugarOrigen;
    private String color;
    /**
    *
    * Metodo constructor vacío
    */
    public Animal() {
    }
    /**
    *
    * Metodo constructor completo
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
    *
    * Metodo Para obtener el nombre
     * @return 
    */
    public String getNombre() {
        return nombre;
    }
    /**
    *
    * Metodo Para obtener el lugar de origen
     * @return 
    */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
    *
    * Metodo Para obtener el color
     * @return 
    */
    public String getColor() {
        return color;
    }
    /**
    *
    * Metodo Para establecer el nombre
     * 
     * @param nombre
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    *
    * Metodo Para establecer el lugar de origen
     * 
     * @param lugarOrigen
    */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
    *
    * Metodo Para establecer el color
     * 
     * @param color
    */
    public void setColor(String color) {
        this.color = color;
    }
       /**
    *
    * Metodo Para hacer sonido 
     * @param sonido
    */
    public void sonido(String sonido){
        System.out.println(sonido);
    }
    /**
    *
    * Metodo Para comer 
    */
    public void comer(){
    
        System.out.println("Estoy comiendo");
        
    }
/**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    * @return 
    */
    @Override
    public String toString() {
        return super.toString()+" Animal{" + "nombre=" + nombre + ","
        + " lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
  
}
