package com.java.ej3;

public class EJ3 {
    public static void main(String[] args) {
        Operacion uno = new Operacion();
        uno.crearOperacion(10, 5);
        System.out.println(uno.sumar());
        System.out.println(uno.restar());
        System.out.println(uno.multiplicar());
        System.out.println(uno.dividir());

    }
}
