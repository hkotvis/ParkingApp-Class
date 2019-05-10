import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 * Time Factory
 * ArrayList called tickets that will keep track of time in, time out, and hours parked
 * timeIn is an int generated randomly between 7 and 12
 * timeOut is an int generated randomly between 1 and 11
 * hours represents the number of hours parked (a calculation)
 *
 * @author Hailey Kotvis
 * @version 2.0
 */
public class TimeFactory {
    ArrayList<String> tickets = new ArrayList<>();

    Random rand = new Random();
    int timeIn= rand.nextInt(6) + 7;  // Obtain a number between [7 - 12].
    int timeOut= rand.nextInt(11) + 1; //  obtain num between 1 and 11
    int hours; // number of hours parked

    /**
     * timeIn is an int generated randomly between 7 and 12
     * @return timeIn
     */
    public int getTimeIn(){
        return timeIn;
    }

    /**
     * timeOut is an int generated randomly between 1 and 11
     * @return timeOut
     */
    public int getTimeOut(){
        return timeOut;
    }

    /**
     * hours represents the number of hours parked (a calculation)
     * @return hours
     */
    public int getHours(){
        hours = (12 - timeIn) + timeOut;
        return hours;
    }

    /**
     * Method toArray
     * This method adds the three variables (timeIn, timeOut, hours) to the tickets array on check in.
     * @throws IOException
     */
    public void toArray() throws IOException {
        tickets.add(Integer.toString(getTimeIn()));
        tickets.add(Integer.toString(getTimeOut()));
        tickets.add(Integer.toString(getHours()));
        FileIO fio = new FileIO();
        fio.write(tickets);
    }

    public void toCheckIn() throws IOException{
        tickets.add(Integer.toString(getTimeIn()));
        tickets.add("0"); //unknown time out
        tickets.add("0"); //unknown hours
        tickets.add("C");
        FileIO fio = new FileIO();
        fio.write(tickets);
    }
    public void toSpecialEvent() throws IOException{
        tickets.add("S");
        FileIO fio = new FileIO();
        fio.write(tickets);
    }

}
