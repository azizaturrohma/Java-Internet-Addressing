package task;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MacAddress {
    public static void main(String[] args) {
        String ip = "192.168.48.105"; // ip address laptop me

        try {
            InetAddress address = InetAddress.getByName(ip);
            NetworkInterface network = NetworkInterface.getByInetAddress(address);

            if (network != null) {
                byte[] mac = network.getHardwareAddress();

                if (mac != null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < mac.length; i++) {
                        sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                    }
                    System.out.println("MAC Address: " + sb.toString());
                } else {
                    System.out.println("MAC Address not found");
                }
            } else {
                System.out.println("Network Interface not found");
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + ip);
        } catch (SocketException e) {
            System.err.println("Error while getting MAC address: " + e.getMessage());
        }
    }
}
