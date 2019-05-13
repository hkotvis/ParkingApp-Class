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
    LostTicketFeeCalc l = new LostTicketFeeCalc();
    SpecialEventFeeCalc s = new SpecialEventFeeCalc();
    ToArray ta = new ToArray();
    Context sp = new Context(new SpecialEventFeeCalc());
    Context lo = new Context(new LostTicketFeeCalc());
    Context mm = new Context(new MinMaxFeeCalc());

    /**
     * Constructor
     * @throws IOException
     */
    public CheckOut() throws IOException {}


    /**
     * Displays screen based on user input
     * Uses strategy pattern
     * @throws IOException
     */
    @Override
    public void displayCharge() throws IOException {
        checkOut.receipt(mm.executeStrategy());
    }

    /**
     * Displays screen based on user input
     * Uses strategy pattern
     * @return boolean flag to keep loop going
     * @throws IOException
     */
        @Override
    public boolean displayScreen() throws IOException {
        boolean flag = false;
        checkOut.checkOutOptions();
        switch (in.nextLine()){
            case "1":   mm.executeStrategy(); ta.toCheckOut();
            break;
            case "2": double specialCharge = sp.executeStrategy();
                    checkOut.specialEvent(specialCharge);
                    ta.toSpecialEvent();
                break;
            case "3":  double lostCharge = lo.executeStrategy();
                checkOut.lostTicket(lostCharge);
                ta.toLostTix();
                break;
            case "4": checkOut.closeGarage(sp.executeStrategy(), lo.executeStrategy());  flag = true;
            break;
            default: checkOut.error(); displayScreen();
        }

return flag;
    }
}
