
package com.annisafira.praktikumpbo.pertemuan4.tugas;

public class Karyawan {
    String nama_karyawan;
    String gaji_karyawan;
    int id_karyawan;
    String jabatan;
  
    
    
    public void showInfo(){
        System.out.println(" Jabatan         : " + jabatan);
        System.out.println(" nama            : "+ nama_karyawan);
        System.out.println(" jml gaji        : " + gaji_karyawan);
        System.out.println(" Nomer identitas : " +id_karyawan);
        
    }
    
}