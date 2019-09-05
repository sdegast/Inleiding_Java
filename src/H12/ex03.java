package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class ex03 extends Applet {
    private Button OK;
    private TextField textFields[];

    public void init() {
        textFields = new TextField[5];
        for (int teller = 0; teller < textFields.length; teller++) {
            textFields[teller] = new TextField(5);
            add(textFields[teller]);
        }

        OK = new Button("OK");
        OK.addActionListener(new Volgorde());
        add(OK);
    }

    class Volgorde implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int[5];
            for (int i = 0; i < textFields.length; i++) {
                getallen[i] = Integer.parseInt(textFields[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < textFields.length; i++) {
                textFields[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}