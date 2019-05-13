import java.io.IOException;

/**
 * Interface with two methods, displayCharge() and displayScreen()
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public interface Garage {
    /**
     * @throws IOException
     */
    void displayCharge() throws IOException;

    /**
     * @return boolean (for looping purposes)
     * @throws IOException
     */
    boolean displayScreen() throws IOException;
}
