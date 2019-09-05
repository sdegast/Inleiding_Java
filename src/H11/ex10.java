package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ex10 extends Applet {
    int x = 50;
    private int y = 30;
    private int tafel = 0;
    private TextField tf;
    private Boolean input;

    public void init() {
        TafelListener tl = new TafelListener();
        tf = new TextField("", 5);
        tf.addActionListener((tl));
        Label label = new Label("Voer een tafel in");
        Button ok = new Button("OK");
        ok.addActionListener((tl));

        add(label);
        add(tf);
        add(ok);

        NextTafelListener ntl = new NextTafelListener();
        Button next = new Button("Next");
        next.addActionListener((ntl));

        add(next);
    }


    private class TafelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            tafel = Integer.valueOf(tf.getText());
            tf.setText("");
            input = true;
            repaint();
        }
    }
    private class NextTafelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel++;
            repaint();
        }
    }

    public void paint(Graphics g) {

        if (input) {
            for (int teller=1; teller <= 10; teller++) {
                y += 20;


                int result = tafel * teller;
                g.drawString(teller + " x " + tafel + " = " + result, x, y);
            }
            y = 30;
        }
    }
}