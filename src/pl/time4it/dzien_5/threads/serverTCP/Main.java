package pl.time4it.dzien_5.threads.serverTCP;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        ServerTCP serverTCP = new ServerTCP("server",8081);
        serverTCP.start();

        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("moj adres IP: " + inetAddress.getHostAddress());

    }



}
