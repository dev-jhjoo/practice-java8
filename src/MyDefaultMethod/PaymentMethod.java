package MyDefaultMethod;

import javax.management.BadAttributeValueExpException;

public interface PaymentMethod {
    default void printDesc(){
        System.out.println("This is Default method");
    }

    void pay(int amount);
}
