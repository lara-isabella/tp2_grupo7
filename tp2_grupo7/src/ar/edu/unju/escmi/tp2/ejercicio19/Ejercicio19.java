package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "Hola";

        System.out.println("texto1 == texto2: " + (texto1 == texto2)); // v
        System.out.println("texto1.equals(texto2): " + texto1.equals(texto2)); // v

        String texto3 = new String("Hola");

        System.out.println("texto1 == texto3: " + (texto1 == texto3)); // f
        System.out.println("texto1.equals(texto3): " + texto1.equals(texto3)); // v
    }
}

/*
 * Respuestas:
 * ¿Por qué texto1 == texto2 devuelve true?
 *      La comparacion devuelve verdadero ya que ambos apuntan al mismo objeto en el String pool de Java.
 * ¿Por qué texto1 == texto3 devuelve false?
 *      Esta comparacion devuelve false, porque new String() crea un objeto nuevo en memoria.
 * ¿Qué sucede cuando se utiliza el método equals() para comparar los valores?
 *      Al usar el metodo equals(), se compara el contenido de los Strings, por eso devuelve verdadero aunque estén en distintas direcciones de memoria.
 */