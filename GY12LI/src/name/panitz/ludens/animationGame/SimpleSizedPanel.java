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
public class SimpleSizedPanel extends SizedPanel{

    public void paintComponent(java.awt.Graphics g){
        g.fillRect(30,50,45,80);
    }
    
    public static void main (String [] args){
        ShowInFrame.show(new SimpleSizedPanel() );
    }
    
    
}
