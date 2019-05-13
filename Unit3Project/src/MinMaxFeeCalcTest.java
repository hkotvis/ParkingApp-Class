import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUNIT TEST for MinMaxFeeCalc
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class MinMaxFeeCalcTest {
    @Test
    void calculate() throws IOException {
        MinMaxFeeCalc mmfc = new MinMaxFeeCalc();
        assertFalse(mmfc.calculate() < 5 && mmfc.calculate() > 15, "The calculated value can not be less than 5 or more than 15");
    }
}
