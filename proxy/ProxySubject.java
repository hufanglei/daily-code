package proxy;

public class ProxySubject implements Subject{
    private RealSubject realSubject ;


    public ProxySubject() {
        realSubject = new RealSubject();
    }

    @Override
    public void work() {
        System.out.println("before work");
        realSubject.work();;
        System.out.println("after work");
    }

    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject();
        proxySubject.work();
    }
}
