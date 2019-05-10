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
    FileIO tf = new FileIO();
    double charge = 0;

    /**
     * MinMaxFeeCalc method
     * Uses the hours from TimeFactory to calculate charge.
     * @return double charge which is a double and represents how much money the person leaving the garage owes.
     */
    //public void MinMaxFeeCalc() throws IOException {

        //c.displayCharge(charge);
   // }
    public double getCharge() throws IOException{
        CheckOut c;
        String number = tf.getHrs();
        int result = Integer.parseInt(number);
        if(result <= 3){
            charge = 5;
            //System.out.println("$5.00");
            //checkIns.add(5);
        }
        else if (result > 3 && result < 13){
            int pay = (result - 3) + 5;
            //System.out.println("$" + pay +".00");
            charge = pay;
            // checkIns.add(pay);
        }
        else{
            charge = 15;
            //System.out.println("$15.00");
            //checkIns.add(15);
        }
        return charge;
    }


}
