import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class TimeFactoryTest {

    @Test
    void getHours() {
        TimeFactory tf = new TimeFactory();
        assertFalse(tf.getHours() < 1 && tf.getHours() > 16, "The hours can not be less than 1 or more than 16");
    }

    @Test
    void toArray() {

    }
}