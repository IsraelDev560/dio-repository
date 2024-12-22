// Modo condicional switch/case
import java.util.Locale;
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Tipos de plano BASIC, MIDIA E TURBO.");
        System.out.println("Digite o plano desejado(B, M OU T).");
        String plano = scanner.next();
        String ReceberMaicusculo = plano.toUpperCase();

        switch (ReceberMaicusculo) {
            case "T": {
                System.out.println("Plano: TURBO");
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Plano: MIDIA." );
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("Plano: BASIC");
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
