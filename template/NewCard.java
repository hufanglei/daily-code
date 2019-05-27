package template;


public class NewCard extends BankBusinessTemplate {
    @Override
    protected String doAction(long number) {
        System.out.println("办理开卡业务");
        return "五星好评";
    }
}
