
package Verein;

public class Basketballer extends Mitglieder implements NewInterface{
    private int minSize;

    public Basketballer(String name, String anschrift, int minSize) {
        super(name, anschrift);
        this.minSize = minSize;
    }
    
    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    @Override
    public String getBesonderheit(){
        
       return  String.valueOf(getMinSize());    }
    
}
