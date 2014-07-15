/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.Scanner;

/**
 *
 * @author reisma
 */
public class Sichtbarkeit2 {
    
    static Scanner input = new Scanner(System.in);     
    
    public static void main (String args[]){    
       System.out.println("Ergebins von a + b: " +addiere()  );
    }
    
    static double addiere(){
        double berechnung = (input.nextDouble() + input.nextDouble() );
        return berechnung;
    }
}
