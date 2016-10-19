/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author csantamariacameselle
 */
public class Restaurante {
    private int pulpokg;
    private int patataskg;
    private int clientes;
    
    public Restaurante(){
       pulpokg = 0;
       patataskg = 0;
       clientes = 0;
    }
    
    // 3 personas --------------- 1 kg
    // 1 persona ---------------- x
    
    
    public Restaurante(int pulpo, int patatas, int cli){
       pulpokg = pulpo;
       patataskg = patatas;
       clientes = cli;
    }
    
    public void engadirPolbo(int x){
        pulpokg += x;
    }
    
    public void engadirPatacas(int x){
        patataskg += x;
    }
    
    public void amosarPolbo(){
        System.out.println("Tenemos "+ pulpokg + " cantidade de polbo en el almacen");
    }
    
    public void amosarPatacas(){
        System.out.println("Tenemos "+ patataskg + " cantidade de patatas en el almacen");
    }
    
    
}
