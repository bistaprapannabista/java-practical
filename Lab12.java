import javax.swing.*;
import java.awt.*;

public class Lab12 extends JFrame {
    public Lab12() {
        setTitle("Tabbed Pane Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        JLabel label1 = new JLabel("Content of Tab 1");
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        JLabel label2 = new JLabel("Content of Tab 2");
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        JLabel label3 = new JLabel("Content of Tab 3");
        panel3.add(label3);

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        add(tabbedPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab12();
    }
}
