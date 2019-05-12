import java.io.IOException;

/**
 * MinMaxFeeCalc class
 * This class is our calculator and extends the CheckOut class.
 * Creates an instance of our TimeFactory.
 * The variable charge is a double and represents how much money the person leaving the garage owes.
 * Demonstrates the strategy pattern.
 *
 * @author Hailey Kotvis
 * @version 2.0
 */
//Strategy
public class MinMaxFeeCalc {
    TimeFactory tf = new TimeFactory();
    FileIO fio = new FileIO();
   // int charge = 0;

    /**
     * MinMaxFeeCalc method
     * Uses the hours from TimeFactory to calculate charge.
     * @return double charge which is a double and represents how much money the person leaving the garage owes.
     */
    //public void MinMaxFeeCalc() throws IOException {

        //c.displayCharge(charge);
   // }
    public int getCharge() throws IOException{
        ToArray ta = new ToArray();
        int charge = 0;
        int hours = Integer.parseInt(ta.hours);

        if(hours <= 3){
            charge = 5;
            //System.out.println("$5.00");
            //checkIns.add(5);
        }
        else if (hours > 3 && hours < 13){
            charge = (hours - 3) + 5;

        }
        else{
            charge = 15;
        }
        return charge;
    }


}
