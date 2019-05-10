import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Hailey Kotvis
 * @version 2.0
 */
public class FileInput {
    // TimeFactory tf = new TimeFactory();
    ArrayList<String> tickets = new ArrayList<>();
    String file = "Unit3Project/parking.txt";
    MinMaxFeeCalc m = new MinMaxFeeCalc();


    public void write(ArrayList tickets) throws IOException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");

        while (scanner.hasNextLine()) {
            tickets.add("\n" + scanner.nextLine());
        }

        scanner.close();
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        //printWriter.print(tf.getHours()+ " hours, from " + tf.getTimeIn() + " am - " +tf.getTimeOut() + " pm");

        for (Object t : tickets) {
            printWriter.print(t + " ");
        }
        printWriter.println("");
        printWriter.close();
    }

    public void read() throws IOException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }



}
