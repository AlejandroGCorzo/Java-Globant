package com.java.ej5;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = (double) Math.round(saldo * 100) / 100;
    }

    private int getNumeroCuenta() {
        return numeroCuenta;
    }

    private void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private int getDni() {
        return dni;
    }

    private void setDni(int dni) {
        this.dni = dni;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = (double) Math.round(saldo * 100) / 100;
    }

    public void crearCuenta(int numeroCuenta, int dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public void ingresar(double ingreso) {
        this.setSaldo(this.saldo + ingreso);
        System.out.println("Ingreso exitoso.");
    }

    public void retirar(double retiro) {
        if (this.saldo - retiro < 0) {
            this.setSaldo(0);
            System.out.println("Se ha retirado $" + Math.abs(0 - retiro));
        }
        this.setSaldo(this.saldo - retiro);
        System.out.println("Se ha retirado $" + retiro);
    }

    public void extraccionRapida(double retiro) {
        if (this.saldo * 0.2 > retiro) {
            System.out.println("Sólo puede retirar hasta el 20% del total de su cuenta.");
        }
        this.setSaldo(this.saldo - retiro);
        System.out.println("Se ha retirado $" + retiro + " mediante extracción rápida");
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es $" + this.getSaldo() + ".");
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + this.getNumeroCuenta());
        System.out.println("Dni usuario: " + this.getDni());
    }
}
