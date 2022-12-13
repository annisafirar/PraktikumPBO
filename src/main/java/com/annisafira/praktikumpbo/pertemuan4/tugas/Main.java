
package com.annisafira.praktikumpbo.pertemuan4.tugas;


public class Main {
    public static void main(String[] args) {
        Manajer mj = new Manajer();
        Kasir kr = new Kasir();
        Pelayan pn=new Pelayan();
        
        
        mj.jabatan  =" Manager";
        mj.nama_karyawan= " Annisa Firardiansyah Prayitno";
        mj.id_karyawan= 38804567;
        mj.gaji_karyawan=" 20 Juta Rupiah";
       
        
       
        
        kr.jabatan =" kasir";
        kr.nama_karyawan=" Putrina Dian Sky";
        kr.id_karyawan= 25504054;
        kr.gaji_karyawan=" 5 Juta Rupiah";
        
        pn.jabatan= " Pelayan";
        pn.nama_karyawan=" Kevin Jaya Prayitno";
        pn.id_karyawan= 900676872;
        pn.gaji_karyawan="6 Juta Rupiah";
                
        
        mj.showInfo();
        mj.data(" Manajer adalah memanage staf ang ada");
        mj.jam();
        mj.jam(" sore ");
        
        
        kr.showInfo();
        kr.data("Kasir adalah melakukan transaski kepada pelanggan atau pembeli");
        
        pn.showInfo();
        pn.data("Pelayan adalah melayani pelanggan dan juga menyajikan pesanan pembeli");
        
        
                
    }
}

