/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gy12li.zwodgame;

/**
 *
 * @author reisma
 */
public class SimpleSizedPanel extends SizedPanel {

    public void paintComponent(java.awt.Graphics g) {
        g.fillRect(30, 50, 45, 80);
    }

    public static void main(String[] args) {
        ShowInFrame.show(new SimpleSizedPanel());
    }
}