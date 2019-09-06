package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ex01 extends Applet {

    Button drawCard;
    String[] Suit = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    String[] Value = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};
    String result;

    public void init() {
        drawCard = new Button("Draw a card");
        drawCardListener D = new drawCardListener();
        drawCard.addActionListener(D);
        add(drawCard);
        result = "";
    }

    public void paint(Graphics g) {

        Color b1= new Color(150, 0, 0);
        Color b2= new Color(0, 0, 0);

        int b = (int) (Math.random()*2+1);
        if(b == 1) g.setColor(b1);
        if(b == 2) g.setColor(b2);

        g.drawString(result, 50, 50);
    }

    class drawCardListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int ran1 = random.nextInt(4);
            String Suit = ex01.this.Suit[ran1];
            int ran2 = random.nextInt(13);
            String Value = ex01.this.Value[ran2];

            result = Suit + "-" + Value;
            repaint();
        }
    }
}