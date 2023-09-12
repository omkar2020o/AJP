import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class StudentTableDemo extends JFrame {
    private JTable studentTable;

    public StudentTableDemo() {
        setTitle("Student Table Demo");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Name", "Percentage", "Grade"};
        Object[][] data = {
                {"Omkar", 85.5, "A"},
                {"Aryan", 92.0, "A"},
                {"Rudra", 78.3, "B"},
                {"Gayatri", 67.8, "C"},
                {"viresh", 55.2, "D"},
                {"madhavi", 89.6, "B"},
                {"arnav", 73.1, "C"},
                {"Pallivi", 95.4, "A"},
                {"narayan", 81.7, "B"},
                {"Pooja", 63.9, "C"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        studentTable = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(studentTable);
        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentTableDemo app = new StudentTableDemo();
            app.setVisible(true);
        });
    }
}
