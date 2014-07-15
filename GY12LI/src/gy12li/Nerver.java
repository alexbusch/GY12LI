/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class Nerver {
    
    static String nerver(int x){
        System.out.println("Hi " + x);
        nerver(x+1);
        //System.out.println( x>=1 ? nerver(x-1) : "Fertig");
        return"";
    }
    public static void main (String args[]){
        nerver(100);
    }
    
}
