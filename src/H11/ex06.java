package H11;

import java.applet.Applet;
import java.awt.*;

public class ex06 extends Applet {

    int x_as;
    int y_as;
    int width;
    int height;

    public void init() {

        int width = 10;
        int height = 10;

    }

    public void paint(Graphics g) {

        int i = 0;
        int x_as = 50;
        int y_as = 50;

        while(i < 5) {
            g.drawArc(x_as, y_as, width, height, 0, 360);
            x_as -= 5;
            y_as -= 5;
            width += 10;
            height += 10;
            i++;
        }

    }
}
