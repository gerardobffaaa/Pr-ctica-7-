package animales_paquete;

/**
 *
 * @author poo01alu07
 */
public class AnimalAcuatico extends Animal{
    
    private int numeroAletas;
    /**
    *
    * Metodo constructor vacío
    */
    public AnimalAcuatico() {
    }
    /**
    *
    * Metodo constructor completo
     * @param numeroAletas
     * @param nombre
     * @param lugarOrigen
     * @param color
    */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
    *
    * Metodo Para obtener el numero de aletas
     * @return 
    */
    public int getNumeroAletas() {
        return numeroAletas;
    }

   /**
    *
    * Metodo Para establecer el numero de aletas
     *
     * @param numeroAletas
    */

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    /**
    *
    * Metodo Para nadar
     * 
    */
    public void nadar(){
    
        System.out.println("Estoy nadando");
    
    }
    /**
    *
    * Sobre escritura del metodo comer
    */
    @Override
    public void comer(){
        System.out.println("Comiendo comida marina");
    }
    
    /**
    *
    * Sobre escritura del metodo toString para imprimir los datos completos
    * @return 
    */
    @Override
    public String toString() {
        return super.toString()+"AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
}
