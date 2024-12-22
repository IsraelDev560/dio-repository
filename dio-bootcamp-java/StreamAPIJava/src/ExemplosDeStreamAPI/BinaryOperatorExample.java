package ExemplosDeStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum; // abreviada
        BinaryOperator<Integer> somar2 = (n1, n2) -> n1 + n2; // lambda

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado2 = numeros.stream()
                .reduce(0, Integer::sum); // abreviada
        int resultado = numeros.stream()
                .reduce(0, (n1, n2) -> n1 + n2); // lambda

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado); // usando lambda
        System.out.println("A soma dos números é: " + resultado2); // forma abreviada
        System.out.println("A soma dos números é: " + somar); // forma abreviada
        System.out.println("A soma dos números é: " + somar2); // usando lambda
    }
}