import ulil.MP3Player;
import ulil.WindowOptions;

import java.util.Timer;
import java.util.TimerTask;

public class Main {


    public static void main(String[] args) {
        System.out.println("hello world");
        timerTask();

        MP3Player mp3Player = new MP3Player();
        mp3Player.musicPlayer();

    }

    public static void timerTask() {

        Timer timer = new Timer();

        // Create a task to be executed every minute
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                WindowOptions windowOptions = new WindowOptions();
            }
        };

        // Schedule the task to run every minute
        timer.schedule(task, 300, 60 * 10000); // 0 milliseconds

    }
}
