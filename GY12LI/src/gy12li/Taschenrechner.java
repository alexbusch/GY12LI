/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

import java.io.Console;
import java.util.logging.ConsoleHandler;

/**
 *
 * @author reisma
 */
public class Taschenrechner {

    public static void main(String args[]) {
        Taschenrechner meiner = new Taschenrechner();
    }
    
    String programmname = "Taschenrechner";
    String autoren = "Reis";
    double eingabe;
    float version = 0.1f;

    public Taschenrechner() {
        while (eingabe != -1) {
            System.out.println(programmname + " " + version);
            System.out.println("Was wollen Sie Berechnen? \n 1)+ \n 2)- \n 3)* \n 4)\\");

            // eingabe = System.console().readLine();
            eingabe = zahlEinlesen();
            System.out.println("Sie haben :" + eingabe + " gewählt");

            if (eingabe == 1) {
                System.out.println("Sie wollen addieren, geben Sie Zahl 1 und Zahl 2 ein");
                System.out.println("Ergebnis: "
                        + addiere(zahlEinlesen(), zahlEinlesen()));
            }
        }
    }

    double zahlEinlesen() {
        //return Double.valueOf( System.console().readLine() );
        return Double.valueOf(javax.swing.JOptionPane.showInputDialog("Bitte Zahl eingeben"));
    }

    double addiere(double a, double b) {

        return a + b;
    }
}
