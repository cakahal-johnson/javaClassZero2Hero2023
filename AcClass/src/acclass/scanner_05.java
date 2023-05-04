/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

import java.util.Scanner;

/**
 *
 * @author Cakahal Johnson
 */
public class scanner_05 {
    scanner_05(){
        /*
        The java.util.Scanner class is a simple text scanner which can parse 
        primitive types and strings using regular expressions.Following are the 
        important points about Scanner −

A Scanner breaks its input into tokens using a delimiter pattern,
        which by default matches whitespace.

A scanning operation may block waiting for input.

A Scanner is not safe for multithreaded use without external synchronization.
        
        
        
        */
        
        /*
        Using Scanner in String Datatype
        Checking for Vowel or Consonant in Java 
        Note: Vowels are: a, e, i, o, u
        */
        
        char ch;
        int count= 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet");
        ch = scan.next().charAt(0);
        
        for(int i=0; i < 10; i++){
            if(ch == vowels[i]){
                count++;
                break;
            }
        }
        
        if(count == 0){
            System.out.println("\n" + ch+ " is a Consonant");
        }else{
            System.out.println("\n" +ch+ " is a Vowel");
        }
          
        
        // another way of this above code using Logical
        char chh;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an Alphabet");
        chh = sc.next().charAt(0);
        
        if(chh == 'a' || chh == 'e' || chh == 'i' || chh == 'o' || chh == 'u'){
            System.out.println("\n It is a Vowel");
        }else{
            System.out.println("\n it is a Consonant ");
        }
        
        
        // checking for int with scanner
        /*
        where we have a box 5kg is = N6
        where the kg is above 5kg start adding Tax
        then we add an extra charge of N1.2 for each kg
        
        so let convert using a scanner
        */
        
        float weight_kg, nCharge;
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter the weight of Box (kg): ");
        weight_kg = Sc.nextFloat();
        
        if(weight_kg < 5)
        {
            nCharge = 6;
        }
        else
        {
            weight_kg = weight_kg - 5;
            nCharge = (float)(6 + (weight_kg * 1.2));
        }
        System.out.println("\n The Box Charge is " + nCharge);
        
        
        
        // where the distance is less than or equal to 6km, cost is N4.2m
        //then above 6km we add Tax of N1.4 for each
        
        float dist, nBox;
        Scanner scc = new Scanner(System.in);
        
        System.out.println("Enter the Distance (in Km) of Parcel to ship: ");
        dist = scc.nextFloat();
        
        //here we use the If statement to check the conditions
        if (dist <= 6)
        {
            nBox = (float) 4.2; // 4.2 is cost of the each item
        }else
        {
            dist = dist - 6;
            nBox = (float)(6 + (dist * 1.4)); // where 1.4 is tax
        }
        System.out.println("\n The package charge is "+ nBox);
        
        
        
        
         // stage three of the same package code
//    where the charge is based on both weight and Distance
    /*
        b'cos some times we calculate the package base on the weight and the distance
    
    */
    //Yes b'cos you the last class just watch i will send you the code
    
    float weight, distance, cCharge;
    Scanner scann = new Scanner(System.in);
    
        System.out.println("Enter the weight of the Parcel (in Kg.): ");
        weight = scann.nextFloat();
        
        System.out.println("Enter the Distance of Parcel (in Kg.): ");
        distance = scann.nextFloat();
        
        //here we pass the conditional statement
        if(weight <= 5){
             cCharge = 6;
        }else{
            weight = weight - 5;
            cCharge = (float)(6 + (weight * 1.2));
        }
        
        // checking for distance
        if(distance <= 6){
            cCharge = cCharge + (float)4.2;
            
        }else{
            distance = distance - 6;
            cCharge = cCharge + ((float)(4.2 + (distance * 1.4)));
            
        }
        System.out.println("\n Courier Charge is " + cCharge);
        
        
        //how to print out TimesTable
        // 2 x 2 = 4
        int num = 2, v;
        System.out.println("\n ----Multiplication Table of 2x2-----");
        for(v=1; v <= 12; v++){
            System.out.println("num * v");
        }
        
        // stage two of 2x2
        int Num = 2, b =1;
        System.out.println("\n ----Multiplication Table of 2x2 stage2-----");
        while(b <= 12)
        {
            System.out.println(Num+" * " + b + " = " +(Num*b));
            b++;
           
        }
        
        
    
    
    
    
    //end of code line
    }
    
    
   
    
    
    
    
    
    
}
