package H04;

import java.awt.*;
import java.applet.*;

public class ex03 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(100, 50, 120, 25);
        g.fillRect(100, 50, 120, 25);

        g.setColor(Color.white);
        g.drawRect(100, 75, 120, 25);
        g.fillRect(100, 75, 120, 25);

        g.setColor(Color.blue);
        g.drawRect(100, 100, 120, 25);
        g.fillRect(100, 100, 120, 25);

        g.setColor(Color.black);
        g.drawRect(95, 50, 5, 200);
        g.fillRect(95, 50, 5, 200);

    }
}