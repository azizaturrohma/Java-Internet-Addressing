package example;

import java.net.InetAddress;

public class InAddress {
    public static void main(String[] args) {
        try {
            System.out.println("# Get hostname from current ip");
            String ip = "173.252.120.6";
            System.out.println("Hostname from ip \"" + ip + "\": " + InetAddress.getByName(ip).getHostName());

            System.out.println("\n# Get host address from current name");
            String host = "www.google.com";
            System.out.println("Host/IP: " + InetAddress.getByName(host).getHostAddress());
            System.out.println("Host/IP: " + InetAddress.getByName(host));

            System.out.println("\n# Check connection");
            InetAddress ia = InetAddress.getByName(host);
            if (ia.isReachable(3000)) {
                System.out.println(ia + " is Reachable");
            } else {
                System.out.println(ia + " is unReachable");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}