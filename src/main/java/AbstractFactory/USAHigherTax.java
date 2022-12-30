package AbstractFactory;

public class USAHigherTax extends USATax{

    @Override
    public double calculate(double baseAmount) {
        return baseAmount*40/100;
    }
}
