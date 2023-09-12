import java.io.*;
import java.net.*;

public class AuthenticationClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Connect to the server on localhost:12345

            // Create input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Simulate user input (Replace with actual user input)
            String userId = "user123";
            String password = "password123";

            // Send user ID and password to the server
            out.println(userId);
            out.println(password);

            // Receive and print authentication result from the server
            String response = in.readLine();
            System.out.println("Server Response: " + response);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
