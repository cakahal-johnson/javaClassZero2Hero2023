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
public class ObjectClasses_07 {
    ObjectClasses_07(){
        /*
        Object-Oriented Programming: is a methodology or paradigm to design a program
        using classes and Objects
        
        Object: is the real world entities that has thier own properties and behaviours
        
        Classes: is the blueprint from which an objects properties and behaviours and decided
        
        Example:
        class of Dogs:            Properties:         Behaviour:
        local 404                  breed               eat()
                                   size                sleep()
                                   age                 run()
                                   color               bark()
        
        
        THE DIFFERENT B/W OOP AND PROCEDUAL PROGRAMMING
        * Botton Up Approach        Top Down Approach
        * Divided into Obejects     Divided into functions
        * Has Access Modifiers      Doesn' have Access Modifiers
        * Obj can move & comm       Data can move freely from function to function
          wt each other through     in the system
          member functions
        * More secure               Less secure 
        * Supports overloading      Don not support overloading
        
        ACCESS MODIFIERS
        The *Private acess modifiers: means that the only code inside the class can only 
        be access inside it's java field. 
        
        The Package access modifiers: this means that the only code inside the class itself, 
        or other classes in the same package, can access the field (you don't need to write it)
        
        The protected access modifiers: is also like the package modifiers, exceopt subclasses 
        of the class can also access the field, even if the subclass is not located in the same package.
        
        The Public access modifier: this means that the field can be accessed by all classes in your 
        Application
        
        
        
        */
        
 // using or calling out a function
  Human human = new Human();
      System.out.println(human.name);
      System.out.println(human.haircolor);
      
//   Human averta = new Human();
   
        
        
        
    }
} // here is where the OOP classes ends

//outside this class we add the Classes
class Human{
    public String name = "Cakahal Johnson";
    static String haircolor = "green";
    private String cloth = "Trouse";
    protected int age = 89;
}
