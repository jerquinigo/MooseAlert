package ulil;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3Player {


    public void musicPlayer() {
        try {
            // Specify the MP3 file path
            String mp3FilePath = "./resources/PokemonBlueLowHealth.mp3";

            // Create a FileInputStream from the MP3 file
            FileInputStream fileInputStream = new FileInputStream(mp3FilePath);

            // Create an AdvancedPlayer to play the MP3
            AdvancedPlayer player = new AdvancedPlayer(fileInputStream);

            // Start playing the MP3
            player.play();

            // Optionally, you can add logic to control playback (e.g., pause, stop)

            // Close the FileInputStream and release resources
            fileInputStream.close();
        } catch (JavaLayerException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
