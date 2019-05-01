package UI;

import javax.swing.*;

public class Gui {
    JFrame program;
    public Gui() {
       program = new JFrame();
       program.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       program.setSize(400, 400);
       program.setTitle("AudioReminder");
       program.setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }
}
