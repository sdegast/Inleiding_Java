package H13;


import java.applet.Applet;
import java.awt.*;

public class ex02 extends Applet {

    public void paint(Graphics g) {
        muur(g, 10, 20, 5, 10);
    }


    public void muur(Graphics g, int hoogte, int breedte, int cement, int stenen) {
        int startx = 50;
        int starty = 50;
        int teller = 0;
        int teller2 = 0;

        while(teller < stenen) {
            g.setColor(Color.red);
            g.fillRect(startx, starty, breedte, hoogte);
            startx += (breedte + cement);
            teller++;

            if (teller == 10) {
                teller = 0;
                starty += (hoogte + cement);

                if ((teller2%2) == 0) {
                    startx = 40;
                }
                else {
                    startx = 50;
                }
                teller2++;
            }
            if (teller2 == 10) {
                break;
            }
        }
    }
}
