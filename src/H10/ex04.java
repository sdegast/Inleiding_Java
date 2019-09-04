package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex04 extends Applet {

    TextField textField;
    TextField textField1;
    int input;
    int input1;
    String month;
    int days;
    int year;
    boolean leapyear;
    Label label;
    Label label1;

    public void init() {
        label = new Label("< Maand");
        textField = new TextField("", 5);
        textFieldListener textFieldListener = new textFieldListener();
        textField.addActionListener(textFieldListener);
        label1 = new Label("< Jaar");
        textField1 = new TextField("", 5);
        textFieldListener textFieldListener1 = new textFieldListener();
        textField1.addActionListener(textFieldListener);
        add(textField);
        add(label);
        add(textField1);
        add(label1);
    }

    public void paint(Graphics g) {
        if (input1 >= 2019) {
            g.drawString(month + " heeft " + days + " dagen in " + input1, 20, 60);
        }
        else {
            g.drawString(month + " had " + days + " dagen in " + input1, 20, 60);
        }
    }

    class textFieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(textField.getText());
            input1 = Integer.parseInt(textField1.getText());

            boolean leapyear = false;
            if(input1 % 400 == 0) {
                leapyear = true;
            }
            else if (input1 % 100 == 0) {
                leapyear = false;
            }
            else if(input1 % 4 == 0) {
                leapyear = true;
            }
            else {
                leapyear = false;
            }

            while(input > 0 && input < 13) {
                if(input == 1) {
                    month = "Januari";
                    days = 31;
                    repaint();
                }
                if(input == 2 && !leapyear) {
                    month = "Februari";
                    days = 28;
                    repaint();
                }
                if(input == 2 && leapyear) {
                    month = "Februari";
                    days = 29;
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
