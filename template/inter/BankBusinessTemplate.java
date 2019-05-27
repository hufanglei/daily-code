package template.inter;

public  class BankBusinessTemplate {
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


    //业务流程
    public void business(Action action){
        long nunmber = takeNumber();
        String evaluation = action.doAction(nunmber);
        saveEvaluation(nunmber, evaluation);
    }
}
