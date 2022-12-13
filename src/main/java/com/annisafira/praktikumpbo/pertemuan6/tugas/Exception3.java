/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.annisafira.praktikumpbo.pertemuan6.tugas;

public class Exception3 {

    public static void main(String[] args) {
        try {
            Object[] array = new String[10];
            array[0] = 25;
        } catch (ArrayStoreException e) {
            System.out.println("Behasil");
        }
    }
}
