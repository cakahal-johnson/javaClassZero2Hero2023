/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Cakahal Johnson
 */
public class javaIO {
    javaIO(){
        /*
        is just a way of creating files in java, you will need import javaio.File package
        and also java.io.IO.Exception for catching exceptions
        
        here we create a folder from our desktop then we open the folder and copy the 
        folder file path...
        
        
        
        */
        
        String filename =  "javaIOclass.txt";
        String newName = "about to go down";
        
        File file = new File ("C:\\Users\\JOHNSON\\Desktop\\javaIO" +filename);
        try{
            if(!file.exists()){
              file.createNewFile(); // import file
              JOptionPane.showMessageDialog(null, "Successfully Created" + file.getName() );
              
            }else{
                JOptionPane.showMessageDialog(null, "This file already Exist" +file.getName());
            }
            
            // here we add a content inside the file
            String content = "This is a java class \n java is awesome! ";
            FileWriter fw = new FileWriter(file,true); // import fileWriter
            //we pass through a buffere to make everything is ok
            BufferedWriter bw = new BufferedWriter(fw); // import bufferedWriter
            
            bw.write(content);
            bw.close();
            
            //here we read the file
            FileInputStream fis = new FileInputStream(file); //import fis
            BufferedInputStream bis = new BufferedInputStream(fis); // import bis
            
            while(bis.available() > 0){
                System.out.println((char)bis.read());
            }
            
            
            //update or rename the file
            File newFile = new File ("C:\\Users\\JOHNSON\\Desktop\\javaIO"+ newName );
            boolean result = file.renameTo(newFile);
            
            if(!newFile.exists()){
                file.renameTo(newFile);
                
                JOptionPane.showMessageDialog(null, "Successfully Renamed" +file.getName());
                
               
            }else{
               JOptionPane.showMessageDialog(null, "An Error occured can't rename" +file.getName());
            }
            

            // here we delete
            
            
            if(!file.exists()){
                newFile.delete();
                JOptionPane.showMessageDialog(null, "Successfully deleted" +file.getName());
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Failed To Delete Ops!" +file.getName());
            }
            
        }
         catch(Exception e){
          e.printStackTrace();
         }
                
    }
}
