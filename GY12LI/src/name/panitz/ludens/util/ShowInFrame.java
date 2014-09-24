/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name.panitz.ludens.util;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author reisma
 */
public class ShowInFrame {

    public static void show(String title, JComponent c) {
        JFrame f = new JFrame(title);
        f.add(c);
        f.pack();
        f.setVisible(true);
    }
    public static void show(JComponent c){
        show("", c );
    }
}
