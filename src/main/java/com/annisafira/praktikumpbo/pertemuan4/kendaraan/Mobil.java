/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan{
   
    
    public  void belok(String arah) {
        System.out.println(" Mobil " + nama + " belok ke " + arah + "!");
    }
    public void belok() {
        System.out.println(" Error mohon masukkan arah");
      
    }
}
