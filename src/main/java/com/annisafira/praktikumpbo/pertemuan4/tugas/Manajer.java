
package com.annisafira.praktikumpbo.pertemuan4.tugas;

public class Manajer extends Karyawan {
    
    
    public void data(String tugas)  {
        
        System.out.println( " fungsi"+ tugas + "!");
        
    }
    public void extraInfo(){
        System.out.println(" Jadwal Bekerja");
    }
    public void jam (String shif) {
        System.out.println(" jadwal nya" + shif + "!");
        
    }
    public void jam(){
        System.out.println(" masukkan jadwal (siang/sore)");
    }

    
}

