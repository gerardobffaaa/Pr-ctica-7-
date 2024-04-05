/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;
import animales_paquete.Animal;
import animales_paquete. AnimalAcuatico;
import animales_paquete.Pajaro;
import animales_paquete.Perro;
/**
 *
 * @author poo01alu07
 */
public class Poop7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal= new Animal("Jaguar","Selva de brazil", "Naranja");
        animal.sonido("Rawwwr");
        System.out.println(animal);
      
        AnimalAcuatico animalA= new AnimalAcuatico(4,"Ballena","Mar","Gris");
        System.out.println(animalA);
        
        Pajaro pajaro1 = new Pajaro("Punta", 2, "Ruisenor", "Canada", "Verde");
        System.out.println(pajaro1);
        pajaro1.comer();
        
        Perro perro1 = new Perro("Rojo", 4, "Firulais","Mexico", "Negro");
        System.out.println(perro1);
        perro1.hacerTrucos();
        
    }
}
