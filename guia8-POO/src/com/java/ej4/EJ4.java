package com.java.ej4;

public class EJ4 {
    public static void main(String[] args) {

        Rectangulo recti = new Rectangulo();
        recti.crearRectangulo(4, 3);
        System.out.println(recti.superficie());
        System.out.println(recti.perimetro());
        recti.imprimir();
    }

}
