import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            ContadorVocales contador = new ContadorVocales();

            System.out.println("Elige una opcion:\n" +
                    "1. Introducir texto\n" +
                    "2. Usar un archivo\n" +
                    "3. Salir");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    contador.setContadorVocales(0);
                    System.out.println("Introduce el texto:");
                    String texto = teclado.nextLine().toLowerCase();

                    Hilo ha = new Hilo(texto, 'a', contador);
                    Hilo he = new Hilo(texto, 'e', contador);
                    Hilo hi = new Hilo(texto, 'i', contador);
                    Hilo ho = new Hilo(texto, 'o', contador);
                    Hilo hu = new Hilo(texto, 'u', contador);

                    ha.start(); he.start(); hi.start(); ho.start();  hu.start();

                    try {
                        ha.join(); he.join(); hi.join(); ho.join(); hu.join();

                    } catch (InterruptedException e) {
                        System.out.println("Error en el join: " + e);
                    }
                    System.out.println("Número total de vocales: " + contador.getContadorVocales());
                    System.out.println("--------------------------------------------------------");
                    break;

                 case 2:
                     System.out.println("Introduce la ruta del archivo");
                     File archivo = new File(teclado.nextLine());

                    if (!archivo.exists()){
                        System.out.println("No existe");
                        break;
                    }

                     contador.setContadorVocales(0);

                    Hilo hA = new Hilo(archivo, 'a', contador);
                    Hilo hE = new Hilo(archivo, 'e', contador);
                    Hilo hI = new Hilo(archivo, 'i', contador);
                    Hilo hO = new Hilo(archivo, 'o', contador);
                    Hilo hU = new Hilo(archivo, 'u', contador);

                    hA.start(); hE.start();  hI.start(); hO.start(); hU.start();

                    try {
                        hA.join(); hE.join(); hI.join();  hO.join();   hU.join();

                    } catch (InterruptedException e) {
                        System.out.println("Error en el join: " + e);
                    }
                    System.out.println("Número total de vocales: " + contador.getContadorVocales());
                    System.out.println("--------------------------------------------------------");
                    break;

                 case 3:
                    System.out.println("Cerrando la aplicación");
                    return;

                default:
                    System.out.println("Opción equivocada");
            }



        }


    }
}
