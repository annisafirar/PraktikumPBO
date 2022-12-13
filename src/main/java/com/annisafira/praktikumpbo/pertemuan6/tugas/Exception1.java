/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan6.tugas;

/**
 *
 * @author LENOVO
 */
public class Exception1 {

    public static void main(String[] args) {
        String str = " Mencari dan menghitung panjang dari suatu bangun ";
        for (int k = 0; k < str.length(); k++) {
            System.out.println(str.charAt(k));
        }
        System.out.println();
        System.out.println("Panjang String : " + str.length());
        try {
            // mengakses elemen lebih besar dari panjang string
            System.out.println(str.charAt(60));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" Terjadi Exception");
        }
    }
}
