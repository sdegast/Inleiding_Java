package H06;

import java.applet.Applet;
import java.awt.*;

public class ex04 extends Applet {

    double result;
    int tmp;

    public void init() {
        result = ((5.9 + 6.3 + 6.9)/3)*10;
        tmp = (int)result;
        result = ((double)tmp/10);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + result, 20, 20);
    }
}
