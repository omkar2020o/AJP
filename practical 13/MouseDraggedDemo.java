import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseDraggedDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Dragged Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to display mouse coordinates
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawString("Mouse Coordinates: (" + mouseX + ", " + mouseY + ")", 10, 20);
            }
        };

        // Add MouseMotionAdapter to the panel to handle mouseDragged event
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                panel.repaint(); // Redraw the panel to update the coordinates
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static int mouseX = 0;
    private static int mouseY = 0;
}
