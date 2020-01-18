package design.demo4.example4;



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
     * 内存
     */
    private MemoryApi memoryApi;

    /**
     * 装机过程
     * 客户选择所需cpu的类型
     * 客户选择所需主板的类型
     */
    public void makeComputer(AbstractFactory schema){
        //1.准备好机器所需要的配件
        prepareHardware(schema);
        //2.z组装机器
        //3.测试机器
        //4.交付客户
    }


    private void prepareHardware(AbstractFactory schema) {
        this.cpu = (CPUApi) schema.createProduct(1);
        this.mainboard = (MainboardApi) schema.createProduct(2);
        this.memoryApi = (MemoryApi) schema.createProduct(3);
        //测试下表配件是否好用
        this.cpu.calculate();
        this.mainboard.installCPU();
        this.memoryApi.cacheData();
    }

}
