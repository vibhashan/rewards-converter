import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

public class RewardValueTests {
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.0000");

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / RewardValue.CONVERSION_RATE);

        assertEquals(expectedMilesValue, new RewardValue(cashValue).getMilesValue());
        assertEquals(decimalFormat.format(cashValue / expectedMilesValue),
                decimalFormat.format(RewardValue.CONVERSION_RATE));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        double expectedCashValue = milesValue * RewardValue.CONVERSION_RATE;

        assertEquals(expectedCashValue, new RewardValue(milesValue).getCashValue());
        assertEquals(decimalFormat.format(expectedCashValue / milesValue),
                decimalFormat.format(RewardValue.CONVERSION_RATE));
    }
}
