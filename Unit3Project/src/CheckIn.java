import java.io.IOException;
import java.util.Scanner;

/**
 * This CheckIn class uses user input to display certain screens and implements the garage interface
 * @author Hailey Kotvis
 * @version 2.0
 */
public class CheckIn implements Garage{
Scanner in = new Scanner (System.in);
TimeFactory tf = new TimeFactory();

    Screens checkIn = new Screens();
    public void displayScreen() throws IOException {
        checkIn.checkInOptions();
        switch (in.nextLine()){
            case "1": tf.toArray(); checkIn.printTicket();
            break;
            case "2": checkIn.printTicket();
            break;
            default: checkIn.closeGarage();
        }


    }
    @Override
    public void displayCharge() {
    }
}
