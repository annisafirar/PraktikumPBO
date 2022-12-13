/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan5;

/**
 *
 * @author LENOVO
 */
public class Array1 {
        public static void main(String[] args) {
        String[] names = new String[5];
        
        //cek panjang arry 
            System.out.println("Panjangg arry :" + names.length);
            
            //masukkan nilai ke arry 
            names[0]="Rain";
            names[1]="Thunder";
            names[2]="Strom";
             
           //menampilkan semua nilai arry 
           
           for(int i=0; i<names.length; i++){
               System.out.println( i + ":"+ names[i]);
           }
    }
}
