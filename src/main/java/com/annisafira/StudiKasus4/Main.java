/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.annisafira.StudiKasus4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listBilangan = {0, 0, 0, 0, 0, 0};
        int x;
        Scanner input = new Scanner(System.in);
        for (x = 0; x < listBilangan.length; ++x) {
            try {
                System.out.print("Masukan Bilangan >> ");
                listBilangan[x] = input.nextInt();
            } catch (Exception e) {
                System.out.println("Exception Muncul");
            }
        }
        System.out.print("Bilangan : ");
        for (x = 0; x < listBilangan.length; ++x) {
            System.out.print(listBilangan[x] + " ");
        }
        System.out.println();
    }
}
