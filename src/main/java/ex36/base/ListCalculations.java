/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex36.base;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ListCalculations {
    DecimalFormat df = new DecimalFormat();

    public double avarage(ArrayList array){
        double output = 0;
        for (int i = 0; i < array.size(); i++){
            output += Double.parseDouble((String) array.get(i));
        }
        output = output / array.size();
        return output;
    }

    public double max(ArrayList array){
        double output = Double.parseDouble((String) array.get(0));
        for (int i = 1; i < array.size(); i++){
            if (output < Double.parseDouble((String) array.get(i)))
            output = Double.parseDouble((String) array.get(i));
        }
        return output;
    }

    public double min(ArrayList array){
        double output = Double.parseDouble((String) array.get(0));
        for (int i = 1; i < array.size(); i++){
            if (output > Double.parseDouble((String) array.get(i)))
                output = Double.parseDouble((String) array.get(i));
        }
        return output;
    }

    public double std(ArrayList array){
        df.setMaximumFractionDigits(2);

        Double deviations[] = new Double[array.size()];
        double output = 0;

        double average = avarage(array);

        //Find deviation from average
        for (int i = 0; i < array.size(); i++){
            deviations[i] = Double.parseDouble((String) array.get(i)) - average;
        }

        //Square deviations from average
        for (int i = 0; i < deviations.length; i++){
            deviations[i] = Math.pow(deviations[i], 2);
        }

        //Calculate sum of deviations
        for (int i = 0; i < deviations.length; i++){
            output += deviations[i];
        }

        output = output / (deviations.length);      //Find variance
        output = Math.sqrt(output);                     //Standard Deviation
        return Double.parseDouble(df.format(output));
    }
}
