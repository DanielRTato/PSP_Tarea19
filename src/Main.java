public class Main {
    public static void main(String[] args) {

        ContadorVocales contador = new ContadorVocales();
        Hilo ha = new Hilo("asedefigihioojoujuuu", 'a', contador);
        Hilo he = new Hilo("asedefigihioojoujuuu", 'e', contador);
        Hilo hi = new Hilo("asedefigihioojoujuuu", 'i', contador);
        Hilo ho = new Hilo("asedefigihioojoujuuu", 'o', contador);
        Hilo hu = new Hilo("asedefigihioojoujuuu", 'u', contador);


        ha.start();
        he.start();
        hi.start();
        ho.start();
        hu.start();
    }
}
