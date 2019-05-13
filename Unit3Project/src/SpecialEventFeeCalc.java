//Strategy

/**
 * Demonstrates the strategy pattern with calculate method
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class SpecialEventFeeCalc implements CalcStrategy{

    /**
     * This shows the amount to charge for special event parking
     * @return double CHARGE
     */
    @Override
    public double calculate() {
        final double CHARGE = 20;
        return CHARGE;
    }
}
