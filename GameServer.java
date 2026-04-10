package game;

import java.io.*;
import java.net.*;
import java.util.Random;

public class GameServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(6000);
        System.out.println("Game Server Started...");

        Socket socket = server.accept();
        System.out.println("Player connected!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        int number = new Random().nextInt(100) + 1;
        int guess;

        while (true) {
            guess = Integer.parseInt(in.readLine());

            if (guess == number) {
                out.println("Correct!");
                break;
            } 
            else if (guess > number) {
                out.println("Too High!");
            } 
            else {
                out.println("Too Low!");
            }
        }

        socket.close();
        server.close();
    }
}