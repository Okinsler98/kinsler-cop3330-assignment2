/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex26.base;

import java.lang.Math;
import java.text.DecimalFormat;

public class PaymentCalculator {
    public String calculateMonthsUntilPaidOff(String balance, String apr, String monthlyPayment){
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setGroupingUsed(false);

        int balVal = Integer.parseInt(balance);
        double aprRate = ((Double.parseDouble(apr) / 100) / 365);
        int monthPay = Integer.parseInt(monthlyPayment);

        double result = (-0.0334 * Math.log(1 + ((balVal / monthPay) * (1 - Math.pow((1 + aprRate), 30))))) / (Math.log(1 + aprRate));

        df.setMaximumFractionDigits(0);

        return df.format(result);
    }
}
