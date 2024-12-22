public class Metodo1 {
    public int somar(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }

    public void imprimir(int resultado) {
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Metodo1 calculadora = new Metodo1();
        int num1 = 25;
        int num2 = 15;
        int resultado = calculadora.somar(num1, num2);
        calculadora.imprimir(resultado);
    }
}
