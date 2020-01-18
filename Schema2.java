package design.demo4.example4;

public class Schema2 implements AbstractFactory {
    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        if (type == 1) {
            retObj = new IntelCPU(936);
        } else if (type == 2) {
            retObj = new GAMainboard(936);
        }
        return retObj;
    }
}
