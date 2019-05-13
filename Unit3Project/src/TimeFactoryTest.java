import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUNIT TEST- TimeFactory
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
class TimeFactoryTest {
    @Test
    void getTimeHours() throws IOException {
        TimeFactory tf = new TimeFactory();
        assertFalse(tf.getTimeHours() < 1 && tf.getTimeHours() > 16, "The hours can not be less than 1 or more than 16");
    }
    @Test
    void getTimeCharge() throws IOException {
        TimeFactory tf = new TimeFactory();
        assertFalse(tf.getTimeCharge() < 5 && tf.getTimeCharge() > 15, "The charge can not be less than 5 or more than 15");
    }

}
