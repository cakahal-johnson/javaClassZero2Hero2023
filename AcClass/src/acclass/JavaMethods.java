/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        JAVA METHODS
            A method: is a block of code which only runs when it is called.
        you can pass data, known as parameters, into a method.
        
        Here Methods are used to perform certain actions, and they are also known as Functions
        
        Here is the reson we use Methods?
        to reuse code: define the code once, and use it many times
        
        Rules of Methods:
        A method must be declared within a class. it is defined with the name of the method,
        followed by parentheses().
        Here Java provides some pre-defined methods, such as System.out.println(),
        where you can also create your own methods to perform certain actions
        
        Example:
        public class main{
            static void myMethod(){
            ....code to be executed
        }
        }
        
        so what do we mean here:
        myMethod() = is the name of the method
        static = means that the method belongs to the Main class not an Object of the Main class.
            You will learn more about objects and how to access methods.
        void = means that this method does not have a return value.
        */
        myMethod();
                myMethod();
        myMethod();
        myMethod();
        
        System.out.println("here is for Parameters and Arguments");
        
        /*
        JAVA METHOD PARAMETERS
        Here information can be passed to methods parameter.
        This Parameters act as variables inside the method.
        
        Parameters are specified after the method name, inside the parentheses.
        you can add as many parameters as you want, just separate them with a comma.
        
        Example: here we have a method that takes a String called fname as parameter.
        when the method is called, we pass along a first name, which is used
        inside the method to print the full name:
        
        NB: when a parametr is passed to the method, it is called an argument.
            so, from the example above: fname is a parameter, while Ejike, Cakahal
        are Arguments
        
        */
        
        myFullname("Cakahal");
        myFullname("Ejike");
        
        System.out.println("Here is for Multiple Parameters");
        
        FullName("cakahal", 10);
        
        FullName("Ejike", 10);
        
        System.out.println("Here for Return Values");
        
        /*
        Here the void keyword, we used above indicates that the method should not return a value.
        if you want the method to return a value, you can use a primitive data type(such as int, char...)
        instead of void, and use the return keyword inside the method...
        
        */
        
        System.out.println(myMaths(3));
                System.out.println(myMaths(5));
        System.out.println(myMaths(20));
        System.out.println(myMaths(1000));
        
        System.out.println("Here for return Values for two parameters");
        
        System.out.println(myMath(1000, 652));

        
        checkAge(20); //call the checkAge method and pass along an age of 20 
        
        checkAge(17); //call the checkAge method and pass along an age of 17

        //here we call out the overLoad method
        int myNum = plusOverint(8, 5);
        double MyNum = plusOverint(4.3, 6.26);
        
        System.out.println("for int: " +myNum);
        System.out.println("for double: " +MyNum);
        
        /*
        JAVA RECURSION, ENCAPSULATION, POLYMORPHISM AND OOP
        
        RECURSION: is the technique of making a function call itself. This technique provides 
        a way to break complicated problems down into simple problems which are easier to solve.
        
        Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it...
        
        EXAMPLE: by adding two numbers together is easy to do, but adding a range of numbers is more complicated.
        we use recursion to break it down into the simple task of adding two numbers....
        
        
        */

           int result = sum(10);
           System.out.println(result);
           
           /*
           when the sum() function is called, it adds parameter k to the sum of all numbers 
           smaller than k and returns the result. when k becomes 0, the function just returns 0
           when running, the program follows these steps:
           10 + sum(9)
           10 + (9 + sum(8))
           10 + (9 + (8 + sum(7)))
           ....
           10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
           10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + + 0
           
           since the function does not call itself when k is 0, the program stops there and returns the result.
         
           NB: we use Haling Condition to stop infinte looping calling itself.... used ens and start keyword
           
           
                      JAVA ENCAPSULATION 

           this is to make sure that sensitive data is hidden from users to achieve this, 
           you must:
           ---declare calss variable/attributes as private
           ---provide public get and set methods to access and update the value of a private variable
           */
           Person myObj = new Person();
           myObj.setName("Cakahal Johnson");
           System.out.println(myObj.getName());
           
           /*
           Why Encapulation?
           --Better control of class attributes and methods
           --Class attributes can be made read-only(if you only use the get method), or write-only
                (if you only use the set method)
           --Flexible: the programmer can change one part of the code without affecting other parts
           ---Inceased security of data
           
           */
           
           /*
           POLYMORPHISM
           this means "many forms", and it occurs when we have many classes that are related to 
           each other by inheritance...
           
           like INHERITANCE lets inherit attributes and methods from another class.
           POLYMORPHISM uses those methods to perform different task. this allows us to perform a 
           single action in different ways
           
           for example think of a superclass called Animal that has a method called animalSound().
           Subclasses of Animals could be Pigs, cats, dogs, birds - And they also have 
           thier own implementation of an animal sound (the pig oinks, and the cat meows, etc)
           
           
           */

        
    }///main ends here**********
    
//    POLYMORPHISM Example outside the main
    
    public static int sum(int k){
        if(k > 0){
        return k + sum(k - 1);
        }else {
            return 0;
        }
    }
    //    A Methid with if...Else
    
    static void checkAge(int age){
//        if age is less than 18, print "access dendied"
        if (age < 18){
            System.out.println("Access denied - Your are not ole enough!");
        }else{ ///if age is greater than, or equal to, 18, print "access granted"
            System.out.println("Access granted - You are old enough!");
        }
        
    }
    
    //METHOD OVERLOADING:
//    with method overloading, multiple methods can have the same name with different parameters:
    static int plusOverint(int x, int y){
        return x + y;
    
    }
    
    static double plusOverint(double x, double y){
        return x * y;
    }
    
//    here is for the calling out a method
    static void myMethod(){
        System.out.println("Yea our code is working");
    }
    
    //    here is for the calling out a method with single Parameter

    static void myFullname(String fname){
        System.out.println(fname + " Johnson");
    }
    
    
    
        //    here is for the calling out a method with Multiple Parameter
    static void FullName(String fname, int age){
        System.out.println(fname + " is\t" +age);
    }
    
//    the return value section
    static int myMaths(int x){
        return 10 + x;
    }
    
    //    the return value with two parameters section
    static int myMath(int x, int y){
        return y - x;
    }
    

    
}
