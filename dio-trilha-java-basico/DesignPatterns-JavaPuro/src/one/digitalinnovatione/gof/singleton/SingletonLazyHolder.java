package one.digitalinnovatione.gof.singleton;
/*
 * Singleton "Lazy Holder"
 * @author falvojr
 */

public class SingletonLazyHolder {

    private static class InstaceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstaceHolder.instancia;
    }
}
