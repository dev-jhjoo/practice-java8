package MyLambda;

import javax.management.BadAttributeValueExpException;

public class LambdaCalculate {
    public void run() throws Exception {
        this.execute(2,3, CalculateType.ADD);
        this.execute(2,3, CalculateType.MULTI);
        this.execute(4,2, CalculateType.DIV);

    }

    private void execute(int a, int b, CalculateType type) throws Exception{
        switch (type) {
            case ADD -> {
                CalculateInterface add = (x, y) -> x + y;
                System.out.println(add.execute(a,b));
            }
            case SUB -> {
                CalculateInterface sub = (x, y) -> x - y;
                System.out.println(sub.execute(a,b));
            }
            case MULTI -> {
                CalculateInterface mul = (x, y) -> x * y;
                System.out.println(mul.execute(a,b));
            }
            case DIV -> {
                CalculateInterface div = (x, y) -> x / y;
                System.out.println(div.execute(a,b));
            }
            default -> {
                throw new BadAttributeValueExpException("Please check type");
            }
        }
    }
}
