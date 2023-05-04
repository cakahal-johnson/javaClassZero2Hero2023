/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class shutDown {
    shutDown(){
        
        /* Shutdown Computer after 5 second*/
        //we need import java.io.*;
        Runtime runtime = Runtime.getRuntime();
        try {
            System.out.println("Shutting down the Pc after 5 seconds ");
            runtime.exec("shutdown -s -t 5"); // -s shutdown -r reset while -t is the time interval 5 per second
            
        } catch (Exception e) {
            System.out.println("Excetion: "+e);
        }
        
        // using scanner 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Number of Seconds: ");
        int seconds = scan.nextInt();
        Runtime r = Runtime.getRuntime();
        try {
            System.out.println("Shutting down the PC after " + seconds+ "seconds. ");
            r.exec("shutdown -s -t " +seconds);
        } catch (Exception e) {
            System.out.println("Exception: " +e);
        }
        
        // Restart the Computer
        Runtime y = Runtime.getRuntime();
        try {
            y.exec("shutdown -r -t 5");
            System.out.println("Restarting the computer after 5 seconds. ");
        } catch (Exception e) {
            System.out.println("Exception: " +e);
        }
        
    }
}
