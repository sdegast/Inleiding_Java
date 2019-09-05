package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex04 extends Applet {
    private boolean gevonden;
    private int index;
    private int[] getallen = {21, 5, 15, 19, 3, 2,11 , 8, 12, 0, 2 ,9};
    private TextField userinput;

    private boolean zoeken(int zoek) {
        int teller = 0;
        for (Integer getal : getallen) {
            if (getal.equals(zoek)) {
                index = teller;
                System.out.println("Gevonden");
                return true;
            }
            teller++;
        }
        return false;
    }
    public void init() {
        userinput = new TextField(5);
        Button OK = new Button("OK");
        add(userinput);
        add(OK);
        OK.addActionListener( new buttonOK() );

    }
    private static Integer getIntegerFromTextBox(TextField textBox) {
        int integer;

        if (textBox.getText().trim().equals("")) {
            integer = 0;
        }
        else {
            integer = Integer.parseInt(textBox.getText());
        }
        return integer;
    }
    class buttonOK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(zoeken(getIntegerFromTextBox(userinput))) {
                gevonden = true;
                repaint();
            }
            else {
                gevonden = false;
                repaint();
            }
            System.out.println("Button pressed");
        }
    }

    public void paint(Graphics g) {
        if(gevonden) {
            g.drawString("Gevonden " + index, 50, 50);
        }
        else {
            g.drawString("Niet gevonden", 50, 50);
        }
    }
}