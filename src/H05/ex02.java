package H05;

import java.awt.*;
import java.applet.*;

public class ex02 extends Applet {

    int hoogteValerie;
    int hoogteJeroen;
    int hoogteHans;
    int nulpunt, yas_Valerie, yas_Jeroen, yas_Hans;

    public void init(){
        nulpunt=363;
        hoogteValerie=20;
        yas_Valerie=nulpunt-hoogteValerie*2;
        hoogteJeroen=100;
        yas_Jeroen=nulpunt-hoogteJeroen*2;
        hoogteHans=80;
        yas_Hans=nulpunt-hoogteHans*2;
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        super.paint(g);

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(291,129,291,363);
        g.drawLine(291,363,537,363);
        g.drawString("100", 259, 168 );
        g.drawString("80", 259, 208 );
        g.drawString("60", 259, 248 );
        g.drawString("40", 259, 288 );
        g.drawString("20", 259, 328 );
        g.drawString("Jeroen", 325, 375 );
        g.drawString("Valerie", 400, 375 );
        g.drawString("Hans", 480, 375 );
        g.setColor (new Color (5, 244, 244) );
        g.fillRect(400,yas_Valerie,45,hoogteValerie*2);
        g.setColor (new Color (101, 244, 80) );
        g.fillRect(325, yas_Jeroen, 45, hoogteJeroen*2);
        g.setColor (new Color (255, 31, 21) );
        g.fillRect(475, yas_Hans, 45, hoogteHans*2);
    }
}