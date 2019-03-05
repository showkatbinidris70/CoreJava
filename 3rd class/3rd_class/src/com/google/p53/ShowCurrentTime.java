/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.p53;

/**
 *
 * @author User
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMillseconds = System.currentTimeMillis();
        long totalSeconds = totalMillseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is" + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT+6");
    }
    
}
