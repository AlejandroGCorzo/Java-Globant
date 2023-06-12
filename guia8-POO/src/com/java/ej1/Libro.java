package com.java.ej1;

public class Libro {
    private final int isbn;
    private final String titulo;
    private final String autor;
    private final int pageNumbers;

    public Libro(int isbn, String titulo, String autor, int pageNumbers) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pageNumbers = pageNumbers;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }
}
