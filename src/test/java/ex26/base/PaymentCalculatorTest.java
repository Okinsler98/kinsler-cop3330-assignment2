package ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_months_till_paid() {

        PaymentCalculator paymentCalc = new PaymentCalculator();

        String actual = paymentCalc.calculateMonthsUntilPaidOff("5000", "12", "100");
        String expected = "70";

        assertEquals(expected, actual);
    }
}