package H11;

import java.applet.Applet;
import java.awt.*;

public class ex09 extends Applet {

    private int marge;
    private int breedteVeld;
    private int hoogteVeld;
    private Color wit;
    private Color zwart;
    private Color achtergrond;

    public void init() {

        wit = Color.white;
        zwart = Color.black;
        achtergrond = Color.lightGray;
        marge = 60;
        breedteVeld = 60;
        hoogteVeld = breedteVeld;

        int breedteScherm = 2 * marge + 8 * breedteVeld;
        int hoogteScherm = 2 * marge + 8 * hoogteVeld;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {

        int y = marge;
        for(int rij = 0; rij < 8; rij++) {
            int x = marge;
            for(int kolom = 0; kolom < 8; kolom++) {
                if ((rij + kolom) % 2 == 0) {
                    g.setColor(wit);
                }
                else {
                    g.setColor(zwart);
                }
                g.fillRect(x, y, breedteVeld, hoogteVeld);
                x += breedteVeld;
            }
            y += hoogteVeld;
        }
    }

}
