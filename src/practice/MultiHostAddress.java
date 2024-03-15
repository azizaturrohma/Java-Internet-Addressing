package practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MultiHostAddress {
    public static void main(String[] args) {
        String hostName = "www.youtube.com";

        try {
            InetAddress[] hostAddress = InetAddress.getAllByName(hostName);

            System.out.println("Nama Host: " + hostName);
            System.out.println("Alamat Host: ");
            for (int i = 0; i < hostAddress.length; i++) { // loop mulai 0 hingga panjang dari jumlah host address
                System.out.println((i + 1) + ". " + hostAddress[i]);
            }
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
