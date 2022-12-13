
package com.annisafira.praktikumpbo.praktikumpbo.pertemuan2;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Masukkan Bilangan bulat:");
        int bilangan = input.nextInt();
        
        if(bilangan > 0)
            System.out.println( bilangan + " Adalah bilangan positif !");
        else if(bilangan < 0 )
            System.out.println( bilangan +" adalah bil negatif ! ");
        else 
            System.out.println( bilangan + " adalah nol");
    }
    
}
