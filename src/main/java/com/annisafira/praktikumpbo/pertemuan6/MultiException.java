/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MultiException {

    public static void main(String[] args) {
        //Membuat lebih dari satu exception
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan Bilangan");
            int bilangan = input.nextInt();

            System.out.println(" Masukkan Bilangan Pembagi");
            int pembagi = input.nextInt();

            int hasil = bilangan / pembagi;
            System.out.println(" Hasil pembagian (di bulatkan) :" + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak dapat Memproses");
        } catch (InputMismatchException e) {
            System.out.println("Harap Masukkan angka saja ");
        }
    }
}
