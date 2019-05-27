package template.inter;

public class BankTemplateTest {

    public static void main(String[] args) {
        BankBusinessTemplate bankBusiness = new BankBusinessTemplate();
        Action action1 = new NewCard();
        bankBusiness.business(action1);
        Action action2 = new LossCard();
        bankBusiness.business(action2);
    }
}
