package H04;

import java.applet.Applet;
import java.awt.*;

public class ex05 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(100, 100, 250, 500, 90, 360);
    }
}