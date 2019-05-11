package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import Utilities.Timer;

public class PausePlay extends JButton {
    private final ImageIcon playIcon = new ImageIcon("assets/play.png");
    private final ImageIcon pauseIcon = new ImageIcon("assets/pause.png");
    private final Timer timer;

    public PausePlay(Timer timer) {
        super();
        this.timer = timer;
        setSize(50, 50);
        setIcon(pauseIcon);
        addActionListener((ActionEvent e) -> {
            timer.switchState();
            updateIcon();
        });
        setFocusPainted(false);
    }

    private void updateIcon() {
        setIcon(timer.isPaused() ? playIcon : pauseIcon);
    }

}
