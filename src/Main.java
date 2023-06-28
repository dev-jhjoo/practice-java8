import MyDateTime.DateTimeMain;
import MyDefaultMethod.DefaultMethodMain;
import MyFunctionalInterface.FunctionalInterfaceCalculate;
import MyLambda.LambdaMain;
import MyOptional.OptionalMain;
import MyStream.StreamMain;

public class Main {
    public static void main(String[] args) throws Exception{
        new FunctionalInterfaceCalculate().run();
        new LambdaMain().run();
        new StreamMain().run();
        new DateTimeMain().run();
        new DefaultMethodMain().run();
        new OptionalMain().run();
    }
}