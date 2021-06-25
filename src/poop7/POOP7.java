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
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente ger=new Gerente();
        ger.setNombre("Saul Juarez");
        ger.setNumEmpleado(9638);
        ger.setSueldo(16000);
        
        System.out.println(ger);
        System.out.println(ger.getNombre());
        System.out.println(ger.getNumEmpleado());
        System.out.println(ger.getSueldo());
        ger.aumentarSueldo(10);
        System.out.println(ger.getSueldo());
        ger.asignarPresupuesto(100000);
        System.out.println(ger.getPresupuesto());
        
        
        System.out.println("###############EJ2###############");
        if(ger instanceof Gerente){
            System.out.println("Instancia de Gerente");
        }
        //Composición IS - A(es - un)
       if(ger instanceof Empleado){
           
           System.out.println("Instancia de Empleado");
       }
       if(ger instanceof Object){
           
           System.out.println("Instancia de object");
       }
       System.out.println("###############EJ3###############");
       Gerente ger2 = new Gerente(500000,"Paula Azul",1243,20000);
        System.out.println(ger2);
       
        System.out.println("############### - EJECICIO EXTRA - ###############");
        //Ballena 
        Ballena animal1= new Ballena(500,4,"Willy","Australia","Gris"); 
        System.out.println(animal1);
        animal1.Sonido("agudo");
        animal1.Comer("Pescados");
        animal1.Nadar("El mar");
        animal1.pelearConPinocho("Pinocho");
        //Perro
        Perro animal2= new Perro("Verde",4,"Simon","Ruso","Blanco"); 
        System.out.println(animal2);
        animal2.Sonido("Grave");
        animal2.Comer("Croquetas");
        animal2.Correr("En el parque");
        animal2.hacerTrucos("Trucos");
        //Pajaro
        Pajaro animal3= new Pajaro("Grande",2,"Fores","Belgica","Verde"); 
        System.out.println(animal3);
        animal3.Sonido("Muy suave");
        animal3.Comer("Alpiste");
        animal3.Volar("Los montes");
        animal3.recolectarRamas("Recolectar Ramas");
    }
    //Animal{nombre: willy, lugar de origen: asutralia, de color: negro,sonido: agudo,come: peces  ]
    // AnimalAcuatico{numero de aletas: 2, nada: en el mar , come: peces
    // Ballena{tiene un largo de: 32, pelea con pinocho} 
    
}
