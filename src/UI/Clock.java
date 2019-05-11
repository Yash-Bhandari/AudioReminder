package UI;

import Utilities.Timer;

import javax.swing.*;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class Clock extends JLabel implements Runnable{
    private final Timer timer;
    public Clock(Timer timer) {
        super("", SwingConstants.CENTER);
        this.timer = timer;
        Font clockFont = new Font(Font.MONOSPACED, StyleConstants.FontConstants.ALIGN_CENTER, 20);
        setFont(clockFont);
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            if (timer.getTimeLeft().isPositive()) {
                setText(timer.getTimeLeft().toString());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
