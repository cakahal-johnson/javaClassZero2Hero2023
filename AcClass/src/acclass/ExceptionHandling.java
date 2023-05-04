/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graclass;

/**
 *
 * @author Cakahal Johnson
 */
public class ExceptionHandling {
    ExceptionHandling(){
        
        /*ExceptionHandling is an error that occurs during the running of a program.
        which Java facilitates the management of such errors by diverting control to special program
        blocks that execute when the errors occur...
        
        type of ExceptionHandling:
        unchecked and checked 
        */
        
//        string name = "cakahal"; eg. for checked errors
        
        /*
        to use the unchecked ExceptionHandling we throw a TRY and Cateh statement
        
        Syntax
        try{
        here you wirte your blocks of code to try
        }catch(Exception e){
            here is for code to handle errors
        }
        finally:
        
        NB: Exception e holds all the type of an errors in catch methods while we can
        select the type of exception we want to check 
        eg. for INT you can use (NumberFormatException nfe)
        
        The classes of java Exception which needs to be import
        java.lang.Object
        java.lang.Throwable
        java.lang.Exception
        java.lang.RuntimeException
        java.lang.IllegalArgumentException
        java.lang.NumberFormatException
        
        */
        
        System.out.println("hey");
//        
//        int[] myNumber = {1,2,3};
//        System.out.println(myNumber[10]);
//        
//        System.out.println("hi");
        
        try{
            int[] myNumber = {1,2,3};
            System.out.println(myNumber[10]);
        }catch(Exception e){
            System.out.println("something went wrong.");
        }
        
        System.out.println("hi");
        
            checkAge(19); // Set age to 15 (which is below 18...)
            
            System.out.println(printAnumber());
          
        
    }
    
    static void checkAge(int age) {
        if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }else if(age > 20){
            System.out.println("Access granted");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }
      }
    
    private static int printAnumber(){
        try{
            return 3;
        }catch (Exception e){
            return 4;
        }finally{
            return 5;
        }
    }
    
}
