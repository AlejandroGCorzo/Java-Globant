package com.java.ej5;

public class EJ5 {
    public static void main(String[] args) {
        Cuenta sueldo = new Cuenta(489, 37654, 148263.89);
        sueldo.consultarSaldo();
        sueldo.retirar(100000);
        sueldo.consultarSaldo();
        sueldo.extraccionRapida(10000);
        sueldo.consultarSaldo();
        sueldo.ingresar(20000);
        sueldo.consultarSaldo();
        sueldo.consultarDatos();
    }
}
