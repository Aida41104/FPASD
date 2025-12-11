import javax.sound.sampled.*;
import java.io.File;

public class BackgroundMusic {

    public BackgroundMusic() {
        try {
            File soundFile = new File("src/sounds/6525273874497800630-c.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            System.out.println("Background music started.");

        } catch (Exception e) {
            System.out.println("Failed to play background music: " + e.getMessage());
        }
    }
}
