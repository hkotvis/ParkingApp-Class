//Strategy

/**
 * LostTicketFeeCalc implements the CalcStrategy
 * Demonstrates the strategy pattern
 *
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class LostTicketFeeCalc implements CalcStrategy {

    /**
     * Gives the amount to charge for a lost ticket
     * @return double CHARGE which is final
     */
    @Override
    public double calculate() {
        final double CHARGE = 25;
        return CHARGE;
    }
}
