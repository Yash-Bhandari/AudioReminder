package Utilities;

import javax.sound.sampled.*;
import java.io.File;

public class AudioPlayer {
    Clip clip;
    FloatControl volume;
    public AudioPlayer(String audioFileLocation) {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File(audioFileLocation));
            clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            volume = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-20);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        clip.start();
    }

    public void pause() {
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
}
