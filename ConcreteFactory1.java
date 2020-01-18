package design.demo4.example1;

/**
 * 具体的工厂实现类，实现创建具体的产品对象的操作
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
