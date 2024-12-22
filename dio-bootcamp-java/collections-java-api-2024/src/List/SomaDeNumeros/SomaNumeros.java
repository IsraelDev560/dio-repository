package List.SomaDeNumeros;

public class SomaNumeros {
    private int numero;

    public SomaNumeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numero = " + numero +
                '}';
    }
}
