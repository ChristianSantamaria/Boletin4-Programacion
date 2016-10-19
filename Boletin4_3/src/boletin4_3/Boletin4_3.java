/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo c = new Circulo();
        c.setRadio(40);
        System.out.println("El area del circulo es "+ c.calcularArea());
        System.out.println("La longitud del circulo es "+ c.calcularLongitude());
    }
    
}
