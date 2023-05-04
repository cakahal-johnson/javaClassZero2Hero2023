/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsclass;

/**
 *
 * @author Cakahal Johnson
 */

///======================here=========================

///Textual Repersentation of an Object
//NB:   what we write in class is the property of object as we describe the object
class Product{
    ///Attributes
    int pid; ///making attribute private
    String name;
    int price;
    
    ///Constructor
    Product(){
        System.out.println(">> Product Object Construted");
    }
    
    ///Methods (Behaviour)
    ///To write data in Product Object we have this method
///if you want anything which should belong to class make it static!!
    void setProductDetails(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">>> Data Written in Product Object");
    }
    
    ////To read from Product Object
    void showProductDetails(){
        System.out.println("-----Product ID: "+pid+"------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("--------------------------");
        
    }
    
    /////when using private ////
    
    ///Setter
    void setPid(int pid){
        this.pid = pid; //this means reference to current object
        ////LHS belongs to the Object and RHS belongs to method
    }
    
    ///Getter
    int getPid(){
        return pid;
    }
}
//=====constructor====
class Mobile extends Product{///IS-A Relation. Mobile IS-A Product, Mobile is child, Product is Parent
    //additional attribute of mobile other than the product
    String Os;
    int ram;
    int sdCardSize;
    
    
    Mobile(){
        System.out.println(">> Mobile Object Constructed");
    } 
    
    //we have redefined the same method from the parent into the child with different inputs
    //we have now 2 methods in the child, 1 from Parent and 1 of child
    //both are different as in based on inputs (even though name is same)
    //Method Overloading : same method name with different inputs
    void showProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize){
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.Os = os;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">>> Data Written in Product Object");
        
    }
    
    ///Lets Redefine showProductDetails as well
    ///but hhere we have same inputs
    ///2 methods, 1 from parent 1 in child and we have same signatures!!
//    the child methods will be executed and not the parent method
    ///METHOD OVERRIDING : same method Name with same Inputs in Parent Child Relationship
    @Override
    void showProductDetails(){
        System.out.println("-----Product ID: "+pid+"------");
        System.out.println("Name:\t"+name);
        System.out.println("Price:\t"+price);
        System.out.println("OS:\t"+Os);
        System.out.println("RAM:\t"+ram);
        System.out.println("SDCard:\t"+sdCardSize);
        
        System.out.println("--------------------------");
        
    }
    
}

//======main====
public class OOpsClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         ///Create an Object :
        Product product1 = new Product();
        ///product is not an Object its a reference variable which holds the hashCode of the
        ///object in a hexadecimal notation
        System.out.println("product1 is: "+product1);///off for direct writing
        ///Writing data in Object
        product1.setProductDetails(101, "iPhone", 2500);
        
       ////Reading data from Object
        product1.showProductDetails();
        
        System.out.println();///to give out space
        
        //======write the data directly=======
        Product product2 = new Product();
        product2.pid = 201; ///comment when mark private
        product2.setPid(302);
        product2.name = "Nike Shoes";
        product2.price = 5000;
        product2.showProductDetails();
                */
        
        //Requesting to get mobile object constructed!!!
        
       Mobile mobile = new Mobile();
       ///Product Object gets contructed before the mobile Object >>> Rule to Inhertance (Object to object)
       
//       mobile.setProductDetails(301, "iPhoneX", 5000);
//       mobile.showProductDetails();
       
        System.out.println("Overloading below");
        
        mobile.showProductDetails(501, "iPhoneX", 6000, "iOS", 64, 128);
        mobile.showProductDetails();
    }
    
}
