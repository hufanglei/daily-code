package template.inter;

public class LossCard implements Action {
    @Override
    public String doAction(long number) {
        System.out.println("办理挂失的业务");
        return "四星好评";
    }
}
