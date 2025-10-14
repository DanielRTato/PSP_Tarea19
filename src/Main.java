public class Main {
    public static void main(String[] args) {

        ContadorVocales contador = new ContadorVocales();
        Hilo h1 = new Hilo("aeioudfgha", 'a', contador);

        h1.start();
    }
}
