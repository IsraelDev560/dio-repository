import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor, digite o número da sua conta:");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        scanner.nextLine();
        String NomeCliente = scanner.nextLine();
        String NomeMaiusculo = NomeCliente.toUpperCase();

        System.out.println("Por favor, deposite uma quantia:");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeMaiusculo + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
