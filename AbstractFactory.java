package design.demo4.example1;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 */
public abstract class AbstractFactory {

    /**
     * 创建抽象产品A的对象
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建抽象产品B的对象
     * @return
     */
    public abstract AbstractProductB createProductB();

}
