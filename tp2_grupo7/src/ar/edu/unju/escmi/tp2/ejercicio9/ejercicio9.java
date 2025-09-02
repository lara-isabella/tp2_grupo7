package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anio;
        System.out.println("Hola! Ingresa un anio por favor...");
        anio = scanner.nextInt();
        System.out.println("Ingresaste: "+anio);

        if (((anio%4==0)&&(anio%100!=0)) || (anio%400==0)){
            System.out.println("Fue un anio bisiesto :).");
        } else {
            System.out.println("No fue un anio bisiesto :(.");
        }

        scanner.close();

    }
}
