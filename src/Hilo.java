import java.io.*;

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

    public Hilo(File ruta, char vocal, ContadorVocales contador) {
        this.vocal = vocal;
        this.contador = contador;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea = "";
            while ((linea =  br.readLine()) != null) {
                sb.append(linea).append(" ");

            }
            this.texto = sb.toString().toLowerCase();

        } catch (IOException e) {
            System.out.println("Error en el br: " + e);
        }
    }

    public void run() {
        for (char c : texto.toCharArray()) {
            if (vocal == c) contador.contarVocales();
        }
    }
}
