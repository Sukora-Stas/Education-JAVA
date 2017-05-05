package someEducation;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Sukora Stas.
 */
public class GetIP {
    public static void main(String[] args) {
        InetAddress ip;
        String hostName;
        try {
            ip = InetAddress.getLocalHost();
            hostName = ip.getHostName();
            System.out.println("My IP: " + ip);
            System.out.println("My HostName: " + hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        int mb = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("");

        System.out.println("Heap utilization statistics [MB]");
        System.out.println("Used memory: " + (runtime.totalMemory() - runtime.freeMemory()) / mb);

        System.out.println("Available memory: " + runtime.freeMemory() / mb);

        System.out.println("Total memory:" + runtime.totalMemory() / mb);

        System.out.println("Max memory: " + runtime.maxMemory() / mb);

        System.getProperties().list(System.out);


    }
}
