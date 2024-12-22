import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cases {
    public static void main(String[] args) {
        selecaoCandidatos();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }
    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato n° "+ (i + 1) + " é: "+ candidatos[i]);
        }
        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi: "+ candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            if (salarioPretendido > salarioBase){
                System.out.println("O candidato "+ candidato + " NÃO foi selecionado para vaga, salario pretendido "+ Math.round(salarioPretendido));
            }else {
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga, salario pretendido: " + Math.round(salarioPretendido));
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        System.out.println("Total de selecionados: " + candidatosSelecionados);
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CADIDATO COM A CONTRA PROPOSTA");
        } else {
            System.out.println(" AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}