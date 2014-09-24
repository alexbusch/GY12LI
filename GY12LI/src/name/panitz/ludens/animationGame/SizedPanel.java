/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name.panitz.ludens.animationGame;

import gy12li.zwodgame.ShowInFrame;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author reisma
 */
public class SizedPanel extends JPanel {

    private int preferedWidth = 400;
    private int preferredHeight = 300;

    public SizedPanel(int w, int h) {
        setPreferredHeight(h);
        setPreferedWidth(w);
    }

    public SizedPanel() {
    }

    public Dimension getPreferredSize() {
        return new Dimension(getPreferedWidth(),
                getPreferredHeight());
    }

    public static void main(String args[]) {
        ShowInFrame.show(new SizedPanel());
    }

    /**
     * @return the preferedWidth
     */
    public int getPreferedWidth() {
        return preferedWidth;
    }

    /**
     * @param preferedWidth the preferedWidth to set
     */
    public void setPreferedWidth(int preferedWidth) {
        this.preferedWidth = preferedWidth;
    }

    /**
     * @return the preferredHeight
     */
    public int getPreferredHeight() {
        return preferredHeight;
    }

    /**
     * @param preferredHeight the preferredHeight to set
     */
    public void setPreferredHeight(int preferredHeight) {
        this.preferredHeight = preferredHeight;
    }
}
