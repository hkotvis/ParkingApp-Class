import java.io.IOException;

/**
 * CalcStrategy Interface demonstrates Strategy Pattern
 *
 *  @author Hailey Kotvis
 *  @version 2.0
 */
public interface CalcStrategy {
    /**
     * Method Calculate
     * @return double
     * @throws IOException
     */
    public double calculate() throws IOException;
}
