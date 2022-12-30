package AbstractFactory;

public class SwedenHigherTax extends SwedenTax{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*25/100;
    }
}
