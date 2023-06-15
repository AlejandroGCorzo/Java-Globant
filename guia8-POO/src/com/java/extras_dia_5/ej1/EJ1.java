package com.java.extras_dia_5.ej1;

public class EJ1 {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("AUDI", "A1", 2022, "auto");
        Vehiculo moto = new Vehiculo("HONDA", "KESEYO", 2021, "moto");
        Vehiculo bici = new Vehiculo("ZENITH", "ANDES", 2010, "bici");
        System.out.println("El auto se desplazó " + auto.moverse(5) + " metros tras 5 segundos");
        System.out.println("El auto se desplazó " + auto.moverse(10) + " metros tras 10 segundos");
        System.out.println("El auto se desplazó " + auto.moverse(60) + " metros tras 60 segundos");

        System.out.println("La moto se desplazó " + moto.moverse(5) + " metros tras 5 segundos");
        System.out.println("La moto se desplazó " + moto.moverse(10) + " metros tras 10 segundos");
        System.out.println("La moto se desplazó " + moto.moverse(60) + " metros tras 60 segundos");

        System.out.println("La bici se desplazó " + bici.moverse(5) + " metros tras 5 segundos");
        System.out.println("La bici se desplazó " + bici.moverse(10) + " metros tras 10 segundos");
        System.out.println("La bici se desplazó " + bici.moverse(60) + " metros tras 60 segundos");

        System.out.println("El auto se desplazó " + auto.moverse(300) + " metros tras 300 segundos");
        System.out.println("La moto se desplazó " + moto.moverse(300) + " metros tras 300 segundos");
        System.out.println("La bici se desplazó " + bici.moverse(300) + " metros tras 300 segundos");
    }
}
