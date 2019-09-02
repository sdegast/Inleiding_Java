package H02;

import java.awt.*;
import java.applet.*;

public class ex02 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sander", 50, 60 );

        g.setColor(Color.red);
        g.drawString("de Gast", 50, 70 );
    }

}