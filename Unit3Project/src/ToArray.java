import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;

public class ToArray {
    ArrayList<String> tickets = new ArrayList<>();
    TimeFactory tf = new TimeFactory();
    MinMaxFeeCalc m = new MinMaxFeeCalc();

    String hours = Integer.toString(tf.getHours());

    /**
     * Method toArray
     * This method adds the three variables (timeIn, timeOut, hours) to the tickets array on check in.
     * @throws IOException
     */
    public void toArray() throws IOException {
        tickets.add(Integer.toString(tf.getTimeIn()));
        tickets.add(Integer.toString(tf.getTimeOut()));
        tickets.add(Integer.toString(tf.getHours()));
        FileIO fio = new FileIO();
        fio.write(tickets);
    }

    public void toCheckIn() throws IOException{
        tickets.add(Integer.toString(tf.getTimeIn()));
        FileIO fio = new FileIO();
        fio.write(tickets);
    }

    public void toCheckOut() throws IOException{
        tickets.add(Integer.toString(tf.getTimeIn()));
        tickets.add(Integer.toString(tf.getTimeOut()));
        tickets.add(hours);
        tickets.add(Integer.toString(tf.getCharge()));//tf.getCharge()));
        tickets.add("C");
        FileIO fio = new FileIO();
        fio.write(tickets);

        CheckOut c = new CheckOut();
        c.displayCharge();

    }
    public void toSpecialEvent() throws IOException{
        tickets.add("S");
        FileIO fio = new FileIO();
        fio.write(tickets);
    }

    public void toLostTix() throws IOException{
        tickets.add("L");
        FileIO fio = new FileIO();
        fio.write(tickets);
    }
}
