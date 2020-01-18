package design.demo4.example2;

public class CPUFactory {

    public static CPUApi createCPUApi(int type){
        CPUApi cpu = null;
        if (type == 1){
            cpu = new IntelCPU(1156);
        }else if (type == 2){
            cpu = new AMDCPU(939);
        }
        return cpu;
    }
}
