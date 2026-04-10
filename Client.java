package chat;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg;

        while (true) {
            System.out.print("Enter message: ");
            msg = userInput.readLine();

            out.println(msg);             
            System.out.println("Server: " + in.readLine()); 
        }
    }
}