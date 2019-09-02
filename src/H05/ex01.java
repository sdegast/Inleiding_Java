package H05;

import java.awt.*;
import java.applet.*;

public class ex01 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int posa;
    int posb;
    int posc;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        posa = 20;
        posb = 230;
        posc = 440;
    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(posa, posa, 220, 20);
        g.drawString("Lijn", 110, 40);
        g.drawRect(posa, 50, breedte, hoogte);
        g.drawString("Rechthoek", 90, 170);
        g.drawRoundRect(posa, 180, breedte, hoogte, 10, 10);
        g.drawString("Afgeronde Rechthoek", 60, 300);
        g.setColor(opvulkleur);
        g.fillRect(posb, 50, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(posb, 50, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 250, 170);
        g.setColor(opvulkleur);
        g.fillOval(posb, 180, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 290, 300);
        g.setColor(lijnkleur);
        g.drawOval(posc, 50, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(posc, 50, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",460,170);
        g.setColor(lijnkleur);
        g.drawOval(490, 180, hoogte, hoogte);
        g.drawString("Cirkel", 525, 300);
    }
}
