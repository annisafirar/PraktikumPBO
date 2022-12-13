
package com.annisafira.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
    //atribute (Variable)
    String nama;
    int jmlRoda;
    
    //Methot
    
    public void nyalakanMesin(){
        System.out.println("Nama :" + nama+ "telah dinyalkan");
    }
    
    public void showInfo(){
        System.out.println(" nama   : "+ nama);
        System.out.println(" jml roda :" + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo() {}
}
