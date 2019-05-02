package UI;

import Utilities.Timer;

import javax.swing.*;

public class Gui {
    JFrame program;

    public Gui() {
        /*try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        program = new JFrame();
        Timer t = new Timer(1, 0, 10);
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
