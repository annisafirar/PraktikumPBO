/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DynamicArray {

    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print("Banyaknya Nilai : ");
        n = masuk.nextInt();
        jum = 0;
        i = 1;
        while (i <= n) {
            System.out.print("Nilai ke-" + i + ": ");
            x = masuk.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / n;
        System.out.println("Rata-rata: " + rata);
        System.out.println("Jumlah: " + jum);
    }
}
