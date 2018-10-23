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
public class PROG_Boletin_4_3 {
    
    
        public static void main(String[] args) {
            
            Circulo circ1 = new Circulo();
            Circulo circ2 = new Circulo(5);
            System.out.println("longitud de circulo2: " + circ2.calcLongitud());
            System.out.println("area de circulo2: " + circ2.calcularArea());
            
        }
}
