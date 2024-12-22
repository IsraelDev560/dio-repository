import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularMedia{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Roberto", "Jurandir", "Paulo", "Carla"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }
    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        try {
            for (String aluno : alunos){
                System.out.printf("Nota do aluno %s: ", aluno);
                double nota = scanner.nextDouble();
                soma+= nota;
            }
        }
        catch (InputMismatchException a){
            System.out.println("Digite apenas números.");
        }

        return soma / alunos.length;
    }
}