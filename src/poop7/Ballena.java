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
public class Ballena extends AnimalAcuatico{
    
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, String color) {
        super(numAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    //funcion
    public void pelearConPinocho(String pelear){
        System.out.println("Pelea con " + pelear);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Ballena{" + "largo=" + largo + '}';
    }
    
}
