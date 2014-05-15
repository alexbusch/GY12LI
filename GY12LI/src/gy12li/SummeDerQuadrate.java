/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class SummeDerQuadrate {

    static int quadrat(int x) {
        return x * x;
    }

    static int summeDerQuadrate(int x, int y) {
        return quadrat(x) + quadrat(y);
    }

    public static void main(String[] args) {
        System.out.println(summeDerQuadrate(3, 4));
    }
}
