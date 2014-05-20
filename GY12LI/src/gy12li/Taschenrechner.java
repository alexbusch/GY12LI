/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author reisma
 */
public class Taschenrechner {

    static String programmname = "Taschenrechner";
    static String autoren = "Reis";
    static double eingabe;
    static float version = 0.1f;    

    /**
     * Start Methode, zeigt in einer Schleife eine Auswahl an
     * Berechnungsoptionen an und Berechnet diese Wird -1 eingegeben Endet das
     * Programm
     *
     * @param args
     */
    public static void main(String args[]) {

        System.out.println(programmname + " " + version);
        
        //Eine Schleife, Sie zeigt das menü immer wieder an und berechnet...
        while (eingabe != -1) {
            
            // Anzeige des Menüs 1 für Addieren, 2 für...
            System.out.println("Was wollen Sie Berechnen? \n 1)+ \n 2)- \n 3)* \n 4)\\");
            
            // Zahl einelesen, siehe Funktion zahlEinlesen()
            eingabe = zahlEinlesen();
            System.out.println("Sie haben :" + eingabe + " gewählt");

            // Es wurde eien 1 eingegeben -> wir addieren
            if (eingabe == 1) {
                System.out.println("Sie wollen addieren, geben Sie Zahl 1 und Zahl 2 ein");
                System.out.println("Ergebnis: "
                        + addiere(zahlEinlesen(), zahlEinlesen()) +"\n");
            }
        }
    }

    /**
     * Vereinfachtes Einlesen nur auf basis der Klasse Scanner
     *
     * @return eingelesene Zahl als double
     */
    static double zahlEinlesen() {
        // Einlesen mittels der Klasse Scanner
        Scanner scan = new Scanner(System.in);       
        return Double.valueOf( scan.next() );
       
    }

    /**
     * Addiert zwei Zahlen
     *
     * @param a Zahl 1
     * @param b Zahl 2
     * @return addierte Werte
     */
    static double addiere(double a, double b) {

        return a + b;
    }
}
