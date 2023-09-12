import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonProgressDemo extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;
    private Timer timer;
    private int progressValue;

    public ButtonProgressDemo() {
        setTitle("Button Progress Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false);
                progressValue = 0;

                timer = new Timer(100, new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        progressValue += 5;
                        progressBar.setValue(progressValue);

                        if (progressValue >= 100) {
                            timer.stop();
                            startButton.setEnabled(true);
                        }
                    }
                });

                timer.start();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(progressBar);
        panel.add(startButton);

        add(panel);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ButtonProgressDemo app = new ButtonProgressDemo();
            app.setVisible(true);
        });
    }
}
