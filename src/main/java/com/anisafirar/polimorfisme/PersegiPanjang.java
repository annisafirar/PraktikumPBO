package com.anisafirar.polimorfisme;

public class PersegiPanjang extends Bentuk2D {

    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public void display() {
        System.out.println("Luas dan Keliling [Persegi Panjang]");
        System.out.println("Luas : " + luas());
        System.out.println("Keliling : " + keliling());
    }
}
