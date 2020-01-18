package design.demo4.example3.example2;



public class Schema2  extends AbstractFactory  {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(996);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(996);
    }
}
