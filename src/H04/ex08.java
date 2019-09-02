package H04;

import java.applet.Applet;
import java.awt.*;

public class ex08 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawString("Lijn", 185, 50);
        g.drawLine(50,30,350,30);

        g.drawString("Rechthoek", 175, 240);
        g.drawRect(50, 70, 300, 150);

        g.drawString("Afgeronde rechthoek", 145, 430);
        g.drawRoundRect(50,260,300,150,30,30);

        g.drawString("Gevulde ovaal", 480, 430);
        g.setColor(Color.magenta);
        g.fillArc(370, 260, 300, 150, 200, 360);

        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 440, 240);
        g.setColor(Color.magenta);
        g.fillRect(370, 70, 300, 150);
        g.setColor(Color.black);
        g.drawArc(370, 70, 300, 150, 200, 360);

        g.drawString("Taartpunt met ovaal eromheen", 760, 240);
        g.drawArc(690, 70, 300, 150, 200, 360);
        g.setColor(Color.magenta);
        g.fillArc(690, 70, 300, 150, 0, 45);

        g.setColor(Color.black);
        g.drawString("Cirkel", 805, 430);
        g.drawArc(750, 260, 150, 150, 0, 360);

    }
}
