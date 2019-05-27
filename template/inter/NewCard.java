package template.inter;

public class NewCard implements Action  {
    @Override
    public String doAction(long number) {
        System.out.println("办理开卡业务");
        return "五星好评";
    }
}
