package practice;

import java.util.Scanner;
import java.net.InetAddress;

public class PingHost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Pilih metode inputan :");
            System.out.println("1. IP");
            System.out.println("2. Host name");
            System.out.print("Masukkan pilihan Anda : ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan IP Address : ");
                    String ip = input.next();
                    System.out.println("Hostname from ip \"" + ip + "\": "
                            + InetAddress.getByName(ip).getHostName());
                    break;
                case 2:
                    System.out.print("Masukkan host name : ");
                    String hostName = input.next();
                    System.out.println("Host/IP: " + InetAddress.getByName(hostName).getHostAddress());
                    System.out.println("Host/IP: " + InetAddress.getByName(hostName));

                    System.out.println("\n# Check connection");
                    InetAddress ia = InetAddress.getByName(hostName);
                    if (ia.isReachable(3000)) {
                        System.out.println(ia + " is Reachable");
                    } else {
                        System.out.println(ia + " is unReachable");
                    }
                    break;
                default:
                    System.out.println("Pilihan Anda tidak tersedia");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}
