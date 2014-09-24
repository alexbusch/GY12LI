/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import spiele.ShowInFrame;

/**
 *
 * @author reisma
 */
public class GeometricImage extends GeometricObject implements Paintable{
    
    private ImageIcon icon;
    
    public GeometricImage(String fileName, double x, double y){
        super(new Vertex(x,y) );
        
        setIcon( new ImageIcon(getClass().getClassLoader().getResource(fileName)) );
        
        init();
    }
    
    public GeometricImage(ImageIcon icon, double x, double y){
        super(new Vertex(x, y));
        
        setIcon(icon);
        
        init();
    }
    
    void init(){
        setWidth( getIcon().getImage().getWidth(getIcon().getImageObserver()));
        setHeight( getIcon().getImage().getHeight(getIcon().getImageObserver()));
    }

    @Override
    public void paintTo(Graphics g) {
        getIcon().paintIcon(null, g, 
                    (int)getPos().getX(),
                    (int)getPos().getY() );
    }
    
    public static void main( String[] args){
        GeometricImage gi = new GeometricImage("TWAK.jpg", 10, 10);
        System.out.println(gi.getWidth());
        System.out.println(gi.getHeight());
        ShowInFrame.show( new PaintablePanel(gi) );
        
    }

    /**
     * @return the icon
     */
    public ImageIcon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
}
