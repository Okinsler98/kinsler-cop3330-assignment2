/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex31.base;

//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

public class KarvonenHeartRate {

    public void displayHR (String restingHR, String age){
        System.out.format("%1s%15s\n", "Intensity", "Rate");
        for (int i = 55; i <= 95; i += 5){
            System.out.format("%d%s%20s bpm\n", i, "%",calculateHR(Integer.parseInt(restingHR), Integer.parseInt(age), i));
        }
    }

    public int calculateHR (double restingHR, double age, double intensity){
        double output = ((((220 - age) - restingHR) * (intensity / 100)) + restingHR);
        return (int) Math.round(output);
    }
}
