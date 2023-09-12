import javax.swing.*;
import java.awt.*;

public class JTableDemo extends JFrame {
    private JTable table;

    public JTableDemo() {
        setTitle("JTable Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"ID", "NAME", "SALARY"};
        Object[][] data = {
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "SAchin", "700000"},

        };

        table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTableDemo app = new JTableDemo();
            app.setVisible(true);
        });
    }
}
