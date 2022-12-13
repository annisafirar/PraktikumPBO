/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan5;

/**
 *
 * @author LENOVO
 */
public class Array2 {
    public static void main(String[] args) {
        String[] names ={
            "Rain",
            "Thunder",
            "Storm",
    };
        
        //cek panjang arry 
            System.out.println("Panjangg arry :" + names.length);
            
           //menampilkan semua nilai arry 
           
           for(int i=0; i<names.length; i++){
               System.out.println( i + ":"+ names[i]);
           }
    }
}

