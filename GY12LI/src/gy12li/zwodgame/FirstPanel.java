/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li.zwodgame;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author reisma
 */
public class FirstPanel extends JPanel {

    @Override
    public void paintComponent(java.awt.Graphics g) {       
        g.drawImage(getImage(),
                    1, 1,
                   null);
        g.setColor(Color.YELLOW);
        g.fillRect(35, 55, 50, 85);
        g.setColor(Color.RED);        
        g.fillRect(30, 50, 45, 80);
        
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
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
