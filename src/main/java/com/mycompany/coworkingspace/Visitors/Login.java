/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coworkingspace.Visitors;

import java.util.ArrayList;

/**
 *
 * @author Mohamed
 */
public class Login {
     public static boolean VisitorLogin( ArrayList <AbstractVisitor> visitors,String email,String password){
         boolean check=false;
         for(AbstractVisitor temp:visitors){
             if(temp.getEmail().equals(email)&&temp.getPassword().equals(password)){
                 
                 check=true;
                 break;
             }
         }
         if(check){
             System.out.println("login successfully");
         }
         else{
             System.out.println("faild login");
         }
         return check;
     }
     
     public static boolean AdminLogin(String Name,String password){
         boolean check=false;
         if(Name.equals("Admin")&&password.equals("admin")){
            return true;
         }
        
         return false;
     }
}
