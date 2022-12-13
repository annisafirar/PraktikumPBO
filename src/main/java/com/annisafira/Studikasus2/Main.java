/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.annisafira.Studikasus2;

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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.println("Masukkan pembilang>>");
        pembilang = input.nextInt();
        System.out.println("Masukkan Penyebut");
        penyebut = input.nextInt();
        if(penyebut == 0)
            System.out.println("Cannot divide by 0");
        else
        {
            hasil = pembilang/penyebut;
            System.out.println(pembilang+"/"+ penyebut +"="+ hasil);
        }
    }

}
