package ar.edu.unju.escmi.tp2.ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
        int a = 30;
        double b = 1.5;

        // Operador unario con prefijo y sufijo
        System.out.println("a++ (sufijo): " + a++); // Muestra 30, luego a = 31
        System.out.println("a después de a++: " + a); // Muestra 31

        System.out.println("--a (prefijo): " + --a); // Decrementa a primero, luego muestra: a = 30

        System.out.println("++b (prefijo): " + ++b); // Incrementa b primero, luego muestra: b = 2.5
        System.out.println("b-- (sufijo): " + b--); // Muestra 2.5, luego b = 1.5
        System.out.println("b después de b--: " + b); // Muestra 1.5
    }
}
