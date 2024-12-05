
//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 token
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
          
               
                   oosAbstract.writeObject(visitors);   
                   oosAbstract.close();
                   oosGeneral.writeObject(Gvisitors);
                    oosGeneral.close();
                   oosFormal.writeObject(Fvisitors);
                   oosFormal.close();
                   oosInstructor.writeObject(Ivisitors);
                   oosInstructor.close();
           
              
        } catch (Exception ex) {
           System.out.println(ex.getMessage()); 
        }
       
  }

  
   public static void FileRead() throws Exception {
       if(FileAbstract.isFile()){
           oisAbstract = new ObjectInputStream(new FileInputStream(FileAbstract));
           try {
               visitors=(ArrayList<AbstractVisitor>)oisAbstract.readObject();
               oisAbstract.close();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           
       }
       
       if(FileGeneral.isFile()){
           oisGeneral = new ObjectInputStream(new FileInputStream(FileGeneral));
           try {
               Gvisitors=(ArrayList<GeneralVisitor>)oisGeneral.readObject();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           finally{
            oisGeneral.close();
           }
       }
       
        if(FileFormal.isFile()){
           oisFormal = new ObjectInputStream(new FileInputStream(FileFormal));
           try {
               Fvisitors=(ArrayList<FormalVisitor>)oisFormal.readObject();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           finally{
            oisFormal.close();
           }
       }
        
        
         if(FileInstructor.isFile()){
           oisInstructor = new ObjectInputStream(new FileInputStream(FileInstructor));
           try {
               Ivisitors=(ArrayList<InstructorVisitor>)oisInstructor.readObject();
           } catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
           finally{
            oisInstructor.close();
           }
       }
       
  }
    
    public static void main(String[] args) throws Exception {
      try{
           

FileRead();


  
   Menus.MainMenu();
   System.out.println("visitors");
   for(AbstractVisitor v:visitors){
       System.out.println(v.getEmail()+"\n");
   }
 System.out.println("general");
   for(GeneralVisitor v:Gvisitors){
       System.out.println(v.getEmail()+"\n");
   }
    System.out.println("formal");
   for(FormalVisitor v:Fvisitors){
       System.out.println(v.getEmail()+"\n");
   }
    System.out.println("ins");
   for(InstructorVisitor v:Ivisitors){
       System.out.println(v.getEmail()+"\n");
   }
  
      }
  catch(Exception e){
//        System.out.println(e.getMessage()); 
      
      }
    
    }
      
    
         
}

