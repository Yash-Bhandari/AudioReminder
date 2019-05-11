package Logic;

import UI.Gui;
import Utilities.AudioPlayer;
import Utilities.Time;
import Utilities.Timer;

public class App {
    Gui gui;
    AudioPlayer ap;
    Timer timer;

    public App() {
        timer = new Timer(0, 0, 10);
        timer.pause();
        gui = new Gui(timer);
        ap = new AudioPlayer("audio/audio1.wav");
        timer.resume();

        int timeToWait = 100;
        int counter = 0;
        while (true) {
            if (timer.getTimeLeft().toMS() <= 0) {
                counter++;
                if (!ap.isPlaying()) {
                    System.out.println("Starting to play audio");
                    ap.play();
                }
                if (counter >= 200) {
                    counter = 0;
                    ap.increaseVolume();
                    System.out.println("Increased volume to " + ap.getVolume());
                }
            } else {
                ap.pause();
            }
            try {
                Thread.sleep(timeToWait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        new App();
    }
}
