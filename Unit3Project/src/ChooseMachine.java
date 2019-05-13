import java.io.IOException;

/**
 * Uses Singleton- MachineType
 * @author Hailey Kotvis
 * @version 2.0
 */
public class ChooseMachine {
    enum MeasurementSystem {CHECKIN, CHECKOUT};

    /**
     * Takes user to the correct machine (Checkin screen or Checkout screen)
     * @param measurementSystem
     * @return boolean flag (keeps looping work for the program)
     * @throws IOException
     */
    public static boolean choose(MeasurementSystem measurementSystem) throws IOException {
        boolean flag= false;
        if (measurementSystem == MeasurementSystem.CHECKIN) {
            CheckIn c = new CheckIn();
            c.displayScreen();
        }
        else if (measurementSystem == MeasurementSystem.CHECKOUT){
            CheckOut o = new CheckOut();
            flag = o.displayScreen();
        }
        return flag;
    }
}
