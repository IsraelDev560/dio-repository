import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao de mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIsrael = new Dev();
        devIsrael.setNome("Israel");
        devIsrael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: "+devIsrael.getNome() + "\n"+devIsrael.getConteudosInscritos());
        devIsrael.progedir();
        devIsrael.progedir();
        devIsrael.progedir();
        System.out.println("Conteudos Concluidos: "+devIsrael.getNome() + "\n"+devIsrael.getConteudosConcluidos());
        System.out.println("XP:"+ devIsrael.calcularXp());

        System.out.println("-----------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: " +devCarlos.getNome() +"\n"+ devCarlos.getConteudosInscritos());
        devCarlos.progedir();
        System.out.println("Conteudos concluidos: " +devCarlos.getNome() + "\n"+ devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularXp());
    }
}