import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Lab13 extends JFrame {
    public Lab13() {
        setTitle("JTable Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Object[][] data = {
                { "John", 25, "Male" },
                { "Alice", 30, "Female" },
                { "Bob", 28, "Male" }
        };

        String[] columnNames = { "Name", "Age", "Gender" };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        JTable table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(300, 200));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab13();
    }
}
