/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.annisafira.StudiKasus3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukan penyebut >> ");
        penyebut = input.nextInt();
        try {
            hasil = pembilang / penyebut;
            System.out.println(pembilang + " / " + penyebut + " = " + hasil);
        } catch (ArithmeticException mistake) {
            System.out.println("Error perhitungan aritmatika sudah ditangani");
        }
        System.out.println("Program Selesai");
    }
}
