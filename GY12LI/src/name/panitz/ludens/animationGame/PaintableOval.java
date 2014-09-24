/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import java.awt.Graphics;

/**
 *
 * @author reisma
 */
public class PaintableOval extends SimpleOval implements Paintable{

    public PaintableOval(double w, double h, Vertex pos) {
        super(w, h, pos);
    }

    @Override
    public void paintTo(Graphics g) {
       g.setColor(getColor());
       g.fillOval( (int)getPos().getX(),
                   (int) getPos().getY(),
                   (int) getWidth(),
                   (int) getHeight() );
    }
    
}
