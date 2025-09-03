package ar.edu.unju.escmi.tp2.ejercicio16;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamaño;
        
        // Pedir un número en el rango [5,10]
        do {
            System.out.print("Ingrese un número entero en el siguiente rango [5,10]: ");
            tamaño = scanner.nextInt();
        } while (tamaño  < 5 || tamaño > 10);
        
        // Crear un array de String con el tamaño que se pidio
        String[] nombres = new String[tamaño];
        
        // Pedir que ingrese los nombres de las personas para cada posición del array
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese un nombre para la posición " + i + ": ");
            nombres[i] = scanner.next();
        }
        
        //Mostrar el valor guardado empezando desde el primer indice
        System.out.println("\nValores ingresados desde la primera posicion :");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
        
        // Mostrar el valor guardado empezando desde el ultimo indice
        System.out.println("\nValores ingresados desde la ultima posicion:");
        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
        
        scanner.close();
    }
}