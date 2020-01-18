package design.demo4.example3.example2;

/**
 * AMD cpu 实现类
 */
public class AMDCPU implements CPUApi {

    /**
     * cpu的针脚数目
     */
    private int pinis = 0;

    public AMDCPU(int pinis) {
        this.pinis = pinis;
    }

    @Override
    public void calculate() {
        System.out.println("now in intel CPU, pins=" + pinis);
    }
}
