import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el texto:");
        String texto = teclado.nextLine().toLowerCase();

        ContadorVocales contador = new ContadorVocales();
        Hilo ha = new Hilo(texto, 'a', contador);
        Hilo he = new Hilo(texto, 'e', contador);
        Hilo hi = new Hilo(texto, 'i', contador);
        Hilo ho = new Hilo(texto, 'o', contador);
        Hilo hu = new Hilo(texto, 'u', contador);

        ha.start();
        he.start();
        hi.start();
        ho.start();
        hu.start();

        try {
            ha.join();
            he.join();
            hi.join();
            ho.join();
            hu.join();
        } catch (InterruptedException e) {
            System.out.println("Error en el join: " + e);
        }

        System.out.println("Número total de vocales: " + contador.getContadorVocales());
    }
}
