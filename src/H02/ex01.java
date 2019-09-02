package H02;

import java.awt.*;
import java.applet.*;

public class ex01 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Sander", 50, 60 );
    }

}