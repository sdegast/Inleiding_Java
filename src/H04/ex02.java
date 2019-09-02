package H04;

import java.awt.*;
import java.applet.*;

public class ex02 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(120, 120, 170, 80);
        g.drawLine(170, 80, 220, 120);
        g.drawRect(120, 120, 100, 50);
        g.drawRect(140, 140, 20, 30);
        g.drawRect(180, 135, 15, 15);
    }
}