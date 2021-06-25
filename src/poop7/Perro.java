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
public class Perro extends AnimalTerrestre{
    
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, int numPatas, String nombre, String lugarOrigen, String color) {
        super(numPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    //funcion
    public void hacerTrucos(String trucos){
        System.out.println("El perro sabe hacer: " + trucos);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
    
}
