public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertCashToMiles() {
        return (int) (cashValue / CASH_TO_MILES_CONVERSION_RATE);
    }

    public double convertMilesToCash() {
        return milesValue * CASH_TO_MILES_CONVERSION_RATE;
    }
}
