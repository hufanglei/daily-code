package proxy;

public class RealSubject implements Subject {
    @Override
    public void work() {
        System.out.println("RealSubject work");
    }
}
