package AbstractFactory;

public class PolandHigherSupplementaryPayment extends PolandSupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*42/100;
    }
}
