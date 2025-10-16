import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ContadorVocales contador = new ContadorVocales();


        while (true) {
            System.out.println("Elige una opcion:\n" +
                    "1. Introducir texto\n" +
                    "2. Usar un archivo");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                System.out.println("Introduce el texto:");
                String texto = teclado.nextLine().toLowerCase();

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

                case 2:
                    Hilo ha = new Hilo("archivo.txt", 'a', contador);
                    Hilo he = new Hilo("archivo.txt", 'e', contador);
                    Hilo hi = new Hilo("archivo.txt", 'i', contador);
                    Hilo ho = new Hilo("archivo.txt", 'o', contador);
                    Hilo hu = new Hilo("archivo.txt", 'u', contador);
            }

        }


    }
}
