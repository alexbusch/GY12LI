/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.panitz.ludens.animationGame;

import java.awt.Graphics;
import javax.swing.JPanel;
import name.panitz.ludens.util.ShowInFrame;
import sun.security.tools.KeyStoreUtil;

/**
 *
 * @author reisma
 */
public class PaintableImage extends JPanel implements Paintable {

    private MyImage mi;

    public PaintableImage(MyImage mi) {
        setMi(mi);
    }

    public PaintableImage(String name) {
        setMi(new MyImage((name)));
    }   

    @Override
    public void paintTo(Graphics g) {
        g.drawImage(getMi().getImg(), 0, 0, this);
    }
    
    public static void main (String [] args){
        PaintableImage pi = new PaintableImage("TWAK.jpg");
        
        System.out.println( "Pic is in: " 
                + pi.getMi().getImg().getHeight(pi)
                +" X "
                +pi.getMi().getImg().getWidth(pi) );
        ShowInFrame.show(new PaintablePanel(pi));
    }
    /**
     * @return the mi
     */
    public MyImage getMi() {
        return mi;
    }

    /**
     * @param mi the mi to set
     */
    public void setMi(MyImage mi) {
        this.mi = mi;
    }

}
