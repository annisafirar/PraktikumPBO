
package com.annisafira.praktikumpbo.pertemuan3.Kampus;

public class Kampus {
        // Attributes
        private String name;
        private int tanggallahir;
        private String alamat;
        private String universitas;
        
        public Kampus(String name, int tanggallahir, String alamat,String universitas) {
        this.name = name;
        this.tanggallahir = tanggallahir;
        this.alamat = alamat;
        this.universitas = universitas;
        }
 
        //Metod Mencetak Semua atribut 
        public void showProfile() {
            System.out.println("name : " + name);
            System.out.println("Tanggalahir: "+tanggallahir  );
            System.out.println("Alamat: " + alamat);
            System.out.println("universitas: " + universitas);
           

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(int tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }
}
        //[Alt] + [fn]+ [insert] -> geter and senter  -> Select All

   