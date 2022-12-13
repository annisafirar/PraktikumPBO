package com.annisafira.praktikumpbo.pertemuan6.tugas;

import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Masukkan angka yang ingin di input : ");
        String strInput = input.nextLine();
        int intInput = 20;
        try {
            intInput = Integer.parseInt(strInput);
            System.out.println(strInput);
            System.out.println("Berhasil meng input");
        } catch (NumberFormatException e) {
            System.out.println("inputan anda gagal, masukan angka saja ");
        }
    }
}
