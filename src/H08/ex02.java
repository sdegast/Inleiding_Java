package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ex02 extends Applet {
    int AantalM;
    int AantalV;
    int PotentM;
    int PotentV;
    Button buttonAM;
    Button buttonAV;
    Button buttonPM;
    Button buttonPV;


    public void init() {
        this.setSize(new Dimension(400,200));

        AantalM = 0;
        AantalV = 0;
        PotentM = 0;
        PotentV = 0;

        buttonAM = new Button("Man");
        buttonAM.addActionListener( new KnopListenerAM() );
        buttonAV = new Button("Vrouw");
        buttonAV.addActionListener( new KnopListenerAV() );
        buttonPM = new Button("Potentiële vrouw");
        buttonPM.addActionListener( new KnopListenerPM() );
        buttonPV = new Button("Potentiële man");
        buttonPV.addActionListener( new KnopListenerPV() );

        add(buttonAM);
        add(buttonAV);
        add(buttonPM);
        add(buttonPV);

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen: " + AantalM, 20, 40 );
        g.drawString("Aantal vrouwen: " + AantalV, 20, 60 );
        g.drawString("Potentiële mannen: " + PotentM, 20, 80 );
        g.drawString("Potentiële vrouwen: " + PotentV, 20, 100 );
    }

    class KnopListenerAM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalM++;
            repaint();
        }
    }

    class KnopListenerAV implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            AantalV++;
            repaint();
        }
    }

    class KnopListenerPM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotentM++;
            repaint();
        }
    }

    class KnopListenerPV implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PotentV++;
            repaint();
        }
    }
}