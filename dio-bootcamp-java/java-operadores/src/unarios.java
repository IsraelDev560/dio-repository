public class unarios {
    public static void main(String[] artgs) {
        int numero = 5;

        numero = -numero;
        System.out.println(numero);// -5

        numero++;
        System.out.println(numero);// -4

        System.out.println(numero++); // -4

        System.out.println(numero); // -3
        numero = numero * -1; //transforma o número em positivo.
        System.out.println(++numero); // 4

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro); //false
    }

}
