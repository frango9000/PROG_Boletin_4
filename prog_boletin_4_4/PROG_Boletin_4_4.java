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
