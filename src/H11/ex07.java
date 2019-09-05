package H11;

import java.applet.Applet;
import java.awt.*;

public class ex07 extends Applet {

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
        int x_as = 300;
        int y_as = 300;

        while(i < 50) {
            g.drawArc(x_as, y_as, width, height, 0, 360);
            x_as -= 5;
            y_as -= 5;
            width += 10;
            height += 10;
            i++;
        }
    }
}