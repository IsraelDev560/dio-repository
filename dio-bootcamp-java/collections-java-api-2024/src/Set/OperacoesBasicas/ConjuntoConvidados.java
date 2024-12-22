package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
       ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Existem "+ convidados.contarConvidados() + " Convidados dentro do Set de convidados.");
        convidados.adicionarConvidado("Israel" , 255);
        convidados.adicionarConvidado("Carlos" , 244);
        convidados.adicionarConvidado("André" , 256);
        convidados.adicionarConvidado("Robert" , 255);
        System.out.println("Existem "+ convidados.contarConvidados() + " Convidados dentro do Set de convidados.");

        convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigoConvite(255);
        convidados.exibirConvidados();
    }
}
