package one.digitalinnovatione.gof.facade.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "FSA";
    }
    public String recuperarEstado(String estado){
        return "BA";
    }
}
