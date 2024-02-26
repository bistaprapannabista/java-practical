import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab15 extends JFrame {

    public Lab15() {
        setTitle("Internal Frame Example");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a desktop pane to contain internal frames
        JDesktopPane desktopPane = new JDesktopPane();

        // Create internal frames
        JInternalFrame internalFrame1 = createInternalFrame("Internal Frame 1");
        JInternalFrame internalFrame2 = createInternalFrame("Internal Frame 2");

        // Add internal frames to the desktop pane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        // Set the desktop pane as the content pane of the frame
        setContentPane(desktopPane);

        setVisible(true);
    }

    // Helper method to create internal frames
    private JInternalFrame createInternalFrame(String title) {
        JInternalFrame internalFrame = new JInternalFrame(title, true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);

        // Add a button to the internal frame
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                internalFrame.dispose(); // Close the internal frame
            }
        });

        internalFrame.add(closeButton);

        internalFrame.setVisible(true);
        return internalFrame;
    }

    public static void main(String[] args) {
        new Lab15();
    }
}
