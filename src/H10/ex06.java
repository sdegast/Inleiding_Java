package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex06 extends Applet{
    private Button OK;
    private TextField userinput;
    private String result;

    public void init() {
        OK = new Button("OK");
        Beoordeling listener = new Beoordeling();
        OK.addActionListener(listener);
        userinput = new TextField(5);
        result = "";
        add(userinput);
        add(OK);
    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is: " + result, 50,60);

    }

    class Beoordeling implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            result = userinput.getText();
            int cijfer = Integer.parseInt(result);

            if(cijfer <= 10 || cijfer >= 1) {
                switch (cijfer) {
                    case 1:
                        cijfer = 1;
                        result = "slecht";

                    case 2:
                        cijfer = 2;
                        result = "slecht";

                    case 3:
                        cijfer = 3;
                        result = "slecht";
                        break;

                    case 4:
                        cijfer = 4;
                        result = "onvoldoende";
                        break;

                    case 5:
                        cijfer = 5;
                        result = "matig";
                        break;

                    case 6:
                        cijfer = 6;
                        result = "voldoende";

                    case 7:
                        cijfer = 7;
                        result = "voldoende";
                        break;

                    case 8:
                        cijfer = 8;
                        result = "goed";

                    case 9:
                        cijfer = 9;
                        result = "goed";

                    case 10:
                        cijfer = 10;
                        result = "goed";
                        break;
                }
            }
            if (cijfer > 10 || cijfer < 1) {
                result = "ERROR";
            }
            repaint();
        }
    }

}