package Lab18;

import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT)) {
            System.out.println("Connected to server. Type 'exit' to quit.");

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String userInput;
            while ((userInput = userInputReader.readLine()) != null) {
                writer.println(userInput);
                if ("exit".equals(userInput)) {
                    break;
                }
                System.out.println("Server: " + reader.readLine());
            }
        } catch (IOException e) {
            System.err.println("Error in the client: " + e.getMessage());
        }
    }
}
