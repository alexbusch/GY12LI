/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class Signum2 {

    static int signum(int i) {
        return (i > 0) ? 1 : ((i < 0) ? -1 : 0);
    }

    public static void main(String[] args) {
        System.out.println("signum(42) = " + signum(42));
        System.out.println("signum(-42) = " + signum(-42));
    }
}
