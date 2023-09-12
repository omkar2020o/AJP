import java.net.URL;

public class URLComponents {
    public static void main(String[] args) {
        String urlString = "http://www.msbte.org.in";

        try {
            // Create a URL object from the URL string
            URL url = new URL(urlString);

            // Retrieve and print the URL components
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String file = url.getFile();

            System.out.println("URL: " + urlString);
            System.out.println("Protocol: " + protocol);
            System.out.println("Host: " + host);
            System.out.println("Port: " + (port == -1 ? "Default" : port)); // -1 indicates the default port
            System.out.println("File: " + file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
