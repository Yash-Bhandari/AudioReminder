package Utilities;

import javax.sound.sampled.*;
import java.io.File;

public class AudioPlayer {
    Clip clip;
    FloatControl volume;
    boolean playing = false;

    public AudioPlayer(String audioFileLocation) {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File(audioFileLocation));
            clip = AudioSystem.getClip();
            clip.open(stream);
            volume = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-50);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            System.out.println("Lowest volume is " + volume.getMinimum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        playing = true;
        clip.start();
    }

    public void pause() {
        playing = false;
        clip.stop();
    }

    public float getVolume() {
        return volume.getValue();
    }

    public void setVolume(int newVolume) {
        volume.setValue(newVolume);
    }

    public void decreaseVolume() {
        volume.setValue(volume.getValue() - (float)0.1);
    }

    public void increaseVolume() {
        volume.setValue(volume.getValue() + (float)0.1);
    }

    public boolean isPlaying() {
        return playing;
    }
}
