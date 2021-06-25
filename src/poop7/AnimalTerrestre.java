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
public class AnimalTerrestre extends Animal {
    
    private int numPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    public void Correr(String correr){
      
      System.out.println("Corre en: " + correr);
  }
    
    @Override
    public String toString() {
        return super.toString()+
                " Animal Terrestre{" + "Numero de patas=" + numPatas + '}';
        
    }
}
