package com.java.guia7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        String nombre = "Ale";
        int edad = 29;
//        ejercicio4(nombre, edad);
//        ejercicio5();
//        ejercicio6();
//        ejercicio7();
//        ejercicio9();
//        ejercicio10();
//        ejercicio11();
//        ejercicio12();
//        ejercicio13();
//        ejercicio14();
//        System.out.println(tp1());
//        System.out.println(tp2());
//        System.out.println(tp6(6));
//        System.out.println(tp7("eureka"));
        square();
    }

    public static void square() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño.");
        int size = read.nextInt();
        read.nextLine();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(i == 0 || j == 0 || i == size - 1 || j == size - 1 ? "* " : "  ");
            }
            System.out.println();
        }
    }

    public static boolean tp7(String str) {
        String comparator = "eureka";
        return str.equals(comparator);
    }

    public static String tp6(int number) {
        return number % 2 == 0 ? "Par" : "Impar";
    }

    public static String tp2() {
        String nombre = "ale";
        return nombre.toUpperCase();
    }

    public static int tp1() {
        Scanner read = new Scanner(System.in);
        return read.nextInt() + read.nextInt();
    }

    public static void ejercicio14() {
        Scanner read = new Scanner(System.in);
        String[] equipo = new String[2];
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = read.nextLine();
        }
        System.out.println(Arrays.toString(equipo));
    }

    public static void ejercicio13() {
        Scanner read = new Scanner(System.in);
        String[] equipo = new String[2];
        equipo[0] = "Ale";
        equipo[1] = "Lu";
        System.out.println(Arrays.toString(equipo));
    }

    public static void ejercicio12() {
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        if (esMultiple(n1, n2)) System.out.println("Son múltiplos.");
        else System.out.println("No son múltiplos.");
    }

    public static boolean esMultiple(int n1, int n2) {
        return n2 % n1 == 0;
    }

    public static void ejercicio11() {
        Scanner read = new Scanner(System.in);
        String entry = read.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < entry.length(); i++) {
            switch (entry.charAt(i)) {
                case 'a' -> builder.append('@');
                case 'e' -> builder.append('#');
                case 'i' -> builder.append('$');
                case 'o' -> builder.append('%');
                case 'u' -> builder.append('*');
                default -> builder.append(entry.charAt(i));
            }
        }
        System.out.println(builder);
    }

    public static void ejercicio10() {
        Scanner read = new Scanner(System.in);
        int n;
        for (int i = 0; i < 4; i++) {
            n = read.nextInt();
            for (int j = 0; j < n; j++) {
                if (j == 0) System.out.print(n);
                if (j == n - 1) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }
    }

    public static void ejercicio9() {
        Scanner read = new Scanner(System.in);
        int entry, q = 0;
        while (q < 5) {
            entry = read.nextInt();
            if (entry == 0) {
                System.out.println("Se ha encontrado un 0.");
                break;
            }
            ++q;
        }
    }

    public static void ejercicio7() {
        Scanner read = new Scanner(System.in);
        int numMotor = read.nextInt();
        switch (numMotor) {
            case 1 -> System.out.println("Bomba de Agua.");
            case 2 -> System.out.println("Bomba de Gasolina");
            case 3 -> System.out.println("Bomba de Hormigón.");
            case 4 -> System.out.println("Bomba de Pasta Alimenticia.");
            default -> System.out.println("No existe un valor válido para tipo de bomba");
        }
    }

    public static void ejercicio6() {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        if (num1 > 25) System.out.println("num1 mayor que 25");
        if (num2 > 25) System.out.println("num2 mayor que 25");
    }

    public static void ejercicio5() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = read.nextInt();
        read.nextLine();
        System.out.println("Ingresa tu nombre");
        String nombre = read.nextLine();
        System.out.println("Soy " + nombre + " y tengo " + edad);
    }

    public static void ejercicio4(String nombre, int edad) {
//        String x, nom = "Ale;
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");
    }

}