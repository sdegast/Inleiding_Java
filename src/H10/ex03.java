package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex03 extends Applet {

    TextField textField;
    long input;
    String month;
    int days;

    public void init() {
        textField = new TextField("", 20);
        textFieldListener textFieldListener = new textFieldListener();
        textField.addActionListener(textFieldListener);
        add(textField);
    }

    public void paint(Graphics g) {
        g.drawString(input + " is de maand: " + month + " en heeft " + days + " dagen.", 20, 60);
    }

    class textFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Long.parseLong(textField.getText());
            while(input > 0 && input < 13) {
                if(input == 1) {
                    month = "Januari";
                    days = 31;
                    repaint();
                }
                if(input == 2) {
                    month = "Februari";
                    days = 28;
                    repaint();
                }
                if(input == 3) {
                    month = "Maart";
                    days = 31;
                    repaint();
                }
                if(input == 4) {
                    month = "April";
                    days = 30;
                    repaint();
                }
                if(input == 5) {
                    month = "Mei";
                    days = 31;
                    repaint();
                }
                if(input == 6) {
                    month = "Juni";
                    days = 30;
                    repaint();
                }
                if(input == 7) {
                    month = "Juli";
                    days = 31;
                    repaint();
                }
                if(input == 8) {
                    month = "Augustus";
                    days = 31;
                    repaint();
                }
                if(input == 9) {
                    month = "September";
                    days = 30;
                    repaint();
                }
                if(input == 10) {
                    month = "Oktober";
                    days = 31;
                    repaint();
                }
                if(input == 11) {
                    month = "November";
                    days = 30;
                    repaint();
                }
                if(input == 12) {
                    month = "December";
                    days = 31;
                    repaint();
                }
                else {
                    break;
                }
                break;
            }
        }
    }
}
