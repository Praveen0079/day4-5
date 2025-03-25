import java.io.*;

public class inputStreamReader {
    public static void main(String[] args) {
        // File to store user input
        String fileName = "user_input.txt";

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(fileName)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;

            while ((line = br.readLine()) != null) {
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                fw.write(line + System.lineSeparator());
            }

            System.out.println("User input has been saved to " + fileName);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
