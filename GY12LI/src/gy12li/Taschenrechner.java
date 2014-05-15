/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

import java.io.Console;

/**
 *
 * @author reisma
 */
public class Taschenrechner {

    static String programmname = "Taschenrechner";
    static String autoren = "Reis";
    static double eingabe;
    static float version = 0.1f;
    static Console con = System.console();

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
     * Liest in der echten Console mit System.console eine eingabe ein. Ist
     * diese null dann mit einem JOptionPane (z.B. in NetBeans)
     *
     * @return eingelesene Zahl als double
     */
    static double zahlEinlesen() {
        if (con != null) {
            return Double.valueOf(System.console().readLine());
        } else {
            return Double.valueOf(javax.swing.JOptionPane.showInputDialog("Bitte Zahl eingeben"));
        }
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
