package H11;

import java.applet.Applet;
import java.awt.*;

public class ex04 extends Applet {

    int a;

    public void init() {
        a = 0;
    }

    public void paint(Graphics g) {

        int i = 0;
        int x = 20;

        while(i < 10) {
            a += 3;
            g.drawString("" + a, x, 20);
            i++;
            x += 20;
        }
    }
}
