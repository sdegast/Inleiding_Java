package H11;

import java.applet.Applet;
import java.awt.*;

public class ex02 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int teller = 20;
        int x_as = 10;

        while(teller != 10) {
            x_as += 20;
            g.drawString("" + teller, x_as, 20);
            teller--;
        }
    }
}
