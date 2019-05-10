import java.io.IOException;
import java.util.Scanner;

/**
 * CheckOut class implements the interface Garage
 * Takes user input to display certain screens
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */

public class CheckOut implements Garage {
    Scanner in = new Scanner (System.in);
    Screens checkOut = new Screens();
    FileIO fio = new FileIO();
    LostTicketFeeCalc l = new LostTicketFeeCalc();
    SpecialEventFeeCalc s = new SpecialEventFeeCalc();


    @Override
    public void displayCharge() throws IOException {
        //find id
        //double vharge = charge;
        checkOut.receipt();
    }
        @Override
    public void displayScreen() throws IOException {
        checkOut.checkOutOptions();
        switch (in.nextLine()){
            case "1": checkOut.receiptChoice();
            displayCharge();
            break;
            case "2": double charge = s.charge;
                    checkOut.specialEvent(charge);
                break;
            case "3": charge = l.charge;
                checkOut.lostTicket(charge);
                break;
                default:
                    System.out.println("Please enter a valid number");
                    checkOut.checkOutOptions();
        }


    }
}
