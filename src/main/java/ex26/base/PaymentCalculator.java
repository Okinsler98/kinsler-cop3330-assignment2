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
        df.setMaximumFractionDigits(2);
        df.setGroupingUsed(false);

        double b = Double.parseDouble(df.format(Double.parseDouble(balance)));
        double i = Double.parseDouble(apr) / 365;
        double p = Double.parseDouble(df.format(Double.parseDouble(monthlyPayment)));
        double result = -(1/30) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i);

        df.setMaximumFractionDigits(0);

        return df.format(result);
    }
}
