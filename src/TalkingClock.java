import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


public class TalkingClock {

    public void start(int interval, boolean beep) {
        var listener = new ActionListener()
        {                                                    //Анонимный внутренний класс
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is: " + Instant.ofEpochMilli(event.getWhen()));
                if(beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }

}
