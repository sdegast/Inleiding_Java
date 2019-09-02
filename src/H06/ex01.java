package H06;

import java.applet.Applet;
import java.awt.*;

public class ex01 extends Applet {

    int a, b;
    double result;

    public void init() {
        int a = 113;
        result = a / 4.0;
    }

    public void paint(Graphics g) {
        g.drawString("Verdeling opbrengsten:", 20, 20);
        g.drawString("Jan: " + result, 20, 40);
        g.drawString("Ali: " + result, 20, 60);
        g.drawString("Jeannette: " + result, 20, 80);
        g.drawString("Sander: " + result, 20, 100);

        g.drawLine(15, 25, 150, 25);
        g.drawRect(15, 5, 135, 100);
    }
}
