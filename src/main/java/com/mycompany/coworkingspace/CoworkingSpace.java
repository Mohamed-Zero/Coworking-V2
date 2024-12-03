/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coworkingspace;

import com.mycompany.coworkingspace.Visitors.AbstractVisitor;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Mohamed
 */
  
 
   
public class CoworkingSpace { 
    public static  ArrayList <AbstractVisitor> visitors= new ArrayList<>();
  public static  Scanner in=new Scanner(System.in);
 
  
 
  
  public static  void FileWrite(){
        try {
          
            File file =new File("test.txt");
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
           
           for(AbstractVisitor a :visitors){
               oos.writeObject(a);
           }
           oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
  }
     
   public static  AbstractVisitor FileRead() {
       AbstractVisitor a=null;
        try {
        
           
            File file =new File("test.txt");
          ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
          String line;
          while((line = ois.readLine())!="|"){
              a=(AbstractVisitor)ois.readObject();
               visitors.add(a);
           }
           
           ois.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally{
           
            return a;
        }
  }
     
    public static void main(String[] args) throws Exception {
   FileRead();
        
   
      
  
   Menus.MainMenu();
   
      
   
   
    
    }
}
