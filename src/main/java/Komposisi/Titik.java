/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Komposisi;

/**
 *
 * @author LENOVO
 */
public class Titik {
    private float sumbuX;
    private float sumbuY;
    
    public Titik (float x,float y)
    {
        sumbuX = x;
        sumbuY = y;
    }
public void displayTitik(){
    System.out.println(" Titik Pusat ");
    System.out.println("Koorinat : ["+ sumbuX +" ,"+sumbuY+"]");
    System.out.println();
}
}



