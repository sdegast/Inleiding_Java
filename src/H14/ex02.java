package H14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

public class ex02 extends Applet {

    Button drawCardButton;

    String[] Suit = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    String[] Value = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE"};

    String Deck[];

    String[] playerOne;
    String[] playerTwo;
    String[] playerThree;
    String[] playerFour;

    private URL pad;
    private AudioClip sound;

    public void init() {

        setSize(1600, 900);

        playerOne = new String[ 13 ];
        playerTwo = new String[ 13 ];
        playerThree = new String[ 13 ];
        playerFour = new String[ 13 ];

        drawCardButton = new Button("Draw cards.");
        drawCardListener D = new drawCardListener();
        drawCardButton.addActionListener(D);
        add(drawCardButton);
        createFullDeck();

        pad = ex02.class.getResource("/H14/resources/");
        sound = getAudioClip(pad, "CardSFX.wav");

    }

    private void createFullDeck() {
        Deck = new String[ 52 ];

        int deckIndex = 0;
        for (int i = 0; i < Suit.length; i++) {
            String kleur = Suit[ i ];
            for (int j = 0; j < Value.length; j++) {
                String kaart = Value[ j ];
                String s = kleur + " " + kaart;
                Deck[ deckIndex ] = s;
                deckIndex++;
            }
        }
    }

    public void paint(Graphics g) {

        int x1 = 100;
        int x2 = 200;
        int x3 = 300;
        int x4 = 400;

        int y = 50;

        g.drawString("Speler 1 ", x1, y);
        g.drawString("Speler 2 ", x2, y);
        g.drawString("Speler 3 ", x3, y);
        g.drawString("Speler 4 ", x4, y);

        for (int i = 0; i < 13; i++) {

            y += 20;
            g.drawString(playerOne[ i ], x1, y);
            g.drawString(playerTwo[ i ], x2, y);
            g.drawString(playerThree[ i ], x3, y);
            g.drawString(playerFour[ i ], x4, y);
        }
    }

    class drawCardListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            createFullDeck();
            for (int i = 0; i < 13; i++) {
                playerOne[ i ] = givePlayerCards();
                playerTwo[ i ] = givePlayerCards();
                playerThree[ i ] = givePlayerCards();
                playerFour[ i ] = givePlayerCards();
            }
            sound.play();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            repaint();
        }

    }

    private String givePlayerCards() {
        int random = new Random().nextInt(Deck.length);
        String Card = Deck[random];

        //Shuffle cards.
        String[] tmpDeck = new String[ Deck.length - 1 ];
        int hulpindex = 0;
        for (int i = 0; i < Deck.length; i++) {
            if (i != random) {
                tmpDeck[hulpindex] = Deck[i];
                hulpindex++;
            }
        }
        Deck = tmpDeck;
        return Card;
    }
}