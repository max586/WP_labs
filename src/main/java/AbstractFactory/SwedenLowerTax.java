package AbstractFactory;

public class SwedenLowerTax extends SwedenTax{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*15/100;
    }
}
