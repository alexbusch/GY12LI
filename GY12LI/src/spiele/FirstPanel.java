/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spiele;


import java.awt.Color;
import javax.swing.*;
public class FirstPanel extends JPanel{

    @Override 
    public void paintComponent(java.awt.Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(25,25,50,80);
        g.drawOval(105, 200, 205, 300);
        g.fillOval(105, 200, 205, 300);
    }
    
    public static void main(String[]args){
        JFrame f=new JFrame();
        f.add(new FirstPanel());
        f.setVisible(true);}
    }
