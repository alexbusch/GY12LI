/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li;

import java.util.ArrayList;

/**
 *
 * @author reisma
 */
public class ForNWhile {
    
    public static void main (String args[]){
        halloforeach();
        /* hallomitwhile( 100);
        hallomitfor( 100);
        
        hallomitwhiledo(0);
        hallomitfor(0); */
    }
    
    static void hallomitwhile(int eisessengehen){
        int grillen = 0;
             
        while(grillen<eisessengehen){
            System.out.println("WHILE: Hallo World  times: " + grillen);
            grillen++;
        }
    }
    static void hallomitfor(int x){
        for(int a = 0; a<x; a++){
            System.out.println("FOR: Hallo Wolrd times: " + a);
        }
    }
    static void hallomitwhiledo(int x){
        int y = 0;
        do{
            System.out.println("WHILE DO: Hallo Wolrd  times: " + y);
            y++;
        }while(y<x);
    }
    
    static void halloforeach(){
        ArrayList<String> myList = new ArrayList();
        myList.add("Eins");
        myList.add("zwei");
        
        for(String x : myList){
            System.out.println("Ich sag mal: "+x);
        }
        
        for(int x = 0; x < myList.size(); x++){
            System.out.println("Ich sag mal: "+ myList.get(x) );
        }
    }
    
}
