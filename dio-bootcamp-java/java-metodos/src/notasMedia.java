//public class notasMedia {
//    public static void main (String[] args){
//        int nota1 = 5;
//        int nota2 = 8;
//        int nota3 = 6;
//        int nota4 = 6;
//        int soma = nota1+nota2+nota3+nota4;
//        int media = soma / 4;
//        if (media >= 6){
//            System.out.println("Aluno aprovado nota: "+media);
//        } else {
//            System.out.println("Aluno Reprovado nota: "+media);
//        }
//    }
//}

public class notasMedia {
    public static void main(String[] args) {
        int mediafinal = 7;
        if (mediafinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediafinal == 6) {
            System.out.println("prova minerva");
        } else {
            System.out.println("APROVADO");
        }
    }
}
