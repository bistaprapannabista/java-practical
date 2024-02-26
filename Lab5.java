import java.io.IOException;

public class Lab5 {
    public void readFile(String fileName) throws IOException {

        if (!fileExists(fileName)) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File " + fileName + " successfully read.");
    }

    private boolean fileExists(String fileName) {
        return false;
    }

    public static void main(String[] args) {
        Lab5 l5 = new Lab5();
        String fileName = "example.txt";
        try {
            l5.readFile(fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
