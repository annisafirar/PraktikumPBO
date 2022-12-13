/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan8;

/**
 *
 * @author LENOVO
 */
public class User {
    String email;
    String password; 
//[alt] + [insert] -> constraktor 
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public boolean verify(String email, String password){
        if(this.email.equals(email)&& this.password.equals(password))
            return true;
        
        return false;
    }
    
}


































































