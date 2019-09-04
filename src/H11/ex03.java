package H11;

import java.applet.Applet;
import java.awt.*;

public class ex03 extends Applet {

    int a;
    int b;
    int c;

    public void init() {
        a = 0;
        b = 1;
        c = a + b;
    }

    public void paint(Graphics g) {

        int x = 0;
        int y = 20;

        for(int i = 0; i < 10; i++) {
            g.drawString("" + c, x, y);
            a = b;
            b = c;
            c =  a + b;
            x += 30;
        }
    }
}
