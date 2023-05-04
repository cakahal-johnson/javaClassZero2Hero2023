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
public class Operators {
    Operators(){
        
        /*
            Operators are used to perform operations on variables and vlaues.
        
        GROUPS OF JAVA OPERATORS:
            ARITHMETIC OPERATORS
            ASSIGNMENT OPERATORS
            COMPARISON OPERATORS
            LOGICAL OPERATORS
            BITWISE OPERATORS
        */
        
        /*
                ARITHMETIC OPERATORS

        
            + - * / BASIC operators
        
        % (Modulus) : Divides left-hand operand by right-hand operand and returns remainder
        
        ++(Incerment) : Inceases the values of operand by 1 
        --(Decerment) : Deceases the values of operand by 1 

        
        
        */

        
        System.out.println("example of a Modulus");
        int a = 10;
        int b = 20;
        
        System.out.println(b%a); // 0
        System.out.println(11%2); // returns 1 b'cos 2 by 10 is equal remaining 1 which is modulus
        
        System.out.println(10%2); // 0
        
        System.out.println(b++); //21
        System.out.println(b--); //19
        
        System.out.println(++a); // 11
        System.out.println(--a); // 09
        
        
        /*
            Relational Operators Boolen returns true or false
        Conditional Statements
        
        == (equal to) : Checks if the values of two operands are equal or not, 
                        if yes then condition becomes true
        
        != (not equal to) :  Checks if the values of two operands are equal or not,
                            if values are not equal than condition becomees true
        
        > (greater than) :  Checks if the values of two operands, is greater 
                            returns true
        
        < (less than) :  Checks if the values of two operands, is lesser 
                            returns true
        
        >= (greater than or equal to) :  Checks if the values of two operands, is greater or equal to
                            returns true
        
        <= (greater than or equal to) :  Checks if the values of two operands, is less or equal 
                            returns true
        
        */
        
        System.out.println("Conditional Statements");
        System.out.println(a == b); // is not true so fales returns
        System.out.println(a != b); // is true so ture returns
        
        System.out.println(a > b); // not true
        System.out.println(a < b); // not true
        
        System.out.println(a >= b); // is not true
        System.out.println(a <= b); // is true

        
        /*
            Logical Operation
        let assume we have boolean where one is true and other is false
        Syntax:
        && (logical and) : works is both the operands are non-zero the the condition becomes true
        
        || (logical or) : if any of the two operands are non-zero then the condition becomes true
        
        ! (logical not): use to reverses the logical state of its operand is a 
                            condition is ture then logical NOT operand will make false
        
        */
        
        System.out.println("Logical Operators");
        Boolean A = true;
        Boolean B = false;
        
        System.out.println(A && B); // is false
        
        System.out.println(A || B); // is true
        
        System.out.println(!(A && B)); //is true
        
        /*
        Assignment Operators 
        
        = (Assign values)
        
        += (it adds to assign values)
        
        -= (it subtract to assign values)
        *= (it multiply to assign values)
        /= (it divide to assign values)
        
                %= (it solves modulus to assign values)

        <<= (Left shift AND assignment operator)

        >>= (Right shift AND assignment operator)


        &= Bitwise AND assignments operators
        
        ^= bitwise exclusive Or and assignment operator
        
        |= bitwise inclusive OR and assignment operator
        
        
        */
        
        int x = 10;
        int y = 20;
        int z = 0;
        
        int New = x + y;
        System.out.println("using = sign as assignment operator New = " + New);  // 30
        
        New += x;
        System.out.println("where new is assigned to x " + New); //30 + 10 = 40
        
        New -= y;
        System.out.println("where new is assigned to y " + New); // 10,
        
        New *= y;
        System.out.println("where new is assigned to y " + New); // 60, 600,
        
        
        x = 10;
        New = 15;
        New /= x;
        System.out.println("where x is divided by New " + New); //0.5, 1
        
        
        New %= x;
        System.out.println("where we find remainded " + New); //5, 1
        
        New <<= 2;
        System.out.println("where we use Left shift AND assignment operator <<= sign " + New); //4
        
        New >>= 2;
        System.out.println("where we use Left shift AND assignment operator >>= sign " + New); //
        
        
        New >>= 2;
        System.out.println("where we use Left shift AND assignment operator >>= sign2 " + New); //
        
        New &= x;
        System.out.println("where Bitwise AND assignments operators " + New);
        
        New ^= x;
        System.out.println("where bitwise exclusive Or and assignment operator " + New);
        
        New |= x;
        System.out.println("where bitwise inclusive OR and assignment operator " + New);
        
        
        // BITWISE OPERATORS
        /*
            Assume if i = 60 and p = 13;
            
        we use integer types, long, int, short, char and byte
        
        
        */
        
        // converting to binary
        int i = 60 ; // 0011 1100;
        int p = 13;   //0000 1101;
        int u = 0;
        
//        & (bitwise and ) : Binary AND Operator copies a bit to the result if it exists in both operands 
        int ans = i & p;
        System.out.println("bitwise of &: " + ans); // 0000 1100 is binary in 12
        
//    | (bitwise or) : Binary OR operator copies a bit if it  exists in either operand        
        ans = i | p;
        System.out.println("bitwise of Or " + ans); //  0011 1101 is binary of 61
        
 
//      ^ (bitwise XOR) : Binary XOR Operator copies the bit if it is set in one operand but not both
        ans = i ^ p;
        System.out.println("bitwise of XOR "+ ans); // 0011 0001 is bianry of 49
        
 //      ~ (bitwise compliment) : Binary Ones Complement Operator is unary and has the effect of flipping bits
        // which compliment form due to a signed binary number
        
        ans = ~i;
        System.out.println("compliment sign ~ is: " + ans); // -61 = 1100 0011
        
 //     << (left shift) : Binary Left Shift Operator where the left operands values is 
        //moved left by the number of bits specified by the right operand
        
        ans = i << 2;
        System.out.println("left shift << 2 is: " +ans); // 1111 0000 is binary of 240
        
        
//      >> (Right shift) : Binary Right Shift Operator where the left operands values is 
        //moved Right by the number of bits specified by the right operand
        
        ans = i >> 2;
        System.out.println("Right shift >> 2 is: " + ans); //1111 is binary of 15
        
        
 //       >>> (Zero fill right shift) : Shift right zero fill Operator where the left operands values is moved right
        // by the number of bits specified by the right operand and shifted values are filled up with zero
        
        ans = i >>> 2;
        System.out.println("Zero fill right shift >>> 2 is: " + ans); // 0000 1111 is binary of 15
        
        
        
        
        
        
        
    }
    
}
