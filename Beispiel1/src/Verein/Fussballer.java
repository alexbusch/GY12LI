/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Verein;

public class Fussballer extends Mitglieder implements NewInterface
{
    boolean hasSchuhe;

    public Fussballer(String x, String y, boolean hasSchuhe) {
        super(x,y);
        this.hasSchuhe = hasSchuhe;
    }

    @Override
    public String getBesonderheit() {
        return "" + hasSchuhe;
    }
    
}
