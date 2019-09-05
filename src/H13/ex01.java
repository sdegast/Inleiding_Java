package H13;

import java.applet.Applet;
import java.awt.*;

public class ex01 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        tekenDriehoek(g,100,100,150,50,200,100);
    }

    public void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x1,y1,x3,y3);
        g.drawLine(x2,y2,x3,y3);
    }
}
