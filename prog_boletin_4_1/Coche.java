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
public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

//Engade a clase Coche os seguintes métodos :
    public int getVelocidade() {// . Este método devolve a velocidade actual
        return velocidade;
    }

    public void acelerar(int valor) {// .Este método incrementa a velocidade na cantidade valor
        velocidade += valor;
    }

    public void frenar(int menos) {//.Este método diminue a velocidade na cantidade menos.
        velocidade -= menos;
    }
}
