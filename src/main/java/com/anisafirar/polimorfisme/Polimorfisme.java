/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anisafirar.polimorfisme;

/**
 *
 * @author LENOVO
 */
public class Polimorfisme {

    public static void main(String[] args) {
// Class Object
        Bentuk2D b2d;
        PersegiPanjang pp = new PersegiPanjang(4, 5);
        b2d = pp;
        b2d.display();
        
        System.out.println("");
        Segitiga s3 = new Segitiga(6, 10);
        b2d = s3;
        b2d.display();
        
        System.out.println("");
        b2d = new BujurSangkar(10);
        b2d.display();
    }

}
