package template;

public class LossCard extends BankBusinessTemplate {
    @Override
    protected String doAction(long number) {
        System.out.println("办理挂失的业务");
        return "四星好评";
    }
}
