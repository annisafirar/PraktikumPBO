
package com.annisafira.praktikumpbo.pertemuan3.Kampus;

public class Main {
   
     public static void main(String[] args) {
        // membuat project dari kelas animal
        Kampus indonesia  = new Kampus("Annisa Firardiansyah Prayitno", 02112002 ,"Purwokerto","Universitas Indonesia");
        Kampus eropa = new Kampus ("Arifin Bumi Rabbani Prayitno", 04052007 ,"Jakarta","Universitas Harvard");
        Kampus asia = new Kampus("Aurora Langit Putri Prayitno", 11112010 ,"Cilacap","Universitas Nasional Singapura");
        
         //Memanggil method
        indonesia.showProfile();
        eropa.showProfile();
        asia.showProfile();
}
} 
