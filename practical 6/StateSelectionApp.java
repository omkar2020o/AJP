import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StateSelectionApp extends JFrame {
    private JComboBox<String> stateComboBox;
    private JLabel selectedStateLabel;

    private String[] states = {
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
            "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh",
            "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra",
            "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha",
            "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana",
            "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
    };

    public StateSelectionApp() {
        setTitle("State Selection App");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        stateComboBox = new JComboBox<>(states);

        selectedStateLabel = new JLabel("Selected State: ");
        JButton showButton = new JButton("Show");

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedState = (String) stateComboBox.getSelectedItem();
                selectedStateLabel.setText("Selected State: " + selectedState);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(stateComboBox);
        panel.add(showButton);
        panel.add(selectedStateLabel);

        add(panel);

        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StateSelectionApp app = new StateSelectionApp();
            app.setVisible(true);
        });
    }
}
