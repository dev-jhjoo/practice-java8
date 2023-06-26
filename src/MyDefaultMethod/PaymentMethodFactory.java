package MyDefaultMethod;

import javax.management.BadAttributeValueExpException;

public class PaymentMethodFactory{
    public PaymentMethod create(PaymentMethodEnum paymentMethod) throws Exception {
        switch (paymentMethod){
            case CASH -> {
                return new PaymentCash();
            }
            case CREDITCARD -> {
                return new PaymentCreditCard();
            }
            default -> throw new BadAttributeValueExpException("Please check payment method code");
        }
    }
}
