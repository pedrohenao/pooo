/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia2;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal s1 = new Animal("perro","terrestre","masculino");
        
        Animal s2 = new Animal("oso","terrestre","masculino");
        
        Animal s3 = new Animal("Ballena","Acuatico","masculino");
        
        Animal s4 = new Animal("Tiburon","Acuatico","masculino");
        
        Animal s5 = new Animal("Paloma","Aereos","masculino");
        
        Animal s6 = new Animal("Buitre","Aereos","masculino");
      
        System.out.println(s1.getNombre()+"Es un animal tipo "+s2.getTipo());
        
        
        
        
        
    }
    
}
