/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coworkingspace;

import static com.mycompany.coworkingspace.CoworkingSpace.FileRead;
import static com.mycompany.coworkingspace.CoworkingSpace.FileWrite;
import static com.mycompany.coworkingspace.CoworkingSpace.in;
import static com.mycompany.coworkingspace.CoworkingSpace.visitors;
import com.mycompany.coworkingspace.Visitors.Login;
import com.mycompany.coworkingspace.Visitors.Regestration;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Menus {
   private static int choice ;
    
     public static void MainMenu() throws Exception{
         
         int choice;
         boolean check=true;
          System.out.println("\n  welcome to our working space system");
           System.out.println("1.admin login");
           System.out.println("2.visitor register");
            System.out.println("3.visitor login");
            System.out.println("4.Exit");
            System.out.println("choose an option please");           
            choice=in.nextInt();          
            switch (choice) {
                case 1:
                     System.out.println("enter email\n");
                    String Name=in.next();
                    System.out.println("enter pass\n");
                    String password=in.next();
                    check=Login.AdminLogin(Name, password);
                      Menus.AdminMenu();
                    if(check==false){
                        System.out.println("Invalid Admin\n");
                        MainMenu();
                    }
                    break;
                case 2:
                   visitors.add(Regestration.VisitorRegester());
                   System.out.println("Regester Succefully :)");
                    FileWrite();
                    
                    System.out.println("Please login");
                   Menus.MainMenu();
                   break;
                case 3:
                     System.out.println("enter email\n");
                    String email=in.next();
                    System.out.println("enter pass\n");
                    String pass=in.next();
                   check= Login.VisitorLogin(visitors, email, pass);
                 Menus.VisitorMenu();
                    if(check==false){
                        System.out.println("Invalid Admin\n");
                         Menus.VisitorMenu();
                    }
                   break;
                case 4 :
                    Menus.Exit();
                    break;
                default:
                     System.out.println("Invalid chooice please try again");
                    MainMenu();
                    
            }      
}
     public static void VisitorMenu() throws Exception{
                System.out.println("Choose one from this options: \n");
                System.out.println("1.Make New Reservation\n2.Update Reservation\n3.Cancle Reservation\n4.Display Available Slots\n5.Back\n6.Exit");
                System.out.println("Your choice : ");
                choice =in.nextInt();
                
                switch(choice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;   
                    case 5:
                        Menus.MainMenu();
                        break;    
                    case 6:
                        Menus.Exit();
                        break;    
                        
                        
                        
                }
                
            }
     
     public static void Exit(){
         System.out.println("Have a good day :)");
     }
     
     public static void AdminMenu() throws Exception{
           System.out.println("Choose one from this options: \n");
                System.out.println("1.Add Slots\n2.Delete Visirot\n3.Delet Room\n4.Display Available Slots\n5.Display All Visitors Data"
                        + "\n6.Display All Rooms Data\n7.Display All Instructors Data\n8.Amount Of Money For General Room\n9.Amount Of Money For Meeting Room"
                        + "\n10.Amount Of Money For Instructor Room\n11.Update Visitors Data\n12.Update Rooms Data\n13.Back\n14.Exit");
                System.out.println("Your choice : ");
                choice =in.nextInt();
                
                switch(choice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;   
                    case 5:
                       
                        break;    
                    case 6:
                       
                        break;    
                     case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;   
                    case 11:
                       
                        break;    
                    case 12:
                       
                        break;  
                    case 13:
                       Menus.MainMenu();
                        break;    
                    case 14:
                       Menus.Exit();
                        break;
                        
                        
                }
                
     }
}
