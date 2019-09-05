package H12;

import java.applet.Applet;
import java.awt.*;

public class ex02 extends Applet {

    public void init() {
        Button[] buttons = new Button[25];
        for(int i = 0; i < 25; i++) {
            buttons[i] = new Button(String.valueOf(i));
            add(buttons[i]);
        }
    }
}
