package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ex03 extends Applet {
    double total;
    TextField textField;
    Button button;

    public void init(){
        button = new Button("Ok");
        knopListener kl = new knopListener();
        button.addActionListener(kl);
        add(button);

        textField = new TextField("", 20);
        add(textField);
    }

    public void paint(Graphics g) {
        g.drawString("" + total + "   inclusief BTW", 20, 100);
        g.drawString("Voer een bedrag exclusief BTW in.", 20, 60);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(textField.getText());
            total = round(num1 * 1.21, 2);

            repaint();
        }
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;

    }
}
