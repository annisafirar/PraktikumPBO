package com.anisafirar.polimorfisme;

public class Segitiga extends Bentuk2D {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return (alas * tinggi) / 2;
    }

    public double keliling() {
        return 3 * (alas);
    }

    public void display() {
        System.out.println("Luas dan Keliling [Segitiga]");
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}
