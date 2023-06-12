package com.java.ej1;

public class EJ1 {
    public static void main(String[] args) {

        Libro got = new Libro(12, "Game Of Thrones", "El gordo peluca", 1230);
        System.out.println(got.getTitulo());
        System.out.println(got.getAutor());
        System.out.println(got.getIsbn());
        System.out.println(got.getPageNumbers());

    }
}