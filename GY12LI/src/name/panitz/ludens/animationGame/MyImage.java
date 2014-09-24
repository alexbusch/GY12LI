/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name.panitz.ludens.animationGame;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author reisma
 */
public class MyImage {
    
    private String name;
    private Image img = null;
    
    public MyImage(String uriname){
        setName(uriname);
        
    } 
   

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the img
     */
    public Image getImg() {
        
        if( img == null ){
            img = Toolkit.getDefaultToolkit().createImage(
                    getClass().getClassLoader().getResource(name) );
        }
        
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(Image img) {
        this.img = img;
    }
}
