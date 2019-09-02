package H06;

import java.applet.Applet;
import java.awt.*;

public class ex02 extends Applet {

    int a, uur, dag, jaar;

    public void init() {
        int a = 60;
        uur = a * a;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Een uur bevat " + uur + " seconden.", 20, 20);
        g.drawString("Een dag bevat " + dag + " seconden.", 20, 40);
        g.drawString("Een jaar bevat " + jaar + " seconden.", 20, 60);
    }
}
