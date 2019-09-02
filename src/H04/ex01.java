package H04;

import java.awt.*;
import java.applet.*;

public class ex01 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(50, 120, 100, 120);
        g.drawLine(50, 120, 75, 60);
        g.drawLine(75, 60, 100, 120);
    }
}