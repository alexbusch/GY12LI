/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li.zwodgame;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author reisma
 */
public class FirstPanel extends JPanel {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
    @Override
    public void paintComponent(java.awt.Graphics g) {       
        g.drawImage(getImage(),
                    1, 1,
                   null);
        g.setColor(Color.RED);
       
        SimpleOval mySO1 = new SimpleOval(50,150, new Vertex(100,100));
        GeometricObject myGeo1 = new GeometricObject(50,100, new Vertex(100,100),Color.GREEN);       
        
        ArrayList<GeometricObject> myList = new ArrayList();
        myList.add(mySO1);
        myList.add(myGeo1);
        
        
        for( GeometricObject go : myList){
            g.setColor(go.getColor());
            go.paint(g);
        }
        
        g.drawPolygon( new StarPolygon(200,200, 10, 100,5));
        
        
       
        
    }

    
    
    BufferedImage getImage(){
        BufferedImage img = null;
        try {
            img = ImageIO.read(
                    FirstPanel.class.getClassLoader().
                    getResourceAsStream("gy12li/zwodgame/weltraum.png"));
        } catch (IOException e) {
            System.out.println("Ups: "+e);
        }
        return img;
    }
}
