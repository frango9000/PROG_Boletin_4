/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_4_4;

import java.util.Scanner;

/**
 *
 * @author fsancheztemprano
 */
public class PROG_Boletin_4_4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("introduce la cantidad de patatas: ");
         float scanPat = scan.nextFloat();
        System.out.println("introduce la cantidad de pulpo: ");
         float scanPul = scan.nextFloat();
        
        Restaurante rest1 = new Restaurante(scanPat, scanPul);
        
        System.out.println("la capacidad es de : " + rest1.calcCapacidad() + " personas");
        
    
    }
}
/*
4 – Un restaurante galego, especializado en polbo con patacas, pídenos que lle deseñemos   un método 
co que se poda saber cantos clientes poden atender coa materia prima que teñen no almacen . O método recibe a cantidade 
de polbo e patacas, en kilos, e devolve o número de clientes que pode atender o restaurante .Tendo en conta que por 
cada 3 persoas , o restaurante utiliza 2 kg de polbo e 1 de patacas.
  Na clase creada anteriormente implementa, tamén, os seguintes métodos :

   public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
   public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''           
   public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
   public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       ''                  
    
*/