package design.demo4.example2;

/**
 * 创建主板的简单工厂
 */
public class MainboardFactory {
    public static MainboardApi createMainboardApi(int type){
        MainboardApi mainboardApi = null;
        if (type == 1){
            mainboardApi = new GAMainboard(1156);
        }else if (type == 2){
            mainboardApi = new MSIMainboard(939);
        }
        return mainboardApi;
    }
}
