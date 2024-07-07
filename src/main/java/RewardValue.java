public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return convertMilesToCash(milesValue);
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    public int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}
