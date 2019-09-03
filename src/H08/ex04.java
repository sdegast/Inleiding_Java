package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ex04 extends Applet {
    TextField textField;
    TextField textField1;
    Double nmbr;
    Double nmbr1;
    String result;
    Button multiply;
    Button divide;
    Button addition;
    Button subtraction;


    public void init() {
        this.setSize(new Dimension(500,200));
        textField = new TextField("",20);
        textField1 = new TextField("",20);
        multiply = new Button("*");
        multiply.addActionListener( new buttonmultiply() );
        divide = new Button("/");
        divide.addActionListener( new buttondivide() );
        addition = new Button("+");
        addition.addActionListener( new buttonaddition() );
        subtraction = new Button("-");
        subtraction.addActionListener( new buttonsubtraction() );
        add(textField);
        add(textField1);
        add(multiply);
        add(divide);
        add(addition);
        add(subtraction);
    }

    public void paint(Graphics g) {

    }

    class buttonmultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nmbr = Double.parseDouble(textField.getText());
            nmbr1 = Double.parseDouble(textField1.getText());
            result = String.valueOf(nmbr*nmbr1);
            textField.setText(result);
            textField1.setText("");
        }
    }

    class buttondivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nmbr = Double.parseDouble(textField.getText());
            nmbr1 = Double.parseDouble(textField1.getText());
            result = String.valueOf(nmbr/nmbr1);
            textField.setText(result);
            textField1.setText("");
        }
    }

    class buttonaddition implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nmbr = Double.parseDouble(textField.getText());
            nmbr1 = Double.parseDouble(textField1.getText());
            result = String.valueOf(nmbr+nmbr1);
            textField.setText(result);
            textField1.setText("");
        }
    }

    class buttonsubtraction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nmbr = Double.parseDouble(textField.getText());
            nmbr1 = Double.parseDouble(textField1.getText());
            result = String.valueOf(nmbr-nmbr1);
            textField.setText(result);
            textField1.setText("");
        }
    }
}
