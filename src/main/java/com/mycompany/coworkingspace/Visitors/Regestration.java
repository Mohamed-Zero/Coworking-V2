/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coworkingspace.Visitors;

import static com.mycompany.coworkingspace.CoworkingSpace.visitors;
import java.util.ArrayList;

import java.util.Scanner;
/**
 *
 * @author Mohamed
 */
 
    
public class Regestration {
 private static Scanner input=new Scanner(System.in);
    private String Name ;
    private String Email ;
    private String PhoneNum  ;
    private String Password;
    private String type ;
   
    
    boolean check=true;
    String temp;
    public Regestration(String Name, String Email, String PhoneNum, String Password, String type) {
        this.Name = Name;
        this.Email = Email;
        this.PhoneNum = PhoneNum;
        this.Password = Password;
        this.type = type;
        
    }

    public Regestration() {
    }

    public void setName(String Name) {
     
        this.Name = Name;
    }

    public void setEmail(String Email) {
       check=true;
           for(AbstractVisitor v:visitors){
            if(v.getEmail().equals(Email)){
                check =false;
                break;
            }
        }
           if(check&&Email.indexOf("@")!=-1)
        this.Email = Email;
           else{
               System.out.println("This email is already exists\n please enter another one ");
               temp=input.next();
               this.setEmail(temp);
           }
    }

    public void setPhoneNum(String PhoneNum) {
        check=true;
         for(AbstractVisitor v:visitors){
            if(v.getPhoneNum().equals(PhoneNum)){
                check =false;
                break;
            }
        }
    
           if(check&&PhoneNum.length()==11){
              
         this.PhoneNum = PhoneNum;
           }
           else{
               System.out.println("Invalid Phone Number \n please enter another one ");
               String temp=input.next();
               this.setPhoneNum(temp);
           }
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public static int TypeList(){
        System.out.println("Choose one from this types\n");
         System.out.println("1.General\n2.Formal\n3.Instructor");
         int choice=input.nextInt();
         return choice;
        
    }
      
   
     public static AbstractVisitor VisitorRegester(){
         Regestration r=new Regestration();
         System.out.println("Enter your name\n");
         String name=input.next();
          System.out.println("Enter your password\n");
         String pass=input.next();
          System.out.println("Enter your phone\n");
         String phone=input.next();
         
         r.setPhoneNum(phone);
          System.out.println("Enter your type\n");
          int choice=TypeList();
          String type="";
          switch(choice){
              case 1:
                  type="General";
                  break;
               case 2:
                  type="Formal";
                  break;
                case 3:
                  type="Instructor";
                  break;  
          }
      
          System.out.println("Enter your email\n");
         String email=input.next();
         r.setEmail(email);
         
         return new AbstractVisitor(name,email,phone,pass,type);
     }
        public static AbstractVisitor VisitorRegester(Regestration r){
         System.out.println("Enter your name\n");
         String name=r.Name;
          System.out.println("Enter your password\n");
         String pass=r.Password;
          System.out.println("Enter your phone\n");
         String phone=r.PhoneNum;
          System.out.println("Enter your type\n");
         String type=r.type;
          System.out.println("Enter your email\n");
         String email=r.Email;
        
         return new AbstractVisitor(name,email,phone,pass,type);
     }
     
    
    

}
