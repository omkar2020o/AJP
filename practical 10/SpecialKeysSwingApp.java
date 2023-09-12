import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpecialKeysSwingApp extends JFrame implements KeyListener {
    private JLabel messageLabel;

    public SpecialKeysSwingApp() {
        setTitle("Special Keys Swing App");
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
        String keyText = KeyEvent.getKeyText(keyCode);

        if (keyChar == KeyEvent.CHAR_UNDEFINED) {
            if (keyCode >= KeyEvent.VK_F1 && keyCode <= KeyEvent.VK_F12) {
                messageLabel.setText("Function key pressed: " + keyText);
            } else if (keyCode >= KeyEvent.VK_LEFT && keyCode <= KeyEvent.VK_DOWN) {
                messageLabel.setText("Arrow key pressed: " + keyText);
            } else {
                messageLabel.setText("Special key pressed: " + keyText);
            }
        } else {
            messageLabel.setText("Regular key pressed: " + keyChar);
        }
    }

    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public void keyTyped(KeyEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SpecialKeysSwingApp app = new SpecialKeysSwingApp();
            app.setVisible(true);
        });
    }
}
