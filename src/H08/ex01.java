package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ex01 extends Applet {
    TextField textField;
    Label label;
    Button button;
    Button button1;


    public void init() {
        this.setSize(new Dimension(500,200));
        textField = new TextField("",20);
        label = new Label("Typ iets in het tekstvakje");
        button = new Button("Ok");
        button.addActionListener( new KnopListener() );
        button1 = new Button("RESET");
        button1.addActionListener( new KnopListener1() );
        add(label);
        add(textField);
        add(button);
        add(button1);
    }

    public void paint(Graphics g) {

        g.drawString(textField.getText(), 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            repaint();
        }
    }
}