import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo extends JFrame {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public ScrollPaneDemo() {
        setTitle("ScrollPane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textArea);

        add(scrollPane);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ScrollPaneDemo app = new ScrollPaneDemo();
            app.setVisible(true);
        });
    }
}
