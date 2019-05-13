import java.io.IOException;

/**
 * MinMaxFeeCalc class implements CalcStrategy
 * This class is our calculator and extends the CheckOut class.
 * Creates an instance of our TimeFactory.
 * The variable charge is a double and represents how much money the person leaving the garage owes.
 * Demonstrates the strategy pattern.
 *
 * @author Hailey Kotvis
 * @version 2.0
 */
public class MinMaxFeeCalc implements CalcStrategy{
    ToArray ta = new ToArray();
    FileOutput fo = new FileOutput();
    TimeFactory tf = new TimeFactory();

    /**
     * Constructor
     * @throws IOException
     */
    public MinMaxFeeCalc() throws IOException {}


    /**
     *Calculates how much someone owes
     * @return double charge which is how much to charge someone based on hours parked
     * @throws IOException
     */
    @Override
    public double calculate() throws IOException {
        double charge = 0;
        int hours = (tf.getTimeHours());

        if(hours <= 3){
            charge = 5;
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
