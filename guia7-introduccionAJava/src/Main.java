import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String nombre = "Ale";
        int edad = 29;
        quienSoy(nombre, edad);
        pruebaLeer();
    }
    public static void quienSoy(String nombre, int edad) {
//        String x, nom = "Ale;
        System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");
    }

    public static void pruebaLeer() {
        Scanner leer = new Scanner(System.in);
        int number = leer.nextInt();
        System.out.println(number);
    }
}