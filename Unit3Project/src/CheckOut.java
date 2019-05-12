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
    ToArray ta = new ToArray();

    @Override
    public void displayCharge() throws IOException {
        checkOut.receipt();
    }
        @Override
    public void displayScreen() throws IOException {
        checkOut.checkOutOptions();
        switch (in.nextLine()){
            case "1":   ta.toCheckOut(); //displayCharge();
            break;
            case "2": double charge = s.charge;
                    checkOut.specialEvent(charge);
                    ta.toSpecialEvent();
                break;
            case "3": charge = l.charge;
                checkOut.lostTicket(charge);
                //fio.lost();
                ta.toLostTix();
                break;
            case "4": checkOut.closeGarage(s.charge, l.charge);
            break;
                default:
                    System.out.println("Please enter a valid number");
                    checkOut.checkOutOptions();
        }


    }
}
