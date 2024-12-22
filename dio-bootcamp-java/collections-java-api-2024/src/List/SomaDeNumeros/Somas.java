package List.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class Somas {
    private List<SomaNumeros> somasList;

    public Somas(){
        this.somasList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        somasList.add(new SomaNumeros(numero));
    }
    public int calcularSoma(){
        int valorTotal = 0;
        for (SomaNumeros s : somasList){
            valorTotal += s.getNumero();
        }
        return valorTotal;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (SomaNumeros m : somasList) {
            if (m.getNumero() > maiorNumero) {
                maiorNumero = m.getNumero();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for(SomaNumeros mn: somasList){
            if (mn.getNumero() < menorNumero){
                menorNumero = mn.getNumero();
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(somasList);
    }

    public static void main(String[] args) {
        Somas soma = new Somas();

        soma.exibirNumeros();
        soma.adicionarNumero(5);
        soma.adicionarNumero(8);

        soma.exibirNumeros();

        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
    }

}
