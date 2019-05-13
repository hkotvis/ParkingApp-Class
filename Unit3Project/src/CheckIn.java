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
ToArray ta = new ToArray();
Screens checkIn = new Screens();

    /**
     * Constructor for CheckIn
     * @throws IOException
     */
    public CheckIn() throws IOException {}

    /**
     * Displays screen based on user input
     *
     * @return boolean false to keep the loop going
     */
    public boolean displayScreen() {
        checkIn.checkInOptions();
        switch (in.nextLine()){
            case "1":  checkIn.printTicket();
            break;
            case "2": checkIn.printTicket();
            break;
            default: checkIn.error(); displayScreen();
        }

        return false;
    }
    @Override
    public void displayCharge() {}
}
