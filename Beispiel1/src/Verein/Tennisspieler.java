/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Verein;

/**
 *
 * @author reisma
 */
public class Tennisspieler extends Mitglieder implements NewInterface{

    private String schlaeger;
    
    public Tennisspieler(String name, String anschrift, String schlaeger) {
        super(name, anschrift);
        setSchlaeger(schlaeger);
    }

    /**
     * @return the schlaeger
     */
    public String getSchlaeger() {
        return schlaeger;
    }

    /**
     * @param schlaeger the schlaeger to set
     */
    public void setSchlaeger(String schlaeger) {
        this.schlaeger = schlaeger;
    }
    
    public String getBesonderheit(){
        boolean hasSchlaeger = false;
        
        return getSchlaeger() +" "+ hasSchlaeger; 
    }
}
