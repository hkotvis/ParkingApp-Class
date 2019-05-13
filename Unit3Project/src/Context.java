import java.io.IOException;

/**
 * Class Context to use strategy
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class Context {
    private CalcStrategy strategy;

    /**
     * Constructor
     * @param strategy
     */
    public Context(CalcStrategy strategy){
        this.strategy = strategy;
    }

    /**
     *
     * @return double (strategy.calculate())
     * @throws IOException
     */
    public double executeStrategy() throws IOException {
        return strategy.calculate();
    }
}
