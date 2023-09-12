import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button with an anonymous inner class action listener
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Button clicked!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
