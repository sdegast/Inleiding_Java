package H11;

import java.applet.Applet;
import java.awt.*;

public class ex08 extends Applet {

    int i;
    int width;
    int height;

    public void init() {

        i = 0;
        width = 20;
        height = 20;
    }

    public void paint(Graphics g) {

        while(i < 100) {
            g.drawArc(20, 20, width, height, 0, 360);
            width += 10;
            height += 10;
            i++;
        }
    }
}
