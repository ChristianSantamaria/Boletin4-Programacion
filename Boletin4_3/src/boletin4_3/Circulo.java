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
public class Circulo {
    
    private double radio;
    private double Pi = 3.14;
    
    public Circulo(){
        radio = 0;
    }
    
    public Circulo(double r){
        radio = r;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double r){
        radio = r;
    }
    
    public double calcularArea(){
        return Math.pow(radio,2) * Pi;
    }
    
    public double calcularLongitude(){
        return radio * 2;
    }
    
}
