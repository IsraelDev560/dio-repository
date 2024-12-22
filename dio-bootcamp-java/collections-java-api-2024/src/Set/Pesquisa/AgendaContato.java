package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContato contato = new AgendaContato();

        contato.exibirContatos();
        contato.adicionarContato("Israel" ,555);
        contato.adicionarContato("José" ,546);
        contato.adicionarContato("Vitoria" ,556);
        contato.adicionarContato("Vitoria" ,546);
        contato.exibirContatos();

        System.out.println(contato.pesquisarPorNome("Vitoria"));
        System.out.println(contato.atualizarNumeroContato("Israel", 556));
    }
}
