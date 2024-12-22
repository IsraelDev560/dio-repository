/**
 * Documentação para a classe SmartTV.
 * <p>
 * Esta classe representa uma SmartTV com funcionalidades como ligar, desligar, ajustar volume e canal.
 * <p>
 * Para utilizar esta classe, consulte a documentação cuidadosamente.
 *
 * @author Israel
 * @version 1.0
 * @since 04/05/2024
 */
public class SmartTv {
    /**
     * Construtor da classe SmartTV.
     *
     * @param estadoTv Estado atual da TV (ligada/desligada)
     * @param canal Canal atual da TV
     * @param volume Volume atual da TV
     */
    boolean estadoTv = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        estadoTv = true;
    }
    public void desligar(){
        estadoTv = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para o: "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para o: "+canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para o " + canal);
    }
}