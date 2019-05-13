import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;

/**
 * ToArray has an arraylist of tickets and moves things from the array to the file
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class ToArray {
    ArrayList<String> tickets = new ArrayList<>();
    TimeFactory tf = new TimeFactory();
    String hours = Integer.toString(tf.getTimeHours());

    /**
     * Constructor
     * @throws IOException
     */
    public ToArray() throws IOException {}

    /**
     * Method toArray
     * This method adds the three variables (timeIn, timeOut, hours) to the tickets array on check in.
     * @throws IOException
     */
    public void toArray() throws IOException {
        tickets.add(Integer.toString(tf.getTimeIn()));
        tickets.add(Integer.toString(tf.getTimeOut()));
        tickets.add(Integer.toString(tf.getTimeHours()));
        FileInput fi = new FileInput();
        fi.write(tickets);
    }

    /**
     * Check in with just time in
     * @throws IOException
     */
    public void toCheckIn() throws IOException{
        tickets.add(Integer.toString(tf.getTimeIn()));
        FileInput fio = new FileInput();
        fio.write(tickets);
    }

    /**
     * Checkout gets time in, out, hours, and charge along with writing a "C" so we know it's a checkout
     * @throws IOException
     */
    public void toCheckOut() throws IOException{
        tickets.add(Integer.toString(tf.getTimeIn()));
        tickets.add(Integer.toString(tf.getTimeOut()));
        tickets.add(hours);
        tickets.add(Integer.toString(tf.getTimeCharge()));//tf.getCharge()));
        tickets.add("C");
        FileInput fio = new FileInput();
        fio.write(tickets);

        CheckOut c = new CheckOut();
        c.displayCharge();

    }

    /**
     * Special event just adds "S" to tickets in order to add it to file
     * @throws IOException
     */
    public void toSpecialEvent() throws IOException{
        tickets.add("S");
        FileInput fio = new FileInput();
        fio.write(tickets);
    }

    /**
     * Lost Tickets just adds "L" to tickets in order to add it to file
     * @throws IOException
     */
    public void toLostTix() throws IOException{
        tickets.add("L");
        FileInput fio = new FileInput();
        fio.write(tickets);
    }
}