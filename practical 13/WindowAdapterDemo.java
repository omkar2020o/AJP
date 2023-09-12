import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Adapter Demo");

        // Create an instance of WindowAdapter and override the windowClosing method
        WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing. Performing cleanup tasks...");
                System.exit(0); // Exit the program
            }
        };

        // Add the WindowAdapter to the frame
        frame.addWindowListener(windowAdapter);

        // Set the size of the frame
        frame.setSize(400, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
