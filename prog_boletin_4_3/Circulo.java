/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_4_3;

/**
 *
 * @author fsancheztemprano
 */
public class Circulo {
    
    private double radio;
    final double PI = 3.14;
    
    public Circulo(){
        radio = 0;
    }
    public Circulo(double r){
        radio =  r;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double r){
        radio = r;
    }
    public double calcularArea(){
        return (Math.pow(radio, 2) * PI);
    }

    public double calcLongitud(){
        return (2 * radio * PI);
    }
}
