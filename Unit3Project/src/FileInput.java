import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * File Input Class
 * Writes to parking file
 * @author Hailey Kotvis
 * @version 2.0
 */
public class FileInput {
    String file = "Unit3Project/parking.txt";

    Scanner scanner = new Scanner(new File(file));

    /**
     * Constructor
     * @throws IOException
     */
    public FileInput() throws IOException {}

    /**
     * Reads what's already in the file and adds to it based on arraylist that is passed in
     * @param tickets
     * @throws IOException
     */
    public void write(ArrayList tickets) throws IOException {

        scanner.useDelimiter(" ");

        while (scanner.hasNextLine()) {
            tickets.add("\n" + scanner.nextLine());
        }

        scanner.close();
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Object t : tickets) {
            printWriter.print(t + " ");
        }
        printWriter.println("");
        printWriter.close();
    }

}
