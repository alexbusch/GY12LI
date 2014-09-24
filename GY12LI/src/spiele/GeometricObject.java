package spiele;

import java.awt.Color;

/**
* GeometricObject nach "Java will nur Spielen" von Panis Ludens
* @author reisma
*/
public class GeometricObject {
// Datenfelder zur Speicherung der Position, Breite und Höhe
private Vertex pos;
private double width;
private double height;
private Color color;
/**
* Konstruktor mit Angabe der Breite, Höhe und der Position als Vertex
* @param w
* @param h
* @param poss
*/
public GeometricObject(double w, double h, Vertex poss, Color color) {
setPos(poss);
setWidth(w);
setHeight(h);
setColor(color);
}
/**
* Konstruktor mit Angabe der Breite, Höhe und der Position als Vertex
* @param w
* @param h
* @param poss
*/
public GeometricObject(double w, double h, Vertex poss ) {
setPos(poss);
setWidth(w);
setHeight(h);
}
/**
* Konstruktor mit angabe der Breite und Höhe - Vertex als Position wird mit 0,0 erzeugt
* @param w
* @param h
*/
public GeometricObject(double w, double h) {
this(w, h, new Vertex(0, 0));
}
/**
* Konstruktor der die Breite als Höhe nutzt und einen Vertex mit 00 erstellt
* @param w
*/
public GeometricObject(double w) {
this(w, w);
}
/**
* Konstruktor Setze Rechteck mit Breite/Höhe 10 und Position 0,0
*/
public GeometricObject() {
this(10);
}
/***
* Konstruktor erzeugt Breite/Höhe 0 und Position 0,0
* @param pos
*/
public GeometricObject(Vertex pos) {
this(0, 0, pos);
}
/**
* Ausgabe der Objekt Daten Breite, Höhe und Position
* @return
*/
@Override
public String toString() {
return "width=" + getWidth()+ ", height=" + getHeight() + ", pos=" + getPos();
}
public double circumference() {
return 2 * (getWidth() + getHeight());
}
public double area() {
return getWidth() * getHeight();
}
public boolean contains(Vertex v) {
return v.x >= getPos().x && v.x <= getPos().x + getWidth() //x is within
&& v.y >= getPos().y && v.y <= getPos().y + getHeight(); //y is within
}
public boolean isLargerThan(GeometricObject that) {
return this.area() > that.area();
}
public void moveTo(Vertex pos) {
    this.setPos(pos);
}
public void moveTo(double x, double y) {
moveTo(new Vertex(x, y));
}
public void move(Vertex v) {
moveTo( getPos().add(v));
}
@Override
public boolean equals(Object thatObject) {
if (thatObject instanceof GeometricObject) {
GeometricObject that = (GeometricObject) thatObject;
return      that.getWidth() == this.getWidth()
&&          this.getHeight() == that.getHeight()
&&          this.getPos().equals(that.getPos());
}
return false;
}
public boolean isTouching(GeometricObject geoObj){
throw new UnsupportedOperationException();
}
/**
* @return the pos
*/
public Vertex getPos() {
return pos;
}
/**
* @param pos the pos to set
*/
public void setPos(Vertex pos) {
this.pos = pos;
}
/**
* @return the width
*/
public double getWidth() {
return width;
}
/**
* @param width the width to set
*/
public void setWidth(double width) {
this.width = width;
if (width < 0) {
width = -width;
pos.x =     getPos().x - width;
}
}
/**
* @return the height
*/
public double getHeight() {
return height;
}
/**
* @param height the height to set
*/
public void setHeight(double height) {
this.height = height;
if (height < 0) {
height = -height;
pos.y =     getPos().y - height;
}
}

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
