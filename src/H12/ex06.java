package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ex06 extends Applet {
    private int[] getallen = {1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 7, 8, 9, 0};
    private TextField userinput;
    private int result;

    public void init() {
        userinput = new TextField(5);
        Button press = new Button("Press");

        add(userinput);
        add(press);
        press.addActionListener(new ButtonListner());
    }

    class ButtonListner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = userinput.getText();
            int invoer = Integer.parseInt(input);

            result = 0;
            for (int value : getallen) {
                if (invoer == value) {
                    result++;
                }
            }
            System.out.println("Button pressed");
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString("De frequentie is: " + result, 60, 50);
    }
}