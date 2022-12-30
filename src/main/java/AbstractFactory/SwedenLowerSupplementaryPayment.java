package AbstractFactory;

public class SwedenLowerSupplementaryPayment extends SwedenSupplementaryPayment{
    
    @Override
    public double calculate(double baseAmount) {
        return baseAmount*25/100;
    }
}
