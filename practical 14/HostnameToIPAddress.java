import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HostnameToIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hostname: ");
        String hostname = scanner.nextLine();

        try {
            InetAddress[] addresses = InetAddress.getAllByName(hostname);

            System.out.println("IP Addresses for " + hostname + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to resolve the hostname: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
