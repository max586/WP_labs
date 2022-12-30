package AbstractFactory;

public class PolandLowerSupplementaryPayment extends PolandSupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*42/100;
    }
}
