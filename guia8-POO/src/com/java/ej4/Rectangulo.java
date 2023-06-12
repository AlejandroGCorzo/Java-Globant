package com.java.ej4;

public class Rectangulo {
    public int altura;
    private int base;

    public Rectangulo() {
    }

    public Rectangulo(int b, int a) {
        altura = a;
        base = b;
    }

    private void setAltura(int altura) {
        this.altura = altura;
    }

    private void setBase(int base) {
        this.base = base;
    }

    public void crearRectangulo(int b, int a) {
        altura = a;
        base = b;
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return 2 * base + 2 * altura;
    }

    public void imprimir() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || i == altura - 1 || j == base - 1) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
