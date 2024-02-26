import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab14 extends JFrame {
    private JProgressBar progressBar;
    private Timer timer;
    private int progressValue;

    public Lab14() {
        setTitle("Progress Bar Example");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressValue += 5;
                progressBar.setValue(progressValue);
                if (progressValue >= 100) {
                    timer.stop();
                    JOptionPane.showMessageDialog(Lab14.this, "Progress Complete!");
                }
            }
        });

        // Add the progress bar to the frame
        add(progressBar);

        setVisible(true);

        // Start the timer
        timer.start();
    }

    public static void main(String[] args) {
        new Lab14();
    }
}
