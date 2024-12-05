

package com.mycompany.coworkingspace;
import com.mycompany.coworkingspace.Visitors.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
  
public class CoworkingSpace { 
  public static  ArrayList <AbstractVisitor> visitors= new ArrayList<>();
  public static  ArrayList <GeneralVisitor> Gvisitors= new ArrayList<>();
  public static  ArrayList <FormalVisitor> Fvisitors= new ArrayList<>();
  public static  ArrayList <InstructorVisitor> Ivisitors= new ArrayList<>();
  public static  Scanner in=new Scanner(System.in);
  public static ObjectOutputStream oosAbstract ;
    public static ObjectOutputStream oosGeneral ;
    public static ObjectOutputStream oosFormal ;
  public static ObjectOutputStream oosInstructor ;
  public static ObjectOutputStream oos;
  
  public static ObjectInputStream oisAbstract;
    public static ObjectInputStream oisGeneral;
  public static ObjectInputStream oisFormal;
  public static ObjectInputStream oisInstructor;
public static ObjectOutputStream ois;
   public static File FileAbstract=new File("AbstractVisitors.txt");
  public static File FileGeneral=new File("GeneralVisitors.txt");
  public static File FileFormal=new File("FormalVisitors.txt");
  public static File FileInstructor=new File("InstructorVisitors.txt");
   
  public static  void FileWrite() throws IOException{
        try {
        oosAbstract = new ObjectOutputStream(new FileOutputStream(FileAbstract));
         oosGeneral = new ObjectOutputStream(new FileOutputStream(FileGeneral));
         oosFormal = new ObjectOutputStream(new FileOutputStream(FileFormal));
         oosInstructor = new ObjectOutputStream(new FileOutputStream(FileInstructor));
           for(AbstractVisitor a :visitors){
               
                   oosAbstract.writeObject(a);   
                  
               if(a instanceof GeneralVisitor){
                  
                   oosGeneral.writeObject(a);   
                    oosGeneral.close();
                }    
               else if(a instanceof FormalVisitor){
                   
                   oosFormal.writeObject(a);  
                   oosFormal.close();                 
               }
               else {
                  
                   oosInstructor.writeObject(a);  
                  oosInstructor.close();
               }
           }
           
        } catch (Exception ex) {
           System.out.println(ex.getMessage()); 
        }
        finally{
            oosAbstract.close();
           
        }
  }
     
   public static void FileRead() throws IOException, ClassNotFoundException {
       AbstractVisitor a=null;
        try {
             oisAbstract = new ObjectInputStream(new FileInputStream(FileAbstract));
                String line;
               
          while((line = oisAbstract.readLine())!="|"){
               a=(AbstractVisitor)oisAbstract.readObject();
               visitors.add(a);       
                 if(a.getType().equalsIgnoreCase("General")){
                 Gvisitors.add((GeneralVisitor)a);

                }    
               else if(a.getType().equalsIgnoreCase("Formal")){
                  Fvisitors.add((FormalVisitor)a); 

               }
               else {
                 Ivisitors.add((InstructorVisitor)a);  

               }
                          
           }
 
        } catch (IOException ex) {
           System.out.println(ex.getMessage()); 
        }
        finally{
           
            oisAbstract.close();
        }
  }
    
    
    public static void main(String[] args) throws Exception {
      try{
            FileRead();
    
      
  
   Menus.MainMenu();
   System.out.println(" visitors");
      for(AbstractVisitor v:visitors){
          System.out.println(v.getEmail()+"\n");
      } 
   
   System.out.println("general visitors");
      for(GeneralVisitor v:Gvisitors){
          System.out.println(v.getEmail()+"\n");
      }
   System.out.println("Formal visitors");
      for(FormalVisitor v:Fvisitors){
          System.out.println(v.getEmail()+"\n");
      }
      System.out.println("Iinstructor visitors");
      for(InstructorVisitor v:Ivisitors){
          System.out.println(v.getEmail()+"\n");
      }
   
    
    }
      catch(Exception e){
        System.out.println(e.getMessage()); 
      }
      }
    
         
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//
//package com.mycompany.coworkingspace;
//
//import com.mycompany.coworkingspace.Visitors.AbstractVisitor;
//import java.io.BufferedReader;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
///**
// *
// * @author Mohamed
// */
//  
// 
//   
//public class CoworkingSpace { 
//    public static  ArrayList <AbstractVisitor> visitors= new ArrayList<>();
//  public static  Scanner in=new Scanner(System.in);
// 
//  
// 
//  
//  public static  void FileWrite(){
//        try {
//          
//            File file =new File("test.txt");
//           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//           
//           for(AbstractVisitor a :visitors){
//               oos.writeObject(a);
//           }
//           oos.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//  }
//     
//   public static  AbstractVisitor FileRead() {
//       AbstractVisitor a=null;
//        try {
//        
//           
//            File file =new File("test.txt");
//          ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//          String line;
//          while((line = ois.readLine())!="\n"){
//              a=(AbstractVisitor)ois.readObject();
//               visitors.add(a);
//           }
//           
//           ois.close();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        finally{
//           
//            return a;
//        }
//  }
//     
//    public static void main(String[] args) throws Exception {
//   FileRead();
//        
//   
//      
//  
//   Menus.MainMenu();
//   
//   
//   
//   
//    
//    }
//}