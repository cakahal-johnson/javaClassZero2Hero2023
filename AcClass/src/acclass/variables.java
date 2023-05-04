/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

/**
 *
 * @author Cakahal Johnson
 */
public class variables {
   variables(){
       // TODO Application Codes here
       System.out.println(".");
       System.out.println("Here Starts the second page!");
       
//       here starts the second pages;
       
        String Name = "Johnson";
    System.out.println(Name);
    
    /*
        Definition of Java:
        Java is first of all programming lang. and also a platform. it is a high level,
        secured and object oriented programming language
    
        it is a platform b'cos it has it's own runtime environment (JRE)\
    
    NB: Any hardware or software environment in which a program runs is reffered as a platform
    */
    
    /*
    Definition of A VARIABLE
    is a memory control like a container for storing data values
    
    TYPES OF VARIBALES
    Primitive dataType and Non-Primitive dataType
    
    PRIMITIVE: are predefined types of data, which are supported by the programming Language
    Example: integer, string, characters
    
    List of Java Primitives:
    String: for storing text, such as "Holy molly", String values are surrounded by double quotes or single
    int: for storing integers(whole numbers), without decimals, eg: 123456789 or -123456789 without quotes
    float: this stores floating point numbers, with decimal such as 19.99 or -19.99
    char: stores single character such as 'a' or 'b'. char calues are surrounded by single quotes only
    boolean: stores values with two states: true or false
    
    NON-PRIMITIVE: these are not defined by the programming language, but are instead created by the programmer
    Example: they are referes as "Reference variables"
    NB: or "Object reference" since they reference a memory location, which stores data.
    
    
    NB: Syntax:
    dataType(primitives) Reference (variable) =(assigning) "value"; (what to store in the memory of the Object reference)
    */
    
    String myStudent = "Ari Chix John Uba cakahal";
       System.out.println(myStudent); // this is for String values
       
    int count = 1000;
       System.out.println(count); // this is for Number values
    
//    int Age = "1000";
//       int Age = "hello";
//       String Age = 10;
       
     float Money = 10;
       System.out.println(Money); // this is for float which use for decimal
       
     double money = 99;
       System.out.println(money); // this is for double which is also for decimal
       
     char initial = 'C';
       System.out.println(initial); // this is for cutting put initial characters
       
     boolean areYouMarried = true;
       System.out.println(areYouMarried); // this is for conditional statements
       
     /* CONCATINATION: means joining variables together by using the + sign; */
 
       System.out.println("The list of my students: "+ myStudent + " we are a total of: "+ count +" students");
       
       // working with number concatination'
       float cr = 20000;
       float dr = 13000;
       float bal = cr - dr;
       System.out.println(bal);
       System.out.println("Here is Your balance: "+ bal);
       
       float dp = 5000; // add this to get me a bal of 15k still using cr dr and bal
       // ToDo code here
       
       
       int x = 5, y = 8, z = 225;
       int result = x - y * z;
       System.out.println(result);
       int answer = z - y;
       System.out.println(answer);
       System.out.println( x + y);
       
       
       /* final variables: however, you can add the final keyword if you don't
        want others (or yourself) to overwrite existing values
       (this will declare the variable as "final"
       or "constant", which means unchangeable and read-only)
       */
       
       final int num = 15; // assigning
      // num = 25; // error b'cos final keyword is used, no .re-assigning
       System.out.println(num);
       
       int Num = 25; // assigning
       Num = 30; // yes you can reAssign b'cos final keyword not in use
       System.out.println(Num);
       
       /*
        Rules of Java variables:
       -- All variables MUST start with a primitive dataType
       -- Names can contain letters, digits, underscores, and a dollar signs
       -- Names must begin with a letter or signs as memtioned above
       -- Names should start with a lowercase or upper letter but without white-space
       -- Names are VERY very case SENSITIVE
       --- Names like Reserved word (like java keywords or primitive 
           such as int String boolean... ) can NOT be used as assigning Variables...
       
       " " my name = white-space
       */
       
   }
    
}
