/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li.zwodgame;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author reisma
 */
public class FirstPanel extends JPanel {

    @Override
    public void paintComponent(java.awt.Graphics g) {

        g.fillRect(30, 50, 45, 80);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);
    }
}
