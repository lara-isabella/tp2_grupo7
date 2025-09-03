package ar.edu.unju.escmi.tp2.ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
        
        int a = 8, b = 3, c = -5;

       
        int resultadoA = a + b + c;
        System.out.println("a) " + resultadoA);

        int resultadoB = 2 * b + 3 * (a - c);
        System.out.println("b) " + resultadoB);

        double resultadoC = (double) a / b;
        System.out.println("c) " + resultadoC);

        int resultadoD = a % b;
        System.out.println("d) " + resultadoD);

        double resultadoE = (double) a / c;
        System.out.println("e) " + resultadoE);

        int resultadoF = a % c;
        System.out.println("f) " + resultadoF);

        int resultadoG = a * b / c;
        System.out.println("g) " + resultadoG);

        int resultadoH = a * (b / c);
        System.out.println("h) " + resultadoH);

        int resultadoI = (a * c) % b;
        System.out.println("i) " + resultadoI);

        int resultadoJ = a * (c % b);
        System.out.println("j) " + resultadoJ);

        int resultadoK = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("k) " + resultadoK);

        int resultadoL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("l) " + resultadoL);

        double resultadoM = (double)((a - 3 * b) % (c + 2 * a)) / (a - c);
        System.out.println("m) " + resultadoM);

        int resultadoN = a - b - c * 2;
        System.out.println("n) " + resultadoN);
    }
}
