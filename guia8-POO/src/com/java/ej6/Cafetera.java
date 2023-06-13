package com.java.ej6;

public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    private double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    private void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = (double) Math.round(capacidadMaxima * 100) / 100;
    }

    private double getCantidadActual() {
        return cantidadActual;
    }

    private void setCantidadActual(double cantidadActual) {
        this.cantidadActual = (double) Math.round(cantidadActual * 100) / 100;
    }

    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
        System.out.println("Cafetera llena kpo.");
    }

    public void servirTaza(double taza) {
        if (taza > getCantidadActual()) {
            System.out.println("No se llenó la taza. Contiene " + getCantidadActual());
            setCantidadActual(0);
        } else {
            System.out.println("Taza llena");
            setCantidadActual(getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera() {
        setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }

    public void agregarCafe(double cantidad) {
        if (getCantidadActual() + cantidad <= getCapacidadMaxima()) {
            setCantidadActual(getCantidadActual() + cantidad);
            System.out.println("Se ha añadido " + cantidad + " a la cafetera.");
        } else {
            System.out.println("Se ha añadido sólo " + (getCapacidadMaxima() - getCantidadActual()) + " debido a que sobrepasaba el límite.");
            setCantidadActual(getCapacidadMaxima());
        }

    }

}
