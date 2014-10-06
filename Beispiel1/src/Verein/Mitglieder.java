package Verein;

import java.util.ArrayList;

public class Mitglieder implements NewInterface{
    private String name;
    private String anschrift;
    public String pname;

    public Mitglieder(String name, String anschrift) {
        setName(name);
        this.anschrift = anschrift;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public String getAnschrift() {
        return anschrift;
    }
    
    

    
    
    
    public static void main(String args[]){
       
        Mitglieder m = new Mitglieder("Peter", "Paulinstr.");      
        
        Basketballer b1 = new Basketballer("Hans", "Beutelweg", 210);
        Tennisspieler t1 = new Tennisspieler("Werner", "Beutelweg", "X-TRA");
        Fussballer f1 = new Fussballer("August", "Thyrsusstrasse ", false);
        
        ArrayList<Mitglieder> alle = new ArrayList<>();
        alle.add(m);
        alle.add(b1);
        alle.add(t1);
        alle.add(f1);        
        
        for( Mitglieder jemand : alle ){
            System.out.println(jemand.getBesonderheit() );
        }
        
               
        
    }

    @Override
    public String getBesonderheit() {
       return "keine Besonderheit";
    }
    
}
