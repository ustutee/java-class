package game;

import java.io.*;
import java.net.*;

public class GameClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 6000);
        System.out.println("Connected to Game Server!");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(
                new InputStreamReader(System.in));

        String response;
        int guess;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            guess = Integer.parseInt(userInput.readLine());

            out.println(guess);

            response = in.readLine();
            System.out.println("Server: " + response);

            if (response.equals("Correct!")) {
                System.out.println("🎉 You guessed the number!");
                break;
            }
        }

        socket.close();
    }
}