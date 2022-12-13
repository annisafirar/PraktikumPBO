/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        // Class object = new class
        Mobil mb = new Mobil ();
        Kendaraan kn = new Kendaraan();
        Truck tk = new Truck ();
        
        
        mb.nama = "Yamaha";
        mb.jmlRoda = 4; 
        
        tk.nama = "Yamaha";
        tk.jmlRoda = 4; 
        
        kn.nama ="Kedaraan misterius ";
        kn.jmlRoda = 3;
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kanan");
        mb.belok();
        
        tk.showInfo();
        tk.warna("biru");
                
       
        
      
    }
    
}
