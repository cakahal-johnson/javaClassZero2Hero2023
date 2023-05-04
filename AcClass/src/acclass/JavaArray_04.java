/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ot_class;

import java.util.Arrays;

/**
 *
 * @author Cakahal Johnson
 */
public class JavaArray_04 {
    JavaArray_04(){
        
        
        /*
            JAVA ARRAYS
        this is also used to store multiple values in a single variable,
        instead of declaring separate variables for each value
        this also is a way whereby we keep data as in our database
        
        Syntax:
        
        each array comes with a square brackets[]
        i.e String[] arrayName;
        
        
        */
        
        System.out.println("Here Starts an Array");
        
        String[] List_students = {"Johnson", "Ken", "mercy", "cakahal", "joy"};
        
        // NB: 0 (zero) is the first of an array
        // checking for the length of out array items
        System.out.println(List_students.length);
        
        // checking for each item 
        System.out.println(List_students[1]); //Ken
        
        // adding to an Array
        List_students[1] = "Obi";
        System.out.println(List_students[1]); //Obi
        
        //working with int in Array
        int[] score = {50, 100, 20, 40, 70};
        System.out.println("My name is: "+List_students[0] + "\nMy score is: " +score[1]);
        
        /* Loop Through an Array
        we use For keyword and Length property to specify how many times the loop should run
        
        Syntax:
        for(String i : name){
            returns i
        }
        
        */
        
        /*
        Multidimensional Arrays
        These is an array containing one or more arrays
        to create this we have to create a set of these array
        
        */
        
        int[][] myArr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int x = myArr[0][2];
        System.out.println(x); // 3
        
        // classwork print 10 from myArr
        
        //get the length of the Array
        System.out.println(myArr.length); //3
        
        
        String[][] alph = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};
        for(int i = 0; i < alph.length; ++i){
            System.out.println(i);
            for(int n = 0; n < alph.length; ++n){
                System.out.println(alph[i][n]);
            }
        }
        
        // SORTING AN ARRAY: it starts with asending order, to use this Array will need to import the Array
        int[] students = {50,20,1,0,8,40,25};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students)); // returns the sorted values
        
        String[] stud = {"Johnson", "Ken", "mercy", "cakahal", "joy"};
        //Arrays.sort(stud);// upperCase comes first
        Arrays.sort(stud, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(stud));
        
        // COPYING AN ARRAY
//        int[] new_Student = Arrays.copyOf(students, );
        
        
        
    }
    
}
