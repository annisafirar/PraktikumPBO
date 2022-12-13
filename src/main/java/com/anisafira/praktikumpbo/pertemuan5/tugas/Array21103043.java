/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anisafira.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Array21103043 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Data Pemenang Lomba Vlog ");
        int z = input.nextInt();

        String nama_Tim [] = new String[z];
        int  point[] = new int[z];
        String keterangan[] = new String[z];
        

        for (int x = 0; x < z; x++) {
            System.out.println("Nama Tim ke : " + (x + 1));
            System.out.print("Nama Tim : ");
            nama_Tim[x] = input.next();

            System.out.print("Nilai Setiap Tim : ");
            point[x] = input.nextInt();

            if (point[x] <= 700) {
                keterangan[x] = "Tidak Lolos";
            } else {
                keterangan[x] = "Lolos";
            }
        }
        System.out.println("--------------------------------");
        System.out.println("DAFTAR DATA PEMENANG LOMBA VLOG ");
        System.out.println("--------------------------------");
        System.out.println("------DATA SEBAGAI BERIKUT------");
        

        for (int x = 0; x < z; x++) {
            System.out.println((x + 1) +  "    " + nama_Tim[x] +  "     " + point[x] +  "       " + keterangan[x]);
        }

    }

}
