
public class ExemploForEach {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada //forEach
        // a cada execução os valores de 'alunos' serão atribuidos a 'aluno'
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: "+aluno);
        }

    }
}