package com.java.extras_dia_5.ej1;

import java.util.Objects;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String tipo;

    public Vehiculo(String marca, String modelo, int año, String tipo) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAño(año);
        this.setTipo(tipo);
    }

    public Vehiculo() {
    }

    private String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int getAño() {
        return año;
    }

    private void setAño(int año) {
        this.año = año;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int moverse(int segundos) {
        int distancia;
        switch (this.getTipo()) {
            case "auto":
                distancia = segundos * 3 + this.frenar();
                break;
            case "moto":
                distancia = segundos * 2 + this.frenar();
                break;
            case "bici":
                distancia = segundos + this.frenar();
                break;
            default:
                distancia = 0;
                break;
        }

        return distancia;
    }

    private int frenar() {
        if (Objects.equals(this.getTipo(),"bici")) return 0;
        return 2;
    }
}
