package H04;

import java.awt.*;
import java.applet.*;

public class ex06 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100, 100, 50, 140);

        g.setColor(Color.red);
        g.fillArc(105, 105, 40, 40, 0, 360);

        g.setColor(Color.orange);
        g.fillArc(105, 150, 40, 40, 0, 360);

        g.setColor(Color.green);
        g.fillArc(105, 195, 40, 40, 0, 360);
    }
}