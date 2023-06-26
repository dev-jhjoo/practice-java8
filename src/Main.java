import MyDateTime.DateTimeMain;
import MyFunctionalInterface.FunctionalInterfaceCalculate;
import MyLambda.LambdaMain;
import MyStream.StreamMain;

public class Main {
    public static void main(String[] args) throws Exception{
        new FunctionalInterfaceCalculate().run();
        new LambdaMain().run();
        new StreamMain().run();
        new DateTimeMain().run();
    }
}