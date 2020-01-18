package design.demo4.example4;

/**
 * GA的主板
 */
public class GAMainboard implements MainboardApi {
    /**
     * cpu插槽的孔数
     */
    private int cpuMoles = 0;

    public GAMainboard(int cpuMoles) {
        this.cpuMoles = cpuMoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in GAMainboard,cpuMoles= "+ cpuMoles);
    }
}
