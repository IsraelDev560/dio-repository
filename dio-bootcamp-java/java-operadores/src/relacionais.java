public class relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        int n1 = 2;
        int n2 = 3;

        boolean simNao = n1 == n2;

        System.out.println("Numero 1 é igual Numero 2? " + simNao);

        simNao = n1 != n2;

        System.out.println("Numero 1 é diferente de Numero 2? " + simNao);

        String nome1 = "Ronaldo";
        String nome2 = "Ronaldo";

        System.out.println(nome1 == nome2);

        nome2 = new String("Ronaldo");
        System.out.println(nome1.equals(nome2)); // 'equals' recomendado para comparar objetos

    }
}
