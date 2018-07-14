package pl.time4it.dzien_5.threads.serverTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP extends Thread {

    private int serverPort;

    public ServerTCP(String name, int port) {
        this.serverPort = port;
        setName(name);
    }

    @Override
    public void run() {

        ServerSocket serverSocket = null;
        Socket connectedSocked = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        String responseMessage =
                "HTTP/1.1 200 OK \r\n\r\n"
                + "<!DOCTYPE html>"
                + "<html><head><title>Moja Strona startowa</title></head>"
                + "<body><br/><center>Witamy na stronie Lukasza :)</center>"
                + "</body></html>";

        byte[] response = responseMessage.getBytes();
        byte[] buffer = new byte[2048];

        try {
            serverSocket = new ServerSocket(serverPort);

        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!this.isInterrupted()) {
            try {
                connectedSocked = serverSocket.accept();
                ConectedTCP myThred = new ConectedTCP("server");
                myThred.start();
                inputStream = connectedSocked.getInputStream();
                outputStream = connectedSocked.getOutputStream();

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {

                outputStream.write(response);

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                int counter = inputStream.read(buffer);

                if(counter > 0) {
                    String textMessage = new String(buffer,0,buffer.length);
                    System.out.println(textMessage);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                outputStream.flush();
                outputStream.close();
                inputStream.close();
                connectedSocked.close();


            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
}
