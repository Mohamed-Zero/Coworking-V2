/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coworkingspace.Visitors;

import com.mycompany.coworkingspace.Menus;
import java.util.ArrayList;

/**
 *
 * @author Mohamed
 */
public class Login {
     public static void VisitorLogin( ArrayList <AbstractVisitor> visitors,String email,String password) throws Exception{
         boolean check=false;
         for(AbstractVisitor temp:visitors){
             if(temp.getEmail().equals(email)&&temp.getPassword().equals(password)){
                 check=true;
                 break;
             }
         }
         if(check){
             System.out.println("login successfully");
             Menus.VisitorMenu();
         }
         else{
             System.out.println("faild login");
             Menus.MainMenu();
         }
         
     }
     
     public static boolean AdminLogin(String Name,String password){
         boolean check=false;
         if(Name.equals("Admin")&&password.equals("admin")){
            return true;
         }
        
         return false;
     }
}
