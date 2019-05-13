import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUNIT TEST for FileOutput
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class FileOutputTest {
    FileOutput fo = new FileOutput();

    @Test
    void getNumOfCheckIns() throws IOException {
        assertFalse(fo.getNumOfCheckIns() < 0, "Can not be less than 0");
    }
    @Test
    void getNumOfLostTix() throws IOException {
        assertFalse(fo.getNumOfLostTix() < 0, "Can not be less than 0");
    }
    @Test
    void getNumOfSpecialEvents() throws IOException {
        assertFalse(fo.getNumOfCheckIns() < 0, "Can not be less than 0");
    }

    @Test
    void getHrs() throws IOException {
        assertFalse(Integer.parseInt(fo.getHrs())< 0, "Can not be less than 0");
    }
    @Test
    void getIn() throws IOException {
        assertFalse( Integer.parseInt(fo.getIn()) < 0, "Can not be less than 0");
    }
    @Test
    void getOut() throws IOException {
        assertFalse(Integer.parseInt(fo.getOut())< 0, "Can not be less than 0");
    }
//Might need to move bottom 2
    @Test
    void getTotal() throws IOException {
        assertFalse((fo.getTotal())< 0, "Can not be less than 0");
    }
    @Test
    void getCash() throws IOException {
        assertFalse(Integer.parseInt(fo.getCash())< 0, "Can not be less than 0");
    }
}
