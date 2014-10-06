/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beispiel1;

/**
 *
 * @author reisma
 */
public class Auto extends Fahrzeug implements iNutzen{
    
    double verbrauch;
    
    public Auto(double preis, double verbrauch){
        super(preis);
        this.verbrauch = verbrauch;
    }

    @Override
    public double verbrauch(int fahrenKm) {
      return fahrenKm/100 * verbrauch;  
    }
    
}
