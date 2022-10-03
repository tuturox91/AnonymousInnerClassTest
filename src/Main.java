import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TalkingClock myClock = new TalkingClock();

        myClock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}