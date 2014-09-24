/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import gy12li.zwodgame.GeometricObject;
import gy12li.zwodgame.Vertex;
import java.awt.Graphics;

/**
 *
 * @author reisma
 */
public class SimplePaintableRectangle extends GeometricObject implements Paintable{
    
     public SimplePaintableRectangle(double w, double h, Vertex pos) {
        super(w, h, pos);
    }

    @Override
    public void paintTo(Graphics g) {
       g.setColor(getColor());
       g.drawRect( (int)getPos().getX(),
                   (int) getPos().getY(),
                   (int) getWidth(),
                   (int) getHeight() );
    }
    
    
}
