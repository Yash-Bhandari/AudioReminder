package UI;

import javax.swing.*;
import Utilities.Timer;

public class Gui {
    JFrame program;
    public Gui() {
       program = new JFrame();
       Timer t = new Timer(15, 10);
       program.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       program.setSize(400, 400);
       program.setTitle("AudioReminder");
       program.setVisible(true);
       program.add(new Clock(t));
    }

    public static void main(String[] args) {
        new Gui();
    }
}
