package MyDefaultMethod;

public enum PaymentMethodEnum {
    CASH("cash"),
    CREDITCARD("creditcard")
    ;

    private String paymentMethod;

    PaymentMethodEnum(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }
}
