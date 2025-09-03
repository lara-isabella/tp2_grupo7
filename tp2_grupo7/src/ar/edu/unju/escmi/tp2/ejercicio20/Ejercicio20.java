package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        String textoOriginal = "Hoja";
        String textoModificado = textoOriginal.replace("ja", "la");

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + textoModificado); 
    }
}

/* Respueta:
 *  ¿Por qué el valor de textoOriginal no cambia después de llamar al método replace()?
 *      En Java, el métodos replace() se utiliza para crear una nueva cadena reemplazando caracteres o subcadenas. Es decir, el textoOriginal no cambio debido a que el metodo simplemente creo un nuevo string.
 */