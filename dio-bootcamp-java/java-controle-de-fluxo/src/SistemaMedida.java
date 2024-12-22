// Modo condicional switch / case
import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite (P,M OU G)");
        String sigla = scanner.next();
        String SiglaMaicuscula = sigla.toUpperCase();

        switch (SiglaMaicuscula) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}

