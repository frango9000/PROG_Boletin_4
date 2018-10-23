/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_4_1;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coche coche1 = new Coche();
       System.out.println(coche1.getVelocidade());
       coche1.acelerar(10);
       
       System.out.println(coche1.getVelocidade());
    }
}
