package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ex01 extends Applet {
    TextField textField;
    int nmbr;
    int input;

    public void init() {
        textField = new TextField("", 10);
        textFieldListener textFieldListener = new textFieldListener();
        textField.addActionListener(textFieldListener);
        add(textField);
    }

    public void paint (Graphics g){
        g.drawString("Huidige hoogste getal = " + nmbr, 20, 60);
    }

    class textFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(textField.getText());
            if (input > nmbr) {
                nmbr = input;
                repaint();
            }
        }
    }
}
