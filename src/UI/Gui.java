package UI;

import Utilities.Time;
import Utilities.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui {
    JFrame program;
    JButton plus1Min, plus10Min, plus1Hour ;


    public Gui(Timer timer) {
        /*try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        program = new JFrame();
        program.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        program.setSize(400, 400);
        program.setTitle("Gentle Reminder");
        program.setVisible(true);
        program.add(new Clock(timer), BorderLayout.CENTER);

        JToolBar timeControls = new JToolBar();
        timeControls.setLayout(new FlowLayout(FlowLayout.CENTER));
        timeControls.setFloatable(false);
        timeControls.add(plus1Hour = new JButton("+1 hour"));
        timeControls.add(plus10Min = new JButton("+10 min"));
        timeControls.add(plus1Min = new JButton("+1 min"));
        plus1Min.addActionListener((ActionEvent e) -> timer.addTime(new Time(0, 1, 0)));
        plus10Min.addActionListener((ActionEvent e) -> timer.addTime(new Time(0, 10, 0)));
        plus1Hour.addActionListener((ActionEvent e) -> timer.addTime(new Time(1, 0, 0)));

        program.add(timeControls, BorderLayout.SOUTH);

    }
}
