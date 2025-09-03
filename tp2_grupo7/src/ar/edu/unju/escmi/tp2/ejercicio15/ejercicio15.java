package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamaño;
        do {
            System.out.print("Ingrese un número entre 3 y 10 para el tamaño del array: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 3 || tamaño > 10);

        int[] numeros = new int[tamaño];
        int suma = 0;

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("\nValores ingresados:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + " → Valor: " + numeros[i]);
        }

        System.out.println("Suma total de los valores: " + suma);
        scanner.close();
    }
}
