package name.panitz.ludens.animationGame;

/**
 * Klasse Vertex zur Abbildung zweier Punkte im Koordinatensystem (X,y -
 *
 * @author reisma
 */
public class Vertex {

    /**
     * Ausführbare Methode - kleine Tests
     *
     * @param args
     */
    public static void main(String args[]) {
        Vertex v1 = new Vertex(2, 4);

        System.out.println(v1);
        System.out.println(v1.length());
    }

    double x;
    double y;

    /**
     * Konstruktor, erwartet die x und y Koordinaten
     *
     * @param x
     * @param yy
     */
    public Vertex(double x, double yy) {
        this.x = x;
        y = yy;
    }

    /**
     * Stellt den Vertex durch die x und y koordinaten als Text dar
     *
     * @return
     */
    @Override
    public String toString() {
        double z = 5.0;
        return "X,Y:" + (x + y) + z;

    }

    /**
     * Berechnet die Länge vom Ursprung zum koordinaten System
     *
     * @return
     */
    public double length() {
        double s = Math.sqrt(x * x + y * y);
        return s;
    }

    /**
     * Liefert einen Vertex mit s Multipliziert zurück
     *
     * @param s
     * @return
     */
    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }

    /**
     * Modifiziert die x,y Werte um den Faktor s
     *
     * @param s
     */
    public void skalarMultMod(double s) {
        x = x * s;
        y = y * s;
    }

    /**
     * Addiert x,y von v2 auf x und liefert einen neuen Vertex
     *
     * @param v2
     * @return
     */
    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);
    }

    /**
     * Addiert x,y auf diesen Vertex
     *
     * @param v2
     */
    public void addMod(Vertex v2) {
        x = x + v2.x;
        y = y + v2.y;
    }

    /**
     * Setzt den X Wert
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Setzt den Y Wert
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Gibt den x wert zurück
     *
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * Gibt den Y Wert zurück
     *
     * @return
     */
    public double getY() {
        return y;
    }

    /**
     * Gleichheit zweier Vertex als x = x und y=y definiert.
     *
     * @param o Vertex zum vergleich
     * @return true wenn o vertex und x==x && y==y
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Vertex) {
            Vertex einVertex = (Vertex) o;
            return einVertex.getX() == getX()
                    && einVertex.getY() == getY();
        }
        return false;
    }
}
