import java.io.File;

public class Hilo extends Thread {
    String texto;
    char vocal;
    ContadorVocales contador = null;
    File ruta;

    public Hilo(String texto, char vocal, ContadorVocales contador) {
        this.texto = texto;
        this.vocal = vocal;
        this.contador = contador;
    }

    public Hilo(File ruta, char vocal) {


    }

    public void run() {
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') contador.contarVocales();

        }
        System.out.println(contador.getContadorVocales());
    }
}
