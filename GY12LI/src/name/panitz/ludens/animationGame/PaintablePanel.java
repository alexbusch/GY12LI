/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import name.panitz.ludens.util.ShowInFrame;

/**
 *
 * @author reisma
 */
public class PaintablePanel extends SizedPanel{
    
    private Paintable pa;
    
    public PaintablePanel(Paintable pa){
        setPa(pa);
    }
    
    public void paintComponent (java.awt.Graphics g){
        getPa().paintTo(g);
    }
    
    public static void main(String[] args){
        ShowInFrame.show(new PaintablePanel( new PaintableOval(100, 50, new Vertex(30,50) ) ) );
        ShowInFrame.show(new PaintablePanel( new PaintableOval(10, 10, new Vertex(130,40) ) ) );
    }

    /**
     * @return the pa
     */
    public Paintable getPa() {
        return pa;
    }

    /**
     * @param pa the pa to set
     */
    public void setPa(Paintable pa) {
        this.pa = pa;
    }
    
}
