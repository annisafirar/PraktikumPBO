package com.anisafirar.polimorfisme;

    public abstract class Bentuk2D {
        // Menghitung Luas Persegi Panjang
        public abstract double luas();
        
       // Menghitung Keliling
        public abstract double keliling();
        public void display() {
            System.out.println("Luas : " + luas());
            System.out.println("Keliling : " + keliling());

        }
    }