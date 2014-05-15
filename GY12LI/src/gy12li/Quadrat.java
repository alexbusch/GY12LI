/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class Quadrat {

    public static void main(String[] args) {
        System.out.println(quadrat(5));
        System.out.println(quadrat(10));
        System.out.println(quadrat(0));
        System.out.println(quadrat(-12));
    }

    // Funktion
    static int quadrat(int x) {
        return x * x;
    }
}
