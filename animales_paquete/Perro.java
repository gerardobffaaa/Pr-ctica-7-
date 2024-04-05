/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class Perro extends AnimalTerrestre{
    
    
    private String colorCollar;
    /**
    *
    * Metodo constructor vacío
    */
    public Perro() {
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    /**
    *
    * Metodo Para obtener el color del collar
     * @return 
    */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
    *
    * Metodo para establecer el color de collar
     * @param colorCollar
    */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
    *
    * Metodo para hacer tucos
    * @void
    */
   public void hacerTrucos(){
   
       System.out.println("Estoy haciendo trucos");
   
   }
   /**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    * @return 
    */
    @Override
    public String toString() {
        return super.toString() +"Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
   
}
