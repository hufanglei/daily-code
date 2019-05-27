package template;

public abstract class BankBusinessTemplate {
    //取号
    protected long takeNumber(){
        int r = (int) (Math.random() * 1000);
        long number = System.currentTimeMillis() + r;
        return number;
    }
    //保存客户反馈
    protected void saveEvaluation(long number, String evaluation){
        System.out.println("号码: "+ number+ "的评价是: "+ evaluation);
    }
    //具体的业务，声明抽象方法，交给子类来做
    protected abstract  String doAction(long number);

    //业务流程
    public void business(){
        long nunmber = takeNumber();
        String evaluation = doAction(nunmber);
        saveEvaluation(nunmber, evaluation);
    }
}
