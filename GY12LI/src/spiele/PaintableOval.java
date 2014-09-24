/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spiele;

import java.awt.Graphics;

/**
 *
 * @author Schüler
 */
public class PaintableOval extends SimpleOval implements Paintable{

    public PaintableOval(double w, double h, double x, double y) {
        super(w, h, x, y);
    }
    @Override
    public void paintTo(Graphics g) {
        g.fillOval( new Double( getPos().getX() ).intValue(),
                    new Double( getPos().getY()).intValue(),
                    new Double( getWidth ()).intValue(),
                    new Double( getHeight()).intValue());
    }
    
}
