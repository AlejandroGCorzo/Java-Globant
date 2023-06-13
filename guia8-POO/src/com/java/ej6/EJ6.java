package com.java.ej6;

public class EJ6 {
    public static void main(String[] args) {
        Cafetera nespresso = new Cafetera(10, 2.5);
        nespresso.servirTaza(1.5);
        nespresso.servirTaza(1.5);
        nespresso.agregarCafe(15);
        nespresso.vaciarCafetera();
        nespresso.servirTaza(1);
        nespresso.llenarCafetera();

    }
}
