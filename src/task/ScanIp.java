package task;

import java.net.InetAddress;

public class ScanIp {

    public static void main(String[] args) {
        String baseIp = "192.168.48."; // base IP Address laptop me
        int timeout = 1000;

        while (true) {
            for (int i = 1; i <= 255; i++) { // loop 1-255
                String ip = baseIp + i;

                try {
                    InetAddress inet = InetAddress.getByName(ip);
                    boolean reachable = inet.isReachable(timeout);

                    if (reachable) {
                        System.out.println("Host " + ip + " is reachable");
                    } else {
                        System.out.println("Host " + ip + " is not reachable");
                    }
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }

            try {
                Thread.sleep(500); // jeda saat menmapilkan ip dan status reachable atau non reachable
            } catch (InterruptedException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}
