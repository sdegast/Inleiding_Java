package H04;

import java.awt.*;
import java.applet.*;

public class ex07 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(20, 20, 100, 100, 10, 10);

        g.setColor(Color.black);
        g.fillArc(40, 40, 20, 20, 0, 360);
        g.fillArc(40, 80, 20, 20, 0, 360);
        g.fillArc(80, 80, 20, 20, 0, 360);
        g.fillArc(80, 40, 20, 20, 0, 360);
    }

}