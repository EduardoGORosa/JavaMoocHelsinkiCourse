/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Fitbyte {
    private int age;
    private int heartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.heartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (((206.3 - (0.711 * this.age))- this.heartRate) * (percentageOfMaximum) + this.heartRate);
    }
}
