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
public class Pajaro extends AnimalAereo{
    
    private String tipodePico;

    public Pajaro() {
    }

    public Pajaro(String tipodePico, int numAlas, String nombre, String lugarOrigen, String color) {
        super(numAlas, nombre, lugarOrigen, color);
        this.tipodePico = tipodePico;
    }

    public String getTipodePico() {
        return tipodePico;
    }

    public void setTipodePico(String tipodePico) {
        this.tipodePico = tipodePico;
    }
    
    public void recolectarRamas(String ramas){
        System.out.println("El pajaro sabe: " + ramas);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Pajaro{" + "tipodePico=" + tipodePico + '}';
    }

    

   
}
