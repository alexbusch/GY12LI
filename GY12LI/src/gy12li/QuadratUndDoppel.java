/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class QuadratUndDoppel {

    static int quadrat(int x) {
        return x * x;
    }

    static int doppelt(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println(doppelt(quadrat(5)));
    }
}
