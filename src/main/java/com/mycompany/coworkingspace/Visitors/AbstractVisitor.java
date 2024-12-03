/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coworkingspace.Visitors;

import java.io.Serializable;

/**
 *
 * @author Mohamed
 */
public class AbstractVisitor implements Serializable{
    public  String Name ;
    protected String Email ;
    protected String PhoneNum  ;
    protected String Password;
    protected String type ;
   
    
    public AbstractVisitor(String Name, String Email, String PhoneNum, String Password, String type) {
        this.Name = Name;
        this.Email = Email;
        this.PhoneNum = PhoneNum;
        this.Password = Password;
        this.type = type;
        
    }

    

   

  

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    
    

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

   

    public String getPassword() {
        return Password;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public String getType() {
        return type;
    }

   
    
    public String toString(){
        return this.Name+" "+this.Email+" "+this.PhoneNum+" "+this.Password+" "+this.type+"|";
    }
    

  
   
    

    
    
    
    
}
