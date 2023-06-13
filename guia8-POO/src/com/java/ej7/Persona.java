package com.java.ej7;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        System.out.println("Persona " + this.nombre + " creada.");
    }

    public void calcularIMC() {
        double imc = Math.abs(this.peso) / (Math.pow(this.altura, 2));
        if (imc < 20) System.out.println("Por debajo del peso ideal");
        if (imc >= 20 && imc <= 25) System.out.println("En peso ideal");
        if (imc > 25) System.out.println("Sobrepeso");
    }

    public void esMayorDeEdad() {
        if (this.edad >= 18) System.out.println("Es mayor de edad.");
        else System.out.println("Es menor de edad.");
    }


}
