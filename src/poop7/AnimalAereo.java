/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Alna
 */
public class AnimalAereo extends Animal {
    
    private int numAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }

    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    
     public void Volar(String volar){
      
      System.out.println("Vuela en: " + volar);
  }
     @Override
    public String toString() {
        return super.toString()+
                " Animal Aereo{" + "Numero de Alas=" + numAlas + '}';
        
    }
}
