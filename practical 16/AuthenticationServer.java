import java.io.*;
import java.net.*;

public class AuthenticationServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Change to desired port number
            System.out.println("Server is listening on port 12345...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create input and output streams for communication with the client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Receive user ID and password from the client
                String userId = in.readLine();
                String password = in.readLine();

                // Perform authentication (You should implement your own authentication logic here)
                boolean isAuthenticated = authenticate(userId, password);

                // Send authentication result to the client
                if (isAuthenticated) {
                    out.println("Authentication successful");
                } else {
                    out.println("Authentication failed");
                }

                // Close the client socket
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Implement your authentication logic here
    private static boolean authenticate(String userId, String password) {
        // Replace this with your actual authentication logic
        // For simplicity, we are using hardcoded values for demonstration
        return userId.equals("user123") && password.equals("password123");
    }
}
