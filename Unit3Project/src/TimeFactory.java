import java.io.IOException;
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

    Random rand = new Random();
//    MinMaxFeeCalc m = new MinMaxFeeCalc();
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
    public int getCharge() throws IOException{
        int charge = 0;
        int hours = getHours();

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
