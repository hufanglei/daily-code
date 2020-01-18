package design.demo4.example3.example2;


public class Schema1 extends AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1136);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1136);
    }
}
