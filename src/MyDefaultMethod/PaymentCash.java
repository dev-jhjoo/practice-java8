package MyDefaultMethod;

public class PaymentCash implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("Cash " + amount + "원 결제");
    }
}
