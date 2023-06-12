package com.java.ej3;

public class Operacion {
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    private int getNum1() {
        return this.num1;
    }

    private void setNum1(int n1) {
        this.num1 = n1;
    }

    private int getNum2() {
        return this.num2;
    }

    private void setNum2(int n2) {
        this.num2 = n2;
    }

    public void crearOperacion(int n1, int n2) {
        this.setNum1(n1);
        this.setNum2(n2);
    }

    public int sumar() {
        return this.num1 + this.num2;
    }

    public int restar() {
        return this.num1 - this.num2;
    }

    public int multiplicar() {
        return this.num1 * this.num2;
    }

    public int dividir() {
        if (this.num2 == 0) return 0;
        return this.num1 / this.num2;
    }
}
