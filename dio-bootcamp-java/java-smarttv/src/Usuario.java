/**
 * Documentação para a classe Usuario.
 * <p>
 * Esta classe representa a visualização dos usuários de uma SmartTV, demonstrando seu uso.
 * Para utilizar esta classe, consulte a documentação cuidadosamente.
 * <p>
 * Esta classe contém um método main que demonstra o uso das funcionalidades de uma SmartTV, como ligar,
 * desligar, ajustar volume e canal.
 *
 * @author Israel
 * @version 1.0
 * @since 04/05/2024
 */
public class Usuario {
    /**
     * Método principal para demonstrar o uso da SmartTV.
     *
     * @param args Os argumentos da linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        // Cria uma instância de SmartTv
        SmartTv smartTv = new SmartTv();

        // Exibe o estado inicial da TV
        System.out.println("Tv ligada? " + smartTv.estadoTv);

        // Liga a TV e exibe o novo status
        smartTv.ligar();
        System.out.println("Novo Status Da Tv -> " + smartTv.estadoTv);

        // Exibe o canal e volume iniciais da TV
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // Ajusta o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // Muda o canal
        smartTv.mudarCanal(13);

        // Aumenta e diminui o canal
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        // Desliga a TV e exibe o novo status
        smartTv.desligar();
        System.out.println("Novo Status Da Tv -> " + smartTv.estadoTv);
    }
}