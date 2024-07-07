public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }

    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    private double convertMilesToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }
}
