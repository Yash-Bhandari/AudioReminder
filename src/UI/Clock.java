package UI;

import Utilities.Timer;

import javax.swing.*;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class Clock extends JLabel implements Runnable{
    Timer timer;
    public Clock(Timer timer) {
        super("", SwingConstants.CENTER);
        this.timer = timer;
        Font clockFont = new Font(Font.MONOSPACED, StyleConstants.FontConstants.ALIGN_CENTER, 20);
        setFont(clockFont);
        new Thread(this).start();
    }

    public void run() {
        while(timer.getTimeLeft() >= 0) {
            String time = timer.getTimeLeft() / 60 + ":"
            if (timer.getTimeLeft() timer.getTimeLeft() % 60;
            setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
