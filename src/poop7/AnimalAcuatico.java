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
public class AnimalAcuatico extends Animal {
    
     private int numAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    //funcion
    
  public void Nadar(String nadar){
      
      System.out.println("Nada en: " + nadar);
  }

    @Override
    public String toString() {
        return super.toString()+
                " Animal Acuatico{" + "Numero de Aletas=" + numAletas + '}';
        
    }
    
  
}
