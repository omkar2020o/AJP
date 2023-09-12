import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplyButtonSwingApp extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public MultiplyButtonSwingApp() {
        setTitle("Multiply Button App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField(10);

        JButton multiplyButton = new JButton("Multiply");
        resultLabel = new JLabel("Result: ");

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double product = num1 * num2;
                    resultLabel.setText("Result: " + product);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Error");
                }
            }
        });

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(multiplyButton);
        panel.add(resultLabel);

        add(panel);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MultiplyButtonSwingApp app = new MultiplyButtonSwingApp();
            app.setVisible(true);
        });
    }
}
