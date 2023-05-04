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
public class ControlStatement_05 {
    ControlStatement_05(){
        
        /*
        ControlStatement:
        these helps to output an additional controls to our codes
        it's all about decision making, 
        
        JAVA CONDITIONAL STATEMENT:
       1)     if (sets the condition)
            if-else (adds additional conditions)
        else (is the default what happen if the condition is not meant)
        
        2)  Switch cases:
        
        3) for loop:
        
        4) while loop:
        
        5) do-while loop
        
        6) break control
        
        7) continue control
        
        8) return
        
      
        
        */
        
//        SECTION 1(if statements)
        /*
        if statement: is used to specify a block of code to be executed, if a 
        statement specified condition is true
        
        else if: is to specify a new conditipon to test, if the first condition is false
        
        else: is use to specify a block code to be, if the same condition is false
        this else ends every line of an if statement
        
        */
        
        int age = 18;
        
        
        //check if someone less than 18 can vote
        if(age > 18){
            System.out.println("Yea you're Old enough to vote");
        }else if(age >= 18){
            System.out.println("Wow is your now 18");
        }else{
             System.out.println("Opps! Sorry you'rew not old enough");
        }
        
        int password = 123456;
        int confirm_password = 1234567;
        
        if(password == confirm_password){
            System.out.println("Correct Password");
        }else if(password >= confirm_password){
            System.out.println("Correct Password");
        }
        else{
            System.out.println("please re-check your password");
        }
        
        int time = 22;
        
        if (time < 12){
            System.out.println("Good Morning");
        }else if (time >=12 && time <= 16){
            System.out.println("Good Afternoon");
        }else if(time >= 17 && time <= 22){
            System.out.println("Good Night");
        }else{
            System.out.println("it's too late to greet");
        }
        
        //where we have conditions we lambda function
        float money = 1000;
        String bal = (money < 900) ? "you cant withdraw" : "your bal is too low";
        System.out.println(bal);
        
        /*
        section 2 Switch Statement
        
        rules: the switch expression is evaluated once,
                the value of the expression is compared with the value of each case,
                if there is a match, the associated block of code is executed
        then: the Break is end the code block
        where the default as keyword and is also optional
        
        */
        
        int days = 2;
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
                
            default:
                System.out.println("weekend");
        }
        
        // Scanner
        /*
            scanner ios used to test a user interface in the terminal
            to use scanner we need import scanner
        
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Here Enter Your Day TIme");
        time = sc.nextInt();
        
         if (time < 12){
            System.out.println("Good Morning");
        }else if (time >=12 && time <= 16){
            System.out.println("Good Afternoon");
        }else if(time >= 17 && time <= 22){
            System.out.println("Good Night");
        }else{
            System.out.println("it's too late to greet");
        }
         
         // use scanner to create a function 
        
            
    }
    
}
