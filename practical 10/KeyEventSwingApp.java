import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventSwingApp extends JFrame implements KeyListener {
    private JLabel messageLabel;

    public KeyEventSwingApp() {
        setTitle("Key Event Swing App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("Press a key...");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        add(messageLabel);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();

        String message = "keyPressed - Key Code: " + keyCode + " Key Char: " + keyChar;
        messageLabel.setText(message);
    }

    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyEventSwingApp app = new KeyEventSwingApp();
            app.setVisible(true);
        });
    }
}
