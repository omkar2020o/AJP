import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLInfoRetrieval {
    public static void main(String[] args) {
        String urlString = "https://www.example.com"; // Replace with the URL you want to retrieve information for

        try {
            // Create a URL object from the input URL string
            URL url = new URL(urlString);

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Retrieve and print date information
            long lastModified = connection.getLastModified();
            Date date = new Date(lastModified);
            System.out.println("Last Modified Date: " + date);

            // Retrieve and print content type information
            String contentType = connection.getContentType();
            System.out.println("Content Type: " + contentType);

            // Retrieve and print content length information
            int contentLength = connection.getContentLength();
            System.out.println("Content Length: " + contentLength + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
