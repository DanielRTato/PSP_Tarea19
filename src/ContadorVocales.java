public class ContadorVocales {
    private int contadorVocales = 0;

    public synchronized int contarVocales() {
        return contadorVocales += 1;
    }

    public int getContadorVocales() {
        return contadorVocales;
    }

    public void setContadorVocales(int contadorVocales) {
        this.contadorVocales = contadorVocales;
    }
}
