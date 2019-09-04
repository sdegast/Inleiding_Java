package H11;

import java.applet.Applet;
import java.awt.*;

public class ex01 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x_as = 0;

        while(teller < 10) {
            x_as += 20;
            g.drawLine(x_as, 10, x_as, 100);
            g.drawString("" + teller, x_as, 200);
            teller++;
        }


    }
}
