package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex07 extends Applet {
    private String[] telefoonNummers;
    private String[] namen;
    private TextField naaminput;
    private TextField nummerinput;
    private Button OK;
    private int teller;

    public void init() {
        teller = 0;
        telefoonNummers = new String[10];
        namen = new String[10];
        naaminput = new TextField(5);
        nummerinput = new TextField(10);
        OK = new Button("OK");
        add(naaminput);
        add(nummerinput);
        add(OK);
        OK.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[teller] = naaminput.getText();
            telefoonNummers[teller] = nummerinput.getText();
            teller++;
            naaminput.setText("");
            nummerinput.setText("");
            System.out.println("Button pressed");
            repaint();
        }
    }

    public void paint(Graphics g) {
        int y = 80;
        if (teller > 9) {
            for (int i = 0; i < namen.length; i++) {
                g.drawString("" + namen[i], 80, y);
                g.drawString("" + telefoonNummers[i], 150, y);
                y += 20;
            }
        }
    }
}