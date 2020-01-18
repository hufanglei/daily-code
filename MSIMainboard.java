package design.demo4.example3.example2;

/**
 * 微星的主板
 */
public class MSIMainboard implements MainboardApi {

    private int cpuHoles = 0;


    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard,cpuMoles= "+ cpuHoles);
    }
}
