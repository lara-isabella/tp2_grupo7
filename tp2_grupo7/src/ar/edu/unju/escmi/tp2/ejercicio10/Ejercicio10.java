package ar.edu.unju.escmi.tp2.ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int c = -14;

        System.out.println("Variables: /n a = 7 /n b = 5 /n c = -14");

        System.out.println("a) a > 3 (V). Resultado: " + (a > 3));
        System.out.println("b) a > c (V). Resultado: " + (a > c));
        System.out.println("c) a < c (F). Resultado: " + (a < c));
        System.out.println("d) b < c (F). Resultado: " + (b < c));
        System.out.println("e) b != c (V). Resultado: " + (b != c));
        System.out.println("f) a==3 (F). Resultado: " + (a == 3));
        System.out.println("g) a * b == 15 (F). Resultado: " + (a * b == 15));
        System.out.println("h) a * b == -30 (F). Resultado: " + (a * b == -30));
        System.out.println("i) c / b < a (V). Resultado: " + (c / b < a));
        System.out.println("j) c / b == -10 (F). Resultado: " + (c / b == -10));
        System.out.println("k) c / b == -4 (F). Resultado: " + (c / b == -4));
        System.out.println("l) a + b + c == 5 (F). Resultado: " + (a + b + c == 5));
        System.out.println("m) (a+b == 8 ) && (a-b == 2) (F). Resultado: " + ((a + b == 8) && (a - b == 2)));
        System.out.println("n) (a+b == 8 ) || (a-b == 6) (F). Resultado: " + ((a + b == 8) || (a - b == 6)));
        System.out.println("o)  a > 3 && b > 3 && c < 3 (V). Resultado: " + (a > 3 && b > 3 && c < 3));
        System.out.println("p)  a > 3 && b >= 3 && c < -3 (V). Resultado: " + (a > 3 && b >= 3 && c < -3));

    }
}