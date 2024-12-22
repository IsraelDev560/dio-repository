public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando o metodo main.");
        a();
        System.out.println("Finalizando o metodo main.");
    }
    static void a(){
        System.out.println("Iniciando o metodo a.");
        b();
        System.out.println("Finalizando o metodo a.");
    }
    static void b(){
        System.out.println("Iniciando o metodo b.");
        c();
        System.out.println("Finalizando o metodo b.");
    }
    static void c(){
        System.out.println("Iniciando o metodo c.");
        for(int i = 1; i <=4; i++){
            System.out.println("Teste no metodo c: "+i);
        }
        Thread.dumpStack();
        System.out.println("Finalizando o metodo c.");
    }
}