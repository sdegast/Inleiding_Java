package H12;

import java.applet.Applet;
import java.awt.*;

public class ex01 extends Applet {

    private int[] getallen;

    public void init() {
        getallen = new int[10];

        for(int teller = 0; teller < getallen.length; teller++) {
            getallen[teller] = (teller + 1);
        }
    }

    public void paint(Graphics g) {

        for(int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 50, 20 * teller + 20);
        }
    }
}
