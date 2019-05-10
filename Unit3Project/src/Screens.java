import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * These methods simply print the screens we will use throughout the application
 * @author Hailey Kotvis
 * @version 2.0
 */
public class Screens{
    FileIO fio = new FileIO();
    TimeFactory tf = new TimeFactory();
    MinMaxFeeCalc m = new MinMaxFeeCalc();

    public void checkInOptions(){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("1 - Check In");
        System.out.println("2 - Special Event");
        //System.out.println("3 - Close Garage");
    }
    public void printTicket() throws IOException {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Place this ticket on your dashboard, you will need it to check out of the garage!");
    }
    public void closeGarage() throws IOException {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Activity to Date");
        System.out.println("\n$ .00 was collected from " + fio.getNumOfCheckIns() + " check ins");
        System.out.println("$ .00 was collected from " + fio.getNumOfSpecialEvents() + " special events");
        System.out.println("$ .00 was collected from " + fio.getNumOfLostTix()+ " lost tickets");
        System.out.println("\n$ .00 was collected overall");

    }

    public void checkOutOptions(){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("1 - Check Out");
        System.out.println("2 - Special Event");
        System.out.println("3 - Lost Ticket");
        System.out.println("4 - Close Garage");
    }
    public void receiptChoice() throws IOException {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Enter Vehicle ID");

    }
    public void receipt() throws IOException {
        System.out.println("Receipt for Vehicle ID");
        System.out.println("\n"+ fio.getHrs() + " hours parked from " + fio.getIn() +" am - " + fio.getOut() + " pm");
        System.out.println("$" + m.getCharge() +"0");

    }
    public void specialEvent(double charge){
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Special Event");
        System.out.println("$" + charge +"0");

    }


    public void lostTicket(double charge) {
        System.out.println("\nBest Value Parking");
        System.out.println("--------------------");
        System.out.println("Lost Ticket");
        System.out.println("$" + charge +"0");
    }
}

