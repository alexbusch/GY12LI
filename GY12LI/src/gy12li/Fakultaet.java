/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

/**
 *
 * @author reisma
 */
public class Fakultaet {
    
    public static void main (String args[])
    {
        System.out.println("Fakulät von 15:" + faku(15) );
    }
    
    static int faku(int x){
       return x==0 ? 1 : x*faku(x-1);
    }
    
}
