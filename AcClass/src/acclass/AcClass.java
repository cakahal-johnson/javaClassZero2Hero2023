/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

import AcAssignments.intro_Assignment;

/**
 *
 * @author Cakahal Johnson
 */
public class AcClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Cakahal Johnson";
        int age = 70;
        
        // Java Comments: is use for documentation of our line code which will be active in the code
        /*
        we have types of java comments:
        -- Single comment: uses // at begining of the text which we use a shortcut Ctrl / key
        ---Double Comments(multi-line comment): use / * * / and also with the shortcut cut Ctrl / key as well
        */
        
//        today topic is output;
//        System.out.println(name); //LN in small case
       // System.out.print(age); // here without LN case
//        System.out.println("");
        
        // Outputting with .println: which breaks the into Newline
        System.out.println(name);
        System.out.println(age);
        
         // Outputting with .print: which do not breaks the into Newline, the whole print is inline formater
        System.out.print(name);
        System.out.print(age);
        
        
        // Connetion with parent page(main) and childClass(other pages)
        // two ways: holding as a variable and using the new keyword
      //  variables var = new variables(); // first way of connection pages
        // checking if connected we use Crtl + click on the page name()
        
        intro_Assignment ia = new intro_Assignment();
        
        System.out.println(ia.NAME);
        System.out.println(ia.AGE);
        
//                new variables();
        
//        Operators op = new Operators();
//        new Operators();
        
//        new StringMethod_04();
//        new ControlStatement_05();
//        new scanner_05();
//        new shutDown();
//        new javaIO();
        
        new ObjectClasses_07();


        

    }
    
}
