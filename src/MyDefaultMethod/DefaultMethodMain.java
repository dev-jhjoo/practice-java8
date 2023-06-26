package MyDefaultMethod;

import javax.management.BadAttributeValueExpException;

public class DefaultMethodMain {

    PaymentMethodFactory factory = new PaymentMethodFactory();

    public void run() throws Exception {
        System.out.println("DefaultMethodMain start");
        PaymentMethod cash = this.factory.create(PaymentMethodEnum.CASH);
        cash.pay(10000);

        PaymentMethod creditCard = this.factory.create(PaymentMethodEnum.CREDITCARD);
        creditCard.pay(24000);

    }
}
