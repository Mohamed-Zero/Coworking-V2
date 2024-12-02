/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coworkingspace;

import com.mycompany.coworkingspace.Visitors.AbstractVisitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

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
            File file =new File("C:\\Users\\Mohamed\\javafile\\test.txt");
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
           for(AbstractVisitor a :visitors){
               oos.writeObject(a);
           }
           oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
  }
     
   public static  void FileRead() throws Exception{
        try {
            File file =new File("C:\\Users\\Mohamed\\javafile\\test.txt");
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
           AbstractVisitor a=(AbstractVisitor)ois.readObject();
           System.out.println(a);
           ois.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
  }
     
    public static void main(String[] args) throws Exception {
    
   Menus.MainMenu();
   
      
   
   
    
    }
}
