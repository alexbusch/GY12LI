/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li.zwodgame;

/**
 *
 * @author reisma
 */
public class SimpleOval extends GeometricObject {

    public SimpleOval(double w, double h, Vertex pos) {
        super(w, h, pos);
        //alternative:
        //setWidth(w);
        //setHeight(h);
        //setPos(pos);        
    }

    public SimpleOval(double w, double h, double x, double y) {
        super(w, h, new Vertex(x, y));
    }

    @Override
    public double area() {
        return Math.PI * getWidth() * getHeight() / 4;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "SimpleOval(" + super.toString() + ")";
    }

    @Override
    public boolean equals(Object that) {
        return (that instanceof SimpleOval) && super.equals(that);
    }
}
