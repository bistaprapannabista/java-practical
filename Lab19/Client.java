package Lab19;

import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT)) {
            System.out.println("Connected to server.");

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Prompt user to enter length and breadth
            System.out.print("Enter length: ");
            double length = Double.parseDouble(userInputReader.readLine());
            writer.println(length);

            System.out.print("Enter breadth: ");
            double breadth = Double.parseDouble(userInputReader.readLine());
            writer.println(breadth);

            // Receive area from server and display it
            String response = reader.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
            System.err.println("Error in the client: " + e.getMessage());
        }
    }
}
