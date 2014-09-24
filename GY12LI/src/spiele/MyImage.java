/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spiele;

import java.awt.Image;
import java.awt.Toolkit;

public class MyImage {
    
    private String name;
    private Image img=null;
    
    public MyImage(String Name) {this.name=name;}
    
    public Image get(){
        if (img==null)
            img = Toolkit.getDefaultToolkit().createImage
                    (getClass().getClassLoader().getResource(name));
        return img;
    }
}