package UI;

import Utilities.Time;
import Utilities.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Gui {
    JFrame program;
    JPanel panel;
    JButton plus1Min, plus10Min, plus1Hour, pausePlay;
    Clock clock;

    public Gui(Timer timer) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        program = new JFrame();
        program.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        program.setSize(400, 400);
        program.setTitle("Gentle Reminder");
        program.setVisible(true);

        program.add(panel = new JPanel());
        panel.setLayout(new BorderLayout());
        panel.add(clock = new Clock(timer), BorderLayout.CENTER);
        createControls(timer);

    }

    private void createControls(Timer timer) {
        JToolBar timeControls = new JToolBar();
        timeControls.setLayout(new FlowLayout(FlowLayout.CENTER));
        timeControls.setFloatable(false);
        timeControls.add(plus1Hour = new JButton("+1 hour"));
        timeControls.add(plus10Min = new JButton("+10 min"));
        timeControls.add(plus1Min = new JButton("+1 min"));
        plus1Min.addActionListener((ActionEvent e) -> timer.addTime(new Time(0, 1, 0)));
        plus10Min.addActionListener((ActionEvent e) -> timer.addTime(new Time(0, 10, 0)));
        plus1Hour.addActionListener((ActionEvent e) -> timer.addTime(new Time(1, 0, 0)));

        for(Component button : timeControls.getComponents()) {
            JButton b = (JButton) button;
            b.setFocusPainted(false);
            b.setContentAreaFilled(true);
        }


        pausePlay = new PausePlay(timer);

        System.out.println(pausePlay.getBackground());
        System.out.println(pausePlay.isBorderPainted());
        JPanel controls = new JPanel(new BorderLayout());
        JPanel botControls = new JPanel();
        botControls.add(timeControls);

        JToolBar topControls = new JToolBar();
        topControls.setLayout(new FlowLayout(FlowLayout.CENTER));
        topControls.add(pausePlay);

        controls.add(topControls, BorderLayout.NORTH);
        controls.add(botControls, BorderLayout.SOUTH);
        panel.add(controls, BorderLayout.SOUTH);
    }

}
