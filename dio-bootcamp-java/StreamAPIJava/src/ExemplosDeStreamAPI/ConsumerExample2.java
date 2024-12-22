package ExemplosDeStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeros = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };
        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeros);

        //lambda
        System.out.println("-----------------");
        numeros.stream().filter(n -> n % 2 == 0)
        .forEach(System.out::println);

        // lambda
        System.out.println("-----------------");
        numeros.stream().forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}
