package design.demo4.example2;

/**
 * 装机工程师
 */
public class ComputerEngineer {
    /**
     * 定义组装机器需要的cpu
     */
    private CPUApi cpu = null;
    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard = null;

    /**
     * 装机过程
     * 客户选择所需cpu的类型
     * 客户选择所需主板的类型
     */
    public void makeComputer(int cpuType, int mainboardType){
        //1.准备好机器所需要的配件
        prepareHardware(cpuType, mainboardType);
        //2.z组装机器
        //3.测试机器
        //4.交付客户
    }

    /***
     * 准备装机所需要的配件
     * @param cpuType
     * @param mainboardType
     */
    private void prepareHardware(int cpuType, int mainboardType) {
        this.cpu = CPUFactory.createCPUApi(cpuType);
        this.mainboard = MainboardFactory.createMainboardApi(mainboardType);

        //测试下表配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }

}
