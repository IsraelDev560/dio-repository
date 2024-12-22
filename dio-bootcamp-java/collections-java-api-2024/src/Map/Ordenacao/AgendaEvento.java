package Map.Ordenacao;


import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecera na data "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento evento = new AgendaEvento();
        evento.adicionarEvento(LocalDate.of(2024, Month.MAY, 15),"Evento 1" , "Pastel com os parça");
        evento.adicionarEvento(LocalDate.of(2024, Month.MAY, 20),"Evento 2" , "Caldo de cana");
        evento.adicionarEvento(LocalDate.of(2024, Month.MAY, 22),"Evento 3" , "Sorvete com a muié");
        evento.adicionarEvento(LocalDate.of(2024, 6, 9),"Evento 4" , "Churras");

        evento.exibirAgenda();
        evento.obterProximoEvento();

    }
}
