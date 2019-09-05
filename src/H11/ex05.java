package H11;

import java.applet.Applet;
import java.awt.*;

public class ex05 extends Applet {

    int x_as;
    int y_as;

    public void init() {

        int x_as = 20;
        int y_as = 20;

    }

    public void paint(Graphics g) {

        int i = 0;

        while(i < 5) {
            g.drawRect(x_as, y_as, 20, 20);
            x_as += 20;
            y_as += 20;
            i++;
        }
    }
}
