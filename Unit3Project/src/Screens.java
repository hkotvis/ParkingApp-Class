import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * These methods simply print the screens we will use throughout the application
 * @author Hailey Kotvis
 * @version 2.0
 */
public class Screens{
    FileOutput fo = new FileOutput();
    MinMaxFeeCalc m = new MinMaxFeeCalc();
    ToArray ta = new ToArray();

    /**
     * Constructor
     * @throws IOException
     */
    public Screens() throws IOException {}

    public void error(){
        System.out.println("Please enter a valid option");
    }
    public void checkInOptions(){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("1 - Check In");
        System.out.println("2 - Special Event");
        System.out.print("=>  ");
    }
    public void printTicket() {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Place this ticket on your dashboard, you will need it to check out of the garage!");
    }

    /**
     * Brings in charges for special events and lost tickets
     * @param specialCharge
     * @param lostCharge
     * @throws IOException
     */
    public void closeGarage(double specialCharge, double lostCharge) throws IOException {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Activity to Date");
        System.out.println("\n$"+ fo.getTotal() +".00 was collected from " + fo.getNumOfCheckIns() + " check ins");
        System.out.println("$" + (fo.getNumOfSpecialEvents() * specialCharge) + "0 was collected from " + fo.getNumOfSpecialEvents() + " special events");
        System.out.println("$"+ (fo.getNumOfLostTix() * lostCharge)+ "0 was collected from " + fo.getNumOfLostTix()+ " lost tickets");
        System.out.println("\n$"+((fo.getNumOfLostTix() * lostCharge)+(fo.getNumOfSpecialEvents() * specialCharge) + fo.getTotal()) +"0 was collected overall");

    }

    public void checkOutOptions(){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("1 - Check Out");
        System.out.println("2 - Special Event");
        System.out.println("3 - Lost Ticket");
        System.out.println("4 - Close Garage");
        System.out.print("=>  ");
    }

    /**
     * Brings in charge for calculation of hours parked
     * @param charge
     * @throws IOException
     */
    public void receipt(double charge) throws IOException {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Receipt for Parked Vehicle");
        System.out.println("\n"+ fo.getHrs() + " hours parked from " + fo.getIn() +" am - " + fo.getOut() + " pm");
        System.out.println("$" + fo.getCash() +".00");
    }

    /**
     * Brings in charge for special events
     * @param charge
     */
    public void specialEvent(double charge){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Special Event");
        System.out.println("$" + charge +"0");
    }

    /**
     * Brings in charge for lost ticket
     * @param charge
     */
    public void lostTicket(double charge) {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Lost Ticket");
        System.out.println("$" + charge +"0");
    }
}

