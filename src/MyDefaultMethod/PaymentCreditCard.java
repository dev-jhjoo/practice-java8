package MyDefaultMethod;

public class PaymentCreditCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("CreditCard " + amount + "원 결제");
    }
}
